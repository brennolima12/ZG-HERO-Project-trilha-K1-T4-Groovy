static void main(String[] args) {

    def candidatos = [
            new Pessoa("João Silva", "joao.silva@example.com", "12345678901", 28, "SP", "01001-000", "Profissional dedicado com experiência em desenvolvimento backend.", ["Java","Spring Boot","SQL","Git"]),
            new Pessoa("Maria Oliveira", "maria.oliveira@example.com", "98765432100", 32, "RJ", "20040-020", "Analista de sistemas com foco em soluções escaláveis.", ["Python","Django","Docker","Kubernetes"]),
            new Pessoa("Carlos Pereira", "carlos.pereira@example.com", "45678912399", 25, "MG", "30140-071", "Recém-formado em ciência da computação, apaixonado por IA.", ["Machine Learning","TensorFlow","Pandas","Linux"]),
            new Pessoa("Ana Souza", "ana.souza@example.com", "85274196355", 29, "RS", "90010-320", "Engenheira de software com experiência em frontend moderno.", ["JavaScript","React","Node.js","CSS"]),
            new Pessoa("Pedro Lima", "pedro.lima@example.com", "74185296300", 35, "PE", "50010-040", "Gestor de projetos com forte background em metodologias ágeis.", ["Scrum","Kanban","Jira","Comunicação"])
    ]

    def empresas = [
            new Empresa("Tech Solutions LTDA", "contato@techsolutions.com", "12345678000195", "Brasil", "SP", "04567-000", "Empresa de tecnologia focada em soluções de software corporativo.", ["Java","Spring","SQL","Cloud"]),
            new Empresa("Global Data Corp", "info@globaldata.com", "98765432000110", "Brasil", "RJ", "20031-050", "Consultoria internacional especializada em análise de dados e Big Data.", ["Python","Spark","Hadoop","ETL"]),
            new Empresa("Inova Health", "contato@inovahealth.com", "45678912000177", "Brasil", "MG", "30140-110", "Startup da área de saúde digital com foco em telemedicina.", ["IA","Machine Learning","APIs REST","Segurança da Informação"]),
            new Empresa("WebX Agency", "suporte@webxagency.com", "85274196000133", "Brasil", "RS", "90010-200", "Agência de desenvolvimento web e marketing digital.", ["JavaScript","React","Node.js","UX/UI"]),
            new Empresa("AgroFuture", "contato@agrofuture.com", "74185296000144", "Brasil", "PE", "50030-060", "Empresa voltada para soluções tecnológicas no agronegócio.", ["IoT","Automação","Sensores","Blockchain"])
    ]

    while (true) {
        println "1 - Listar Candidatos"
        println "2 - Listar Empresas"
        println "3 - Cadastrar Candidato"
        println "4 - Cadastrar Empresa"
        println "0 - Sair"
        print "Escolha uma opção: "

        def reader = System.in.newReader()
        def opcao = reader.readLine()

        switch (opcao) {
            case "1":
                candidatos.each { println it }
                break
            case "2":
                empresas.each { println it }
                break
            case "3":
                Cadastro.cadastrarCandidato(reader, candidatos)
                break
            case "4":
                Cadastro.cadastrarEmpresa(reader, empresas)
                break
            case "0":
                System.exit(0)
            default:
              print "\n"
        }

    }

}

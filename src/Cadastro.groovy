class Cadastro {

    static void cadastrarCandidato(reader, candidatos) {
        println "\n--- Cadastro de Candidato ---"
        print "Nome: "
        def nome = reader.readLine()
        print "Email: "
        def email = reader.readLine()
        print "CPF: "
        def cpf = reader.readLine()
        print "Idade: "
        def idade = reader.readLine().toInteger()
        print "Estado: "
        def estado = reader.readLine()
        print "CEP: "
        def cep = reader.readLine()
        print "Descrição pessoal: "
        def descricao = reader.readLine()
        print "Competências: "
        def competencias = reader.readLine().split(",").collect { it.trim() }

        candidatos << new Pessoa(nome, email, cpf, idade, estado, cep, descricao, competencias)
        println "Candidato cadastrado(a)"
    }

    static void cadastrarEmpresa(reader, empresas) {
        println "\n--- Cadastro de Empresa ---"
        print "Nome: "
        def nome = reader.readLine()
        print "Email corporativo: "
        def email = reader.readLine()
        print "CNPJ: "
        def cnpj = reader.readLine()
        print "País: "
        def pais = reader.readLine()
        print "Estado: "
        def estado = reader.readLine()
        print "CEP: "
        def cep = reader.readLine()
        print "Descrição da empresa: "
        def descricao = reader.readLine()
        print "Competências esperadas: "
        def competencias = reader.readLine().split(",").collect { it.trim() }

        empresas << new Empresa(nome, email, cnpj, pais, estado, cep, descricao, competencias)
        println "Empresa cadastrada"
    }
}

class Pessoa {
    String nome
    String email
    String cpf
    Integer idade
    String estado
    String cep
    String descricaoPessoal
    List<String> competencias = []

    Pessoa(String nome, String email, String cpf, Integer idade, String estado,
           String cep, String descricaoPessoal, List<String> competencias) {
        this.nome = nome
        this.email = email
        this.cpf = cpf
        this.idade = idade
        this.estado = estado
        this.cep = cep
        this.descricaoPessoal = descricaoPessoal
        this.competencias = competencias
    }



    @Override
    String toString() {
        return """
        Nome: $nome
        Email: $email
        CPF: $cpf
        Idade: $idade
        Estado: $estado
        CEP: $cep
        Descrição: $descricaoPessoal
        Competências: ${competencias.join(', ')}
        """.stripIndent()
    }
}

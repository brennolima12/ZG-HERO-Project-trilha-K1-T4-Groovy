class Empresa {
    String nome
    String emailCorporativo
    String cnpj
    String pais
    String estado
    String cep
    String descricaoEmpresa
    List<String> competenciasEsperadas = []

    Empresa(String nome, String emailCorporativo, String cnpj, String pais,
            String estado, String cep, String descricaoEmpresa, List<String> competenciasEsperadas) {
        this.nome = nome
        this.emailCorporativo = emailCorporativo
        this.cnpj = cnpj
        this.pais = pais
        this.estado = estado
        this.cep = cep
        this.descricaoEmpresa = descricaoEmpresa
        this.competenciasEsperadas = competenciasEsperadas
    }



    @Override
    String toString() {
        return """
        Nome: $nome
        E-mail Corporativo: $emailCorporativo
        CNPJ: $cnpj
        País: $pais
        Estado: $estado
        CEP: $cep
        Descrição: $descricaoEmpresa
        Competências Esperadas: ${competenciasEsperadas.join(', ')}
        """.stripIndent()
    }
}
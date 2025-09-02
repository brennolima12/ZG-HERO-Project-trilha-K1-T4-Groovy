import org.junit.jupiter.api.Test

class CadastroTest {

    @Test
    void testPrimeiroCandidato() {
        def candidatos = [
                new Pessoa("João Silva", "joao.silva@example.com", "12345678901", 28, "SP", "01001-000",
                        "Profissional dedicado com experiência em desenvolvimento backend.", ["Java","Spring Boot","SQL","Git"])
        ]

        assert candidatos.size() == 1
        assert candidatos[0].nome == "João Silva"
        assert candidatos[0].email == "joao.silva@example.com"
        assert candidatos[0].cpf == "12345678901"
    }

    @Test
    void testPrimeiraEmpresa() {
        def empresas = [
                new Empresa("Tech Solutions LTDA", "contato@techsolutions.com", "12345678000195", "Brasil", "SP", "04567-000",
                        "Empresa de tecnologia focada em soluções de software corporativo.", ["Java","Spring","SQL","Cloud"])
        ]

        assert empresas.size() == 1
        assert empresas[0].nome == "Tech Solutions LTDA"
        assert empresas[0].emailCorporativo == "contato@techsolutions.com"
    }

    @Test
    void testCadastrarNovoCandidato() {
        def candidatos = []
        def input = new StringReader(
                "Novo Candidato\nnovocandidato@test.com\n000\n00\nPE\n0000-000\nDev\nJava\n"
        )

        Cadastro.cadastrarCandidato(input, candidatos)

        assert candidatos.size() == 1
        assert candidatos[0].nome == "Novo Candidato"
        assert candidatos[0].email == "novocandidato@test.com"
    }

    @Test
    void testCadastrarNovaEmpresa() {
        def empresas = []
        def input = new StringReader(
                "Nova Empresa\nnovaempresa@email.com\n0000000\nBrasil\nPE\n000000\nEmpresa de tecnologia\nKotlin\n"
        )

        Cadastro.cadastrarEmpresa(input, empresas)

        assert empresas.size() == 1
        assert empresas[0].nome == "Nova Empresa"
        assert empresas[0].emailCorporativo == "novaempresa@email.com"
    }
}

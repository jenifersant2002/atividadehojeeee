
package atividadehoje0104;


public enum UnidadeFederativa {
    
    BAHIA("Bahia", "BA"),
    SAO_PAULO("Sao Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
    ACRE("Acre", "AC"),
    AMAPÁ("Amapa", "AP"),
    ALAGOAS("Alagoas", "AL"),
    AMAZONAS("Amazonas", "AM"),
    CEARA("Ceara", "CE"),
    ESPIRITO_SANTO("Espirito_Santo", "ES"),
    GOIAS("Goias", "GO"),
    MARANHAO("Maranhao", "MA"),
    MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS"),
    MATO_GROSSO("Mato Grosso", "MT"),
    MINAS_GERAIS("Minas Gerais", "MG"),
    PARA("Para", "PA"),
    PARAIBA("Paraiba", "PB"),
    PARANA("Parana", "PR"),
    PERNAMBUCO("Pernambuco", "PE"),
    PIAUI("Piaui", "PI"),
    RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN"),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS"),
    RONDONIA("Rondonia", "RO"),
    RORAIMA("Roraima", "RR"),
    SANTA_CATARINA("Santa Catarina", "SC"),
    SERGIPE("Sergipe","SE"),
    TOCANTINS("Tocantins", "TO"),
    DISTRITO_FEDERAL("Distrito Federal", "DF");
           
           
     protected String nome;
     protected String sigla;
     
    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

}


package atividadehoje0104;


public enum EstadoCivil {
    
   SOLTEIRO("solteiro"),
   CASADO("casado"),
   SEPARADO("separado"),
   DIVORCIADO("divorciado"),
   VIUVO("viuvo");
   
   protected String texto;

    private EstadoCivil(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
   
   
}

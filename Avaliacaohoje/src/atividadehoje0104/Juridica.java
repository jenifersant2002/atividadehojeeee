package atividadehoje0104;


public abstract class Juridica extends Pessoa{
    
    protected String cnpj;
    protected String inscricaoEstadual;

    public Juridica() {
    }

    public Juridica(String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereço endereço) {
        super(id, nome, telefone, email, endereço);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    
}

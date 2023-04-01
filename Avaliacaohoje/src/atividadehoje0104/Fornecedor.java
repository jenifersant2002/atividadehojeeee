package atividadehoje0104;


public class Fornecedor extends Juridica{
    
    private String produto;

    public Fornecedor() {
    }

    public Fornecedor(String produto, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereço endereço) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereço);
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "produto=" + produto + '}';
    }
    
    
}

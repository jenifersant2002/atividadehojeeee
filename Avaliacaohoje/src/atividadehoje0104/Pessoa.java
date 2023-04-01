package atividadehoje0104;

public abstract class Pessoa {
    
    protected int id;
    protected String nome; 
    protected String telefone;
    protected String email;
    protected Endereço endereço;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String telefone, String email, Endereço endereço) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereço = endereço;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }
            
    
}

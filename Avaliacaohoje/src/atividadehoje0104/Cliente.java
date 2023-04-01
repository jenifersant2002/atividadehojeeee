
package atividadehoje0104;

import java.time.LocalDate;


public class Cliente extends Fisica{
    
    private int protocoloAtendimento;

    public Cliente() {
    }

    public Cliente(int protocoloAtendimento, EstadoCivil estadocivil, Genero genero, LocalDate datanascimento, int id, String nome, String telefone, String email, Endereço endereço) {
        super(estadocivil, genero, datanascimento, id, nome, telefone, email, endereço);
        this.protocoloAtendimento = protocoloAtendimento;
    }
  
    @Override
    public String toString() {
        return  "\ngenero: " + super.genero.texto +
                "\ndatanascimento: " + super.getDataNascimento() +
                "\nidade: " + super.getIdade() +
                "\nestadocivil: " + super.estadocivil.texto +
                "\nlogradouro: " + super.endereço.logradouro +
                "\nemail: " + super.email +
                "\ntelefone: " + super.telefone +
                "\nid: " + super.id +
                "\nnome: " + super.nome +
                "\ncidade: " + super.endereço.cidade +
                "\ncomplemento: " + super.endereço.complemento +
                "\ncep: " + super.endereço.cep +
                "\nnumero: " + super.endereço.numero +
                "\nunidadefederativa: " + super.endereço.unidadeFederativa.nome;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
    
}
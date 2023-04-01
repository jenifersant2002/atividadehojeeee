package atividadehoje0104;

import java.time.LocalDate;


public class Advogado extends Funcionario{
    
    private String OAB;

    public Advogado() {
    }

    public Advogado(String OAB, String cpf, String rg, String matricula, Setor setor, double salario, EstadoCivil estadocivil, Genero genero, LocalDate datanascimento, int id, String nome, String telefone, String email, Endereço endereço) {
        super(cpf, rg, matricula, setor, salario, estadocivil, genero, datanascimento, id, nome, telefone, email, endereço);
        this.OAB = OAB;
    }

    

      @Override
    public String toString() {
        return "\nrg: " + super.rg +  
               "\ncpf: " + super.cpf +
               "\nmatricula: " + super.matricula +
               "\nsetor: " + super.setor.texto +
               "\ngenero: " + super.genero.texto + 
               "\nsalario: " + super.salario +
               "\nestadocivil: " + super.estadocivil.texto +
               "\ndatanascimento: " + super.getDataNascimento() +  
               "\nidade: " + super.getIdade() +
               "\nOAB: " + this.OAB +
               "\nid:" + super.id +
               "\nnome: " + super.nome +
               "\nlogradouro: " + super.endereço.logradouro +
               "\nnumero: " + super.endereço.numero +
               "\ncomplemento: " + super.endereço.complemento +
               "\ncep: " + super.endereço.cep +
               "\nunidadefederativa: " + super.endereço.unidadeFederativa.nome +
               "\ncidade: " + super.endereço.cidade +
               "\ntelefone: " + super.telefone +
               "\nemail: " + super.email;
   
    }

    public String getOAB() {
        return OAB;
    }

    public void setOAB(String OAB) {
        this.OAB = OAB;
    }
   
   
   

    
}

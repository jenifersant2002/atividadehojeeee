package atividadehoje0104;

import java.time.LocalDate;


public class Medico extends Funcionario{
    
   private String CRM;

    public Medico() {
    }

    public Medico(String CRM, String cpf, String rg, String matricula, Setor setor, double salario, EstadoCivil estadocivil, Genero genero, LocalDate datanascimento, int id, String nome, String telefone, String email, Endereço endereço) {
        super(cpf, rg, matricula, setor, salario, estadocivil, genero, datanascimento, id, nome, telefone, email, endereço);
        this.CRM = CRM;
    }

   
    @Override
    public String toString() {
        return "\nrg: " + super.rg +  
               "\ncpf: " + super.cpf +
               "\nmatricula: " + super.matricula +
               "\nsetor: " + super.setor.texto +
               "\nsalario: " + super.salario +
               "\nestadocivil: " + super.estadocivil.texto +
               "\nCRM: " + this.CRM +
               "\nid:" + super.id +
               "\nnome: " + super.nome +
               "\nlogradouro: " + super.endereço.logradouro +
               "\nnumero: " + super.endereço.numero +
               "\ncomplemento: " + super.endereço.complemento +
               "\ncep: " + super.endereço.cep +
               "\nunidadefederativa: " + super.endereço.unidadeFederativa.nome +
               "\ncidade: " + super.endereço.cidade +
               "\ntelefone: " + super.telefone +
               "\ndatanascimento: " + super.getDataNascimento() +
               "\nidade: " + super.getIdade() +
               "\ngenero: " + super.genero.texto + 
               "\nemail: " + super.email;
   
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }


   

   
  
}

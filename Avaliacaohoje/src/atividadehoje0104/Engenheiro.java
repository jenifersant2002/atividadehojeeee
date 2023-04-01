package atividadehoje0104;

import java.time.LocalDate;


public class Engenheiro extends Funcionario{
    
    private String CREA;

    public Engenheiro() {
    }

    public Engenheiro(String CREA, String cpf, String rg, String matricula, Setor setor, double salario, EstadoCivil estadocivil, Genero genero, LocalDate datanascimento, int id, String nome, String telefone, String email, Endereço endereço) {
        super(cpf, rg, matricula, setor, salario, estadocivil, genero, datanascimento, id, nome, telefone, email, endereço);
        this.CREA = CREA;
    }


     @Override
    public String toString() {
        return "\nrg: " + super.rg +  
               "\ncpf: " + super.cpf +
               "\nmatricula: " + super.matricula +
               "\nsetor: " + super.setor.texto +
               "\nsalario: " + super.salario +
               "\nestadocivil: " + super.estadocivil.texto +
               "\ndatanascimento: " + super.getDataNascimento()+ 
               "\nidade: " + super.getIdade() +
               "\ngenero: " + super.genero.texto + 
               "\nCREA: " + this.CREA +
               "\nid:" + super.id +
               "\nnome: " + super.nome +
               "\nlogradouro: " + super.endereço.logradouro +
               "\nnumero: " + super.endereço.numero +
               "\ncomplemento: " + super.endereço.complemento +
               "\ncep: " + super.endereço.cep +
               "\ncidade: " + super.endereço.cidade +
               "\nemail: " + super.email +
               "\nunidadefederativa: " + super.endereço.unidadeFederativa.nome + 
               "\ntelefone: " + super.telefone;
    }

    public String getCREA() {
        return CREA;
    }

    public void setCREA(String CREA) {
        this.CREA = CREA;
    }

   

   
    }


   

    
   
        
    
    
    
    
    
    

    
 



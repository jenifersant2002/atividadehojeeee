package atividadehoje0104;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public abstract class Fisica extends Pessoa{
    
    protected EstadoCivil estadocivil;
    protected Genero genero;
    protected LocalDate datanascimento;

    public Fisica() {
    }

    public Fisica(EstadoCivil estadocivil, Genero genero, LocalDate datanascimento, int id, String nome, String telefone, String email, Endereço endereço) {
        super(id, nome, telefone, email, endereço);
        this.estadocivil = estadocivil;
        this.genero = genero;
        this.datanascimento = datanascimento;
    }

   
    public EstadoCivil getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(EstadoCivil estadocivil) {
        this.estadocivil = estadocivil;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }

public int getIdade(){
     return Period.between(this.datanascimento, LocalDate.now()).getYears();
}
 public String getDataNascimento(){
      DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      return datanascimento.format(formatar);

 }
}
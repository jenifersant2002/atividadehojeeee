package atividadehoje0104;

import java.time.LocalDate;


public class PrestaçãoServiço extends Juridica{
    
    private LocalDate contratoInicio;
    private LocalDate contratoFim;

    public PrestaçãoServiço() {
    }

    public PrestaçãoServiço(LocalDate contratoInicio, LocalDate contratoFim, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereço endereço) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereço);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public LocalDate getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(LocalDate contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public LocalDate getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(LocalDate contratoFim) {
        this.contratoFim = contratoFim;
    }

  
    
}

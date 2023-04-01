package atividadehoje0104;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    
    public static void main(String[] args) {
        
    
    Medico medico = new Medico("28"," 0245871236"," 845712341"," 2476748579", Setor.SAUDE, 6000, EstadoCivil.CASADO, Genero.FEMININO, LocalDate.of(2002, Month.MARCH, 26), 23, "Jeni", "33154782","jenifersant22@hotmail.com", new Endereço("Rua Monteiro Lobato"," 60"," acima da escadinha"," 40430140","Salvador", UnidadeFederativa.MINAS_GERAIS));
    
    Advogado advogado = new Advogado("26"," 0245871236"," 845712341"," 2476748579", Setor.JURIDICO, 5000, EstadoCivil.DIVORCIADO, Genero.MASCULINO, LocalDate.of(2006, Month.MARCH, 27), 24, "Felipe", "33154782","felipe20@hotmail.com", new Endereço("Rua Monteiro Lobato"," 60"," acima da escadinha"," 40430140","Salvador", UnidadeFederativa.BAHIA));

    Engenheiro engenheiro = new Engenheiro("21"," 0245871236"," 845712341"," 2476748579", Setor.ENGENHARIA, 10000, EstadoCivil.SOLTEIRO, Genero.FEMININO, LocalDate.of(2000, Month.MARCH, 24), 25,"Jenifer", "33154782","jenifersant22@hotmail.com", new Endereço("Rua Monteiro Lobato"," 60"," acima da escadinha"," 40430140","Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
    
    Cliente cliente = new Cliente(26, EstadoCivil.CASADO, Genero.MASCULINO, LocalDate.of(1999, Month.SEPTEMBER, 02), 15874, "José"," 86223863"," jenifersant22@hotmail.com", new Endereço("Rua Monteiro Lobato"," 60"," acima da escadinha"," 40430140","São Paulo", UnidadeFederativa.SAO_PAULO));
    
        System.out.println(medico.toString());
        System.out.println(advogado.toString());
        System.out.println(engenheiro.toString());
        System.out.println(cliente.toString());
    }
}
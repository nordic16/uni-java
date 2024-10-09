package serie1;

import java.time.LocalDate;
import java.time.Period;

public class Ex2 {
    // ex2
    public static void ex2() {
        System.out.println("Nome: Diogo Domingos");
        System.out.println("Idade: 19");

        // this doesn't work lol
        LocalDate now = LocalDate.now();
        LocalDate startOfYear = LocalDate.of(now.getYear(), 1, 1);

        Period period = Period.between(startOfYear, now);
        int days = period.getDays();

        System.out.println("Nmr de dias passados desde o inicio do ano: " + days);

        if (days % 11 == 0) {
            System.out.println("E multiplo de 11!");
        }

        
    }
    
}

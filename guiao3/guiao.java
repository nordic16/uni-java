package guiao3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class guiao {
    
    /// ex1.
    public static void ex1() {
        int idade = 19;
        double altura = 1.70;
        
        System.out.println("Idade: " +idade);
        System.out.println("Altura: " +altura);
    }

    /// ex2.
    public static void ex2() {
        // gera um número aleatório entre 0 e 2024.
        int ano = ThreadLocalRandom.current().nextInt(0, 2025); 
        final boolean bissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);

        System.out.print("O ano %d ".formatted(ano));

        if (bissexto) {
            System.out.println("e bissexto");
        } else {
            System.out.println("nao e bissexto.");
        }
    }

    /// ex2 part 2.
    public static void ex2_pt2() {
        final int segundosDia = 24 * 3600; // segundos num dia
        final int horas = 2;
        final int minutos = 21;
        final int segundos = 13;

        int totalSegundos = (horas * 3600) + (minutos * 60) + segundos;

        System.out.println("Sao %dh %dm %ds. Passaram %d segundos desde a meia noite".formatted(horas, minutos, segundos, totalSegundos));
        System.out.println("Sao %dh %dm %ds. Faltam %d segundos para o final do dia".formatted(horas, minutos, segundos, segundosDia - totalSegundos));

        // ex4 1.
        float percentagem = (totalSegundos / (float)segundosDia) * 100;
        System.out.println("Ja se passaram %.2f".formatted(percentagem) + "% do dia.");

    }

    public static void ex3() {
        int n;
        char c;

        // scanner recebe user input.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Valor para n: ");
            n = scanner.nextInt();

            System.out.print("Valor para c: ");
            c = (char) scanner.nextInt();
        }

        for(int i = 0; i < n; i++) {
            System.out.print(c + " ");
        }
    }

    /// ex4
    public static void ex4() {
        int totalSegundos, minutos, horas;

        System.out.print("Segundos passados desde a meia-noite: ");
        // recebe user input
        try (Scanner scanner = new Scanner(System.in)) {
            totalSegundos = scanner.nextInt();
        }

        for (minutos = 0; totalSegundos >= 60; minutos++) 
            totalSegundos -= 60;

        for (horas = 0; minutos >= 60; horas++)
            minutos -= 60;
            
        System.out.println("Passaram %d segundos desde a meia-noite, logo sao %dh %dm %ds".formatted(horas, minutos, totalSegundos));
    }

    /// ex5
    public static void ex5() {
        // gera um número aleatório entre 100 e 999.
        int num = ThreadLocalRandom.current().nextInt(100, 1000);

        int centena = num / 100;
        int dezena = (num % 100) / 10;
        int unidade = num % 10;

        int soma = centena + dezena + unidade;

        System.out.println("A soma dos algarismos de %d e: %d + %d + %d = %d".formatted(num, centena, dezena, unidade, soma));
    }

}

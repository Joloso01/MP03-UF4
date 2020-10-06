package DadosE2;

import java.util.Scanner;

public class JuegoDados {

    Dado d1, d2, d3;
    Scanner sc = new Scanner(System.in);

    public void juegoDados() {
        int opcion = 0;
        int victorias = 0;
        int derrotas = 0;

        for (;opcion != 2;) {
            d1 = new Dado((int) (Math.random() * 7));
            d2 = new Dado((int) (Math.random() * 7));
            d3 = new Dado((int) (Math.random() * 7));

            if (d1.getNumeroDado() == d2.getNumeroDado() && d2.getNumeroDado() == d3.getNumeroDado()) {
                System.out.println("Has ganado!");
                victorias++;
            } else {
                System.out.println("Has perdido");
                derrotas++;
            }
            System.out.println("Quieres jugar otra vez?");
            System.out.println("1. si");
            System.out.println("2. no");
            opcion = sc.nextInt();
        }
        System.out.printf("Has Ganado: %d veces \n", victorias);
        System.out.printf("Has perdido: %d veces \n", derrotas);
    }
}

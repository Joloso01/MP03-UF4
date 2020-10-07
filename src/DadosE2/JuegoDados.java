package DadosE2;

import java.util.Scanner;

public class JuegoDados extends Dado{
    Scanner sc = new Scanner(System.in);
    Dado d1 = new Dado();
    Dado d2 = new Dado();
    Dado d3 = new Dado();
    private int victorias = 0;
    private int derrotas = 0;

    public JuegoDados(int dado1, int dado2, int dado3) {
        this.d1.numeroDado = dado1;
        this.d2.numeroDado = dado2;
        this.d3.numeroDado = dado3;
    }

    public void jugar() {
        int opcionjuego=1;
        while (opcionjuego != 2) {
            new JuegoDados(d1.tirar(),d2.tirar(),d3.tirar());
            System.out.printf("Dado1"+d1.toString()+" ");
            System.out.printf("Dado2"+d2.toString()+" ");
            System.out.printf("Dado3"+d3.toString()+"\n");
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
            opcionjuego = sc.nextInt();
        }
        System.out.printf("Has Ganado: %d veces \n", victorias);
        System.out.printf("Has perdido: %d veces \n", derrotas);
    }
}
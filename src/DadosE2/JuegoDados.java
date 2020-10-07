package DadosE2;

import java.util.Scanner;

public class JuegoDados extends Dado{
    Scanner sc = new Scanner(System.in);
    Dado d1, d2,d3;
    private int victorias = 0;
    private int derrotas = 0;

    public JuegoDados() {
        this.d1 = new Dado();
        this.d2= new Dado();
        this.d3= new Dado();
    }

    public void jugar() {
        int opcionjuego=1;
        while (opcionjuego != 2) {
            d1.setNumeroDado(tirar());
            d2.setNumeroDado(tirar());
            d3.setNumeroDado(tirar());
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
        victorias=0;
        derrotas=0;
    }
}
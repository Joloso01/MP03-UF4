package DadosE2;

import java.util.Scanner;

public class JuegoDados{
    Scanner sc = new Scanner(System.in);
    Dado d1, d2,d3;
    private int victorias = 0;
    private int derrotas = 0;
    private int total=0;

    public JuegoDados() {
        this.d1 = new Dado();
        this.d2= new Dado();
        this.d3= new Dado();
    }

    public void jugar() {
        int opcionjuego=1;
        boolean tirar=true;
        while (opcionjuego != 2) {
            if (tirar){
                d1.setNumeroDado(d1.tirar());
                d2.setNumeroDado(d2.tirar());
                d3.setNumeroDado(d3.tirar());
                System.out.printf("Dado1"+d1.toString()+" ");
                System.out.printf("Dado2"+d2.toString()+" ");
                System.out.printf("Dado3"+d3.toString()+"\n");
                if (d1.getNumeroDado() == d2.getNumeroDado() && d2.getNumeroDado() == d3.getNumeroDado()) {
                    System.out.println("Has ganado!");
                    victorias++;
                    total++;
                } else {
                    System.out.println("Has perdido");
                    derrotas++;
                    total++;
                }
            }
            System.out.println("Quieres jugar otra vez?");
            System.out.println("1. si");
            System.out.println("2. no");
            opcionjuego = sc.nextInt();
            switch (opcionjuego){
                case 1:
                    tirar=true;
                    break;
                case 2:
                    tirar=false;
                    break;
                default:
                    tirar=false;
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        System.out.printf("Has Ganado: %d veces \n", victorias);
        System.out.printf("Has perdido: %d veces \n", derrotas);
        System.out.printf("Has jugado: %d partidas \n", total);
        victorias=0;
        derrotas=0;
        total=0;
    }
}
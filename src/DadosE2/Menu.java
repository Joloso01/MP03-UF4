package DadosE2;

import java.util.Scanner;

public class Menu{
    Scanner sc = new Scanner(System.in);
    Dado dados = new Dado();
    JuegoDados jd1 = new JuegoDados();
    private int opcionMenu=1;

    public void menuJuegos(){
        while (opcionMenu != 0){
            System.out.println("    Juegos");
            System.out.println("<------------->");
            System.out.println("1. Juego dados");
            System.out.println("2. Parchis");
            System.out.println("3. Tic Tac Toe");
            System.out.println("0. Salir");
            System.out.println("<------------->");
            opcionMenu = sc.nextInt();
            switch (opcionMenu){
                case 1:
                    System.out.println("Bienvenido al juego de los dados");
                    jd1.jugar();
                    System.out.println("Cerrando juego de los dados...");
                    break;
                case 2:
                    System.out.println("Proximamente...");
                    break;
                case 3:
                    System.out.println("Proximamente...");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Numero no valido");

            }
        }

    }
}

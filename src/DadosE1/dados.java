package DadosE1;

import java.util.Scanner;

public class dados{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dado1,dado2;
        System.out.println("Cuantas veces quieres lanza el dado?");
        int n=sc.nextInt();
        int[] numDados = new int[12];
        for (int i = 0;i <n; i++) {
            dado1 = (int) (Math.random() * 6 +1);
            dado2 = (int) (Math.random() * 6 + 1);
            int suma = dado1+dado2;
            numDados[suma-1]++;
        }
        for (int i = 1; i < 12; i++) {
            System.out.printf("Te ha salido %d el numero %d \n",numDados[i],i+1);
        }
    }
}
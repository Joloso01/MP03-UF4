package DadosE1;

import java.util.*;

public class dados{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1,d2;
        List<Integer> listaTiradas = new ArrayList<>();

        System.out.println("Cuantas veces quieres lanza el dado?");
        int n=sc.nextInt();
        for (int i = 0;i <n; i++) {
            d1 = ((int) (Math.random() * 6 +1));
            d2= ((int) (Math.random() * 6 +1));
            listaTiradas.add((d1)+(d2));
        }
        for (int i=2;i<12;i++){
            System.out.println(i+":"+Collections.frequency(listaTiradas,i));
        }
        System.out.println("Total:"+listaTiradas.size());
    }
}
package CollectionsEjercicio;

import java.util.*;

public class Main{
    public static void main(String[] args) {

        Llapis llapis = new Llapis(0,0);
        List<Llapis> llapisList1 = new ArrayList<>();
        List<Llapis> llapisList2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            llapis=new Llapis((int)(Math.random()*7), 0);
            llapisList1.add(llapis);
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            llapis=new Llapis((int)(Math.random()*7), (float) (Math.random()*3));
            llapisList2.add(llapis);
        }
        System.out.println();

//        System.out.println("LLista numero1:");
//        System.out.println(llapisList1);
//
//        System.out.println("Llista numero2:");
//        System.out.println(llapisList2);
        System.out.println("Print for llista1:");
        for (int i = 0; i < llapisList1.size(); i++) {
            System.out.println(llapisList1.get(i));

        }
        System.out.println();

        System.out.println("Print for llista2:");
        for (int i = 0; i < llapisList2.size(); i++) {
            System.out.println(llapisList2.get(i));
        }
        System.out.println();

        System.out.println("Print forloop llista1:");
        for (Llapis l1:llapisList1){
            System.out.println(l1);
        }
        System.out.println();

        System.out.println("Print forloop llista2:");
        for (Llapis l2: llapisList2){
            System.out.println(l2);
        }
        System.out.println();

        System.out.println("Print iterator llista1:");
        Iterator<Llapis> it1 = llapisList1.iterator();
        while (it1.hasNext()){
            Llapis l1=it1.next();
            System.out.println(l1);
        }
        System.out.println();

        System.out.println("Print iterator llista2:");
        Iterator<Llapis> it2 = llapisList2.iterator();
        while (it2.hasNext()){
            Llapis l2=it2.next();
            System.out.println(l2);
        }
        System.out.println();
        System.out.println("Print foreach llista1:");
        llapisList1.forEach(System.out::println);
        System.out.println();

        System.out.println("Print foreach llista2:");
        llapisList2.forEach(System.out::println);

//        Collections.sort(llapisList1;


    }
}

package CollectionsEjercicio;

import java.util.*;

public class Main{
    public static void main(String[] args) {

        //2:
        Llapis llapis = new Llapis(0,0);
        List<Llapis> llapisList1 = new ArrayList<>();
        List<Llapis> llapisList2 = new ArrayList<>();

        //3;
        for (int i = 0; i < 10; i++) {
            llapis=new Llapis((int)(Math.random()*7), 0);
            llapisList1.add(llapis);
        }

        //4:
        System.out.println();
        for (int i = 0; i < 10; i++) {
            llapis=new Llapis((int)(Math.random()*7), (float) (Math.random()*3));
            llapisList2.add(llapis);
        }
        System.out.println();

        //5:
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

        System.out.println();


        //6:
        System.out.println("Ordenado por Color: ");
        ComparatorLlapisColor cmlColor = new ComparatorLlapisColor();
        Collections.sort(llapisList1,cmlColor);
        llapisList1.sort(cmlColor);

        for (Llapis l : llapisList1) {
            System.out.println(l);
        }

        //7:
        System.out.println("Ordenado por Gruix: ");
        ComparatorLlapisColorGruix cmlGruix =new ComparatorLlapisColorGruix();
        Collections.sort(llapisList2,cmlGruix);
        llapisList2.sort(cmlGruix);

        for (Llapis l1: llapisList2){
            System.out.println(l1);
        }
        System.out.println();

        //8:
        System.out.println("Print LinkedList: ");
        LinkedList<Llapis> llapisLinkedList = new LinkedList<>(llapisList2);

        //9:
        llapisLinkedList.addAll(llapisList1);

        //10:
        for (Llapis lnk: llapisLinkedList){
            System.out.println(lnk);
        }
        System.out.println();


        //11:
        System.out.println("Lista sin repetidos: ");
        Set<Llapis> llapisSet = new HashSet<>();
        llapisSet.addAll(llapisLinkedList);
        for (Llapis ls : llapisSet){
            System.out.println(ls);
        }
        System.out.println();

        //12:
        Map<Integer,String> map_colors = new HashMap<>();
        map_colors.put(0,"Negre");
        map_colors.put(1,"Vermell");
        map_colors.put(2,"Groc");
        map_colors.put(3,"Verd");
        map_colors.put(4,"Verd");
        map_colors.put(3,"Blanc");

        //I. que se sobre escribe por el blanco, porque tienen la misma clave.
        //II.
        for (Map.Entry<Integer,String> entry : map_colors.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println();
        //III.
        for (String m1 : map_colors.values()){
            System.out.println(m1);
        }


    }
}
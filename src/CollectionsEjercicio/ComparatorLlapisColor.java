package CollectionsEjercicio;

import java.util.Comparator;

public class ComparatorLlapisColor implements Comparator<Llapis> {
    @Override
    public int compare(Llapis llapis, Llapis t1) {
        if (llapis.getColor() < t1.getColor()) return 1;
        else if (llapis.getColor() > t1.getColor()) return -1;
        else return 0;
    }
}

package CollectionsEjercicio;

import java.util.Comparator;

public class ComparatorLlapisColorGruix implements Comparator<Llapis> {
    @Override
    public int compare(Llapis llapis, Llapis t1) {
        if (llapis.getGruix() < t1.getGruix()) return 1;
        else if (llapis.getGruix() > t1.getGruix()) return -1;
        else return 0;
    }
}

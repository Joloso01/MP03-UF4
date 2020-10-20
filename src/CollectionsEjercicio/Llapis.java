package CollectionsEjercicio;

public class Llapis implements Comparable<Llapis>{
    private int color;
    private float gruix;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getGruix() {
        return gruix;
    }

    public void setGruix(float gruix) {
        this.gruix = gruix;
    }

    @Override
    public String toString() {
        return "Llapis{" +
                "color=" + color +
                ", gruix=" + gruix +
                '}';
    }

    public Llapis(int color, float gruix) {
        this.color = color;
        this.gruix = gruix;
    }

    @Override
    public int compareTo(Llapis o) {
        if(this.color < o.getColor()) return 1;
        else if (this.color > o.getColor()) return 1;
        if(this.gruix < o.getGruix()) return -1;
        else if (this.gruix > o.getGruix()) return -1;
        else return 0;
    }
}

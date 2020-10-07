package DadosE2;

public class Dado {
    private int numeroDado;

    public int getNumeroDado() {
        return numeroDado;
    }

    public void setNumeroDado(int numeroDado) {
        this.numeroDado = numeroDado;
    }

    public Dado(int numeroDado) {
        this.numeroDado = numeroDado;
    }

    @Override
    public String toString() {
        return "{" +
                "numero=" + numeroDado +
                '}';
    }

    public int tirar(){
     numeroDado = (int)(Math.random()*6+1);
     return numeroDado;
    }
}

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
        return "Dado{" +
                "numeroDado=" + numeroDado +
                '}';
    }
}

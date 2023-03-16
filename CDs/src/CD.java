public class CD {
    private String titulo;
    private int numfaixa;
    private double preco;
    private String Cantor;

    public CD(){}

    public CD(String titulo, int numfaixa, float preco, String cantor) {
        this.titulo = titulo;
        this.numfaixa = numfaixa;
        this.preco = preco;
        Cantor = cantor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumfaixa() {
        return numfaixa;
    }

    public void setNumfaixa(int numfaixa) {
        this.numfaixa = numfaixa;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCantor() {
        return Cantor;
    }

    public void setCantor(String cantor) {
        Cantor = cantor;
    }

    @Override
    public String toString() {
        return "CD{" +
                "titulo='" + titulo + '\'' +
                ", numfaixa=" + numfaixa +
                ", preco=" + preco +
                ", Cantor='" + Cantor + '\'' +
                '}';
    }
}

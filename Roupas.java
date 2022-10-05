class Roupas {

    public static void main(String[] args) {
        System.out.println("Roupas");
    }

    String tipo;
    String preco;
    String tamanho;

    public Roupas(String tipo, String preco, String tamanho) {

        this.tipo = tipo;
        this.preco = preco;
        this.tamanho = tamanho;

    }

    public String getTipo() {
        return tipo;
    }

    public String getPreco() {
        return preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setpreco(String preco) {
        this.preco = preco;
    }

    public void settamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String retornaTamanho() {
        return tamanho;
    }

    public String retornaTipo() {
        return tipo;
    }

}

import java.util.Scanner;

class Funcionario {
    /**
     * @param args
     */

    static float Loja;

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Quantidade de funcionarios da loja.");
        System.out.println("Para saber quantidade de funcionarios devemos comparar tamanho da loja.");

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite tamanho da loja:");
            Loja = entrada.nextFloat();
        }

        if (Loja > 31)
            ;
        System.out.println("Tem-se de 8 a 10 funcionarios");

        if (Loja <= 100)
            ;
        System.out.println("Tem-se de 12 a 15 funcionarios");
        if (Loja > 150)
            ;
        System.out.println("Tem-se de 15 a 18 funcionarios");

    }

    private String nome;
    private float matricula;
    private float quantidade;

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public Funcionario(String nome, float matricula) {

        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public float getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setmatricula(float matricula) {
        this.matricula = matricula;
    }

}
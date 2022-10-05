public class Principal {
    public static void main(String[] args) {
        System.out.println("Inicio do programa.");
        System.out.println("Roupas disponiveis na loja:");

        Roupas roupa1 = new Roupas("Feminino", "Preco promocional de 25 reais", "P,M,G");
        System.out.println(roupa1.getTipo());
        System.out.println(roupa1.getPreco());
        System.out.println(roupa1.getTamanho());

    }

}
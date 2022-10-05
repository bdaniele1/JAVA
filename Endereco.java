public class Endereco {
    public static void main(String[] args) {

        System.out.println("Para saber o endereco de nossa loja siga-nos:");

        String rua, bairro, cidade;

        rua = "Dantas Correia";
        bairro = "Centro";
        cidade = "Lencois";

        System.out.println("Estamos localizados na rua:" + rua);
        System.out.println("Bairro:" + bairro);
        System.out.println("Cidade de:" + cidade);

    }

    public String comoChegar(String rua, String bairro, String cidade) {
        return (rua + bairro + cidade);

    }

}

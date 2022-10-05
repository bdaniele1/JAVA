import java.util.Scanner;

class Cliente {

    public static void main(String[] args) {

        String cadastro;
        String nome;
        String dataNascimento;
        String cpf;
        String compra;
        double valorCompra;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Você já possui cadastro na loja? 1-Sim 2-Nao");
        cadastro = entrada.toString();

        if (cadastro == 1)
            ;
        {

            System.out.println("Digite seu cpf para finalizar compra:");
            cpf = entrada.toString();
        }

        if (cadastro == 2)
            ;
        {

            System.out.println("Digite seu nome completo:");
            nome = entrada.toString();

            System.out.println("Digite sua data de nascimento:");
            dataNascimento = entrada.toString();

            System.out.println("Digite seu cpf:");
            cpf = entrada.toString();

            System.out.println("Cadastro realizado com sucesso");

        }
    
    }

    public static String valorCompra (String compra, double valorCompra){
        return (compra + valorCompra);
    }
}
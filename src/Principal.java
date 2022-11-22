import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Produto> lstProdutos;


    public static void main(String[] args) {
        lstProdutos = new ArrayList<>();

        menu();

    }

    private static void menu() {
        System.out.println("--------------------------------------------------");
        System.out.println("----------------- SEJA BEM VINDO -----------------");
        System.out.println("-------------    MERCADINHO JAVAC     ------------");
        System.out.println("*********** SELECIONE A OPÇÃO DESEJADA ***********");
        System.out.println("--------------------------------------------------");
        System.out.println("    |      OPÇÃO 1 - CADASTRA PRODUTOS            ");
        System.out.println("    |      OPÇÃO 2 - LISTAR PRODUTOS CADASTRADOS  ");
        System.out.println("    |      OPÇÃO 3 - COMPRA PRODUTOS              ");
        System.out.println("    |      OPÇÃO 4 - SAIR                         ");

        System.out.print("\nDIGITE A OPÇÃO: ");

        Integer opcao = input.nextInt();
        switch (opcao) {
            case 1 -> cadastrarProduto();
            case 2 -> listarProdutos();
            case 3 -> comprarProdutos();
            case 4 -> System.out.println("------- OBRIGADA - VOLTE SEMPRE --------");
            default -> {
                System.out.println("--OPÇÃO INVALIDA POR FAVOR DIGITAR UMA DAS OPÇÕES LISTADAS  --");
                menu();
            }
        }

    }

    private static void cadastrarProduto() {

        System.out.print("DIGITE O ITEM DESEJADO: ");
        String itemDessejado = input.next();

        System.out.print("DIGITE QUANTIDADE DO ITEM DESEJADO: ");
        Double quantidadeItem = input.nextDouble();
        //input.nextLine();
        System.out.print("DIGITE O VALOR ITEM DESEJADO: ");
        Double valorInformado = input.nextDouble();
        Double valorItem = valorInformado * quantidadeItem;
        Produto produtos = new Produto(itemDessejado, quantidadeItem, valorInformado, valorItem);
        lstProdutos.add(produtos);


        menu();
    }

    private static void listarProdutos() {
        if (lstProdutos.size() > 0) {
            System.out.println("-------- LISTA DE PRODUTOS --------");

            for (Produto p : lstProdutos) {
                System.out.println(p.resultado());
            }
        } else {
            System.out.println("-------- NENHUM PRODUTO CADASTRADO --------");
        }
        menu();

    }

    private static void comprarProdutos() {
        if (lstProdutos.size() > 0) {
            System.out.println("-------- PRODUTOS DISPONIVEIS --------");
            for (Produto p : lstProdutos) {
                System.out.println(p.resultado() + "\n");
            }
            System.out.println("DIGITE 1 - PARA FINALIZAR COMPRA\n" +
                    "DIGITE 2 - PARA CADASTRAR MAIS PRODUTOS");
            Integer opcao = input.nextInt();

            switch (opcao) {
                case 1 -> finalizarcompra();
                case 2 -> menu();

            }

        }
    }

    private static void finalizarcompra() {
        Double valorTotal = 0.0;
        for (Produto p : lstProdutos) {
            valorTotal += p.getPrecoTotal();
        }
        System.out.printf("--- VALOR TOTAL DAS SUAS COMPRAS : %.2f" ,  valorTotal);

    }
}


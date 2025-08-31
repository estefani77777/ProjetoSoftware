import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Roupa> roupas = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Registrar nova roupa");
            System.out.println("2 - Adicionar peças ao estoque");
            System.out.println("3 - Remover peças do estoque");
            System.out.println("4 - Listar todas as roupas");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Tipo de Roupa: ");
                    String tipo = sc.nextLine();
                    System.out.print("Tamanho: ");
                    String tamanho = sc.nextLine();
                    System.out.print("Quantidade inicial: ");
                    int qtd = sc.nextInt();
                    System.out.print("Valor unitário: ");
                    double valor = sc.nextDouble();

                    roupas.add(new Roupa(marca, tipo, tamanho, qtd, valor));
                    System.out.println("Roupa cadastrada com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o índice da roupa (0 a " + (roupas.size()-1) + "): ");
                    int idxAdd = sc.nextInt();
                    System.out.print("Quantidade para adicionar: ");
                    int qtdAdd = sc.nextInt();
                    roupas.get(idxAdd).adicionarEstoque(qtdAdd);
                    System.out.println("Estoque atualizado!");
                    break;

                case 3: // Remover
                    System.out.print("Digite o índice da roupa (0 a " + (roupas.size()-1) + "): ");
                    int idxRem = sc.nextInt();
                    System.out.print("Quantidade para remover: ");
                    int qtdRem = sc.nextInt();
                    roupas.get(idxRem).removerEstoque(qtdRem);
                    System.out.println("Estoque atualizado!");
                    break;

                case 4:
                    System.out.println("\n--- LISTA DE ROUPAS ---");
                    for (int i = 0; i < roupas.size(); i++) {
                        System.out.println("[" + i + "] " + roupas.get(i).getInfo());
                    }
                    break;

                case 5:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}

public class Roupa {

    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double valor;

    public Roupa(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public double getValorTotal() {
        return quantidade * valor;
    }

    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
        }
    }

    public void removerEstoque(int qtd) {
        if (qtd > 0 && qtd <= this.quantidade) {
            this.quantidade -= qtd;
        } else {
            System.out.println("Quantidade inválida. Não é possível remover mais peças do que o disponível.");
        }
    }

    public String getInfo() {
        return "Marca: " + marca +
                " | Tipo: " + tipo +
                " | Tamanho: " + tamanho +
                " | Quantidade: " + quantidade +
                " | Valor Unitário: R$" + valor +
                " | Valor Total: R$" + getValorTotal();
    }
}

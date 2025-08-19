package entidades;

public class Livro {
    public String titulo;
    public String autor;
    public int quantidade = 0;
    public double valor = 0;

    public Livro(String titulo, String autor, int quantidade, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
        this.valor = valor;

    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void emprestalivro(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;

        } else {
            System.out.println("Quantidade Indisponivel ou Valor inválido");
        }
    }

    public void devolvelivro(int quantidade  ){
      if (quantidade > 0 ){
        this.quantidade += quantidade;
    }else{

        System.out.println("valor invalido");
    }
}
public double valorTotal() {
    double valorTotal = this.quantidade * this.valor;
    return valorTotal;
}
    @Override
    public String toString() {
        return "Livro" +
                "\ntitulo: " + titulo +
                " \nautor: " + autor +
                "\nquantidade: " + quantidade +
                "\nvalor: R$" + valor +
                "\nvalorTotal: " + valorTotal();
    }
}

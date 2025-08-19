import entidades.Livro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Livro harrypotter = new Livro("Harry Potter", "J.K.Rowling", 5, 50);
        Livro naruto = new Livro("Naruto", "Masashi Kishimoto", 5, 50);

        naruto.emprestalivro(1);
        harrypotter.emprestalivro(1);
        harrypotter.devolvelivro(20);
        naruto.devolvelivro(20);
        System.out.println(naruto.toString());
        System.out.println(harrypotter.toString());

    }
}
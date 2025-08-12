package ContaMes;

public class Main {
    public static void main(String[] args) {

// ja
        double aguaoJan = 100;
        double eletricaJan = 200;
        double alimentacaoJan = 300;
//fev   // gasto fev
        double aguaoFev = 200;
        double eletricaFev = 300;
        double alimentacaoFev = 400;
//jan
        double gastoTotal = aguaoJan+ eletricaJan + alimentacaoJan;
        //fev
        double gasTotal = aguaoFev + eletricaFev + alimentacaoFev;

        if(gasTotal < gastoTotal) {
            System.out.println("Gasto total de fevereiro foi maior ");

        }else if (gasTotal > gastoTotal) {
            System.out.println("Gasto total de janeiro foi maior ");
        }else {
            System.out.println("Ambos os meses tiveram o mesmo gasto ");
        }
    }
}

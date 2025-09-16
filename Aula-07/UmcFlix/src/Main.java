import entidades.Filme;
import entidades.Genero;
import entidades.Serie;

import javax.xml.transform.Source;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("INFORME UM REGISTRO:");
        System.out.println("1 - FILME");
        System.out.println("2 - SERIE");
        int opcao = sc.nextInt();

        Scanner sc= new Scanner(System.in);

        System.out.println("insira o nome do Filme/Serie: ");
        String nome = sc.nextLine();
        System.out.println("informe o genero:");
        Genero genero = Genero.valueOf(sc.nextLine());
        System.out.println("Informe o diretor: ");
        String diretor = sc.nextLine();
        System.out.println("informe a classificacao: ");
        int classificacao = sc.nextLine();
        System.out.println("informe o protagonista: ");
        String protagonista = sc.nextLine();

        if (opcao == 1) {
            System.out.println("informe a duracao do filme:");
            int duracao = sc.nextInt();
            Filme filme = new Filme(nome, protagonista, gen, diretor, classificacao, duracao );
            filme.toString();

        }else if (opcao == 2) {
            System.out.println("informe a qauntidade de temporadas:");
            int temporadas = sc.nextInt();
            System.out.println("informe a quantidade de epsodios:");
            int episodios = sc.nextInt();
            Serie serie = new Serie(nome, protagonista, genero, diretor, classificacao, epsodios );
            serie.toString();

        }

        sc.close();
    }
}
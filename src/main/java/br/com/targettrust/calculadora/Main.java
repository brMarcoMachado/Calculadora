package br.com.targettrust.calculadora;

public class Main {
    public static void main(String[] args) {

        System.out.println("SOMA");
        Tela.exibir(Operacao.somar(10,2));

        System.out.println("\nSUBTRAÇÃO");
        Tela.exibir(Operacao.subtrair(10,2));

        System.out.println("\nDIVISÃO");
        Tela.exibir(Operacao.dividir(10,2));

        System.out.println("\nMULTIPLICAÇÃO");
        Tela.exibir(Operacao.multiplicar(10,2));

    }
}
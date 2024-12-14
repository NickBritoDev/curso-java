package Variaveis;

public class Variaveis {
    public static void main(String[] args) {

        String nome = "Nicolas Brito";
        String nomeCompleto = nome + " " + "da Cruz";

        boolean verdade = false;
        int inteiro = 455555552;
        double decimal = 3.14;
        char inicial = 'N';
        float altura = 1.75f;
        long populacao = 7_800_000_000L;
        byte pequenosBytes = 127;
        short pequenosInteiros = 32000;

        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Verdade: " + verdade);
        System.out.println("Número inteiro: " + inteiro);
        System.out.println("Número decimal: " + decimal);
        System.out.println("Inicial: " + inicial);
        System.out.println("Altura: " + altura);
        System.out.println("População: " + populacao);
        System.out.println("Pequenos Bytes: " + pequenosBytes);
        System.out.println("Pequenos Inteiros: " + pequenosInteiros);
    }
}

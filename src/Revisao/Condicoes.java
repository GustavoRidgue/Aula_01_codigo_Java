package Revisao;

public class Condicoes {
    public static void main(String[] args) {




        System.out.println("Digite sua nota 1. NAO MINTA!");

        System.out.println("Digite sua nota 2. NAO MINTA, NOS SABEMOS A VERDADE!");

        float nota1 = 9.9f;
        float nota2 = 5.0f;
        String nomeAluno = "Gustavo";
        double media = (nota1 + nota2)/2;

        if(media>=7.0) {
            System.out.println("Parabens, vc foi aprovado");
        }
        else if(media > 5.0 && media < 7.0) {
            System.out.println("Recuperacao");
            if (media > 5.0 && media < 6.0) {
                System.out.println("Mandou mal");
            }
        }
        else {
            System.out.println("Reprovado");
        }
        System.out.println(nomeAluno + " voce tirou a media "  + media );
    }
}

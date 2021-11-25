package Metodos;



public class Main {

    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercício calculadora ");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,1.8);
        Calculadora.multiplicacao(5,7);
        Calculadora.divisao(5,2.5);

        //Mensagem
        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(22);




        //Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(500, 2);
        Emprestimo.calcular(500, 3);
        Emprestimo.calcular(500, 5);





    }
}

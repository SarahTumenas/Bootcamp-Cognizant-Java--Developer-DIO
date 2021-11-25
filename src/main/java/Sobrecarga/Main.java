package Sobrecarga;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercício quadrilátero");
       /*  Quadrilatero.area(3);
        Quadrilatero.area(5d,6d);
        Quadrilatero.area(9,8,4.5);
        Quadrilatero.area(10f,10.5f);*/

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5d,10d);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(5,3,4);
        System.out.println("Área do quadrado: " + areaTrapezio);







    }
}

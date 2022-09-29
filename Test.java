package ejecutable;

import modelo.carro;

public class Test {
    public static void main(String[] args)
    {
        carro carro1 = new carro();
        System.out.println("Pos. X: " + carro1.getPosX());
        System.out.println("Pos. Y: " + carro1.getPosX());
        System.out.println("Color: " + carro1.getColor());
        System.out.println("Num. Ruedas: " + carro1.getNumRuedas());
        System.out.println("Velocidad: " + carro1.getVelocidad());

        System.out.println("--------------------------------------------");

        System.out.println(carro1);
        carro carro2 = new carro("Blanco", 10, 100);
        carro2.acelerar();
        System.out.println(carro2);
    }
}

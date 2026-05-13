package carro;

public class testeCarro {
    public static void main(String[] args){

        carros van = new carros();
        van.marca = "fiat";
        van.modelo = "ducato";
        van.NumeroDePassageiros = 10;
        van.CapacidadeDeCombustivel = 100;
        van.consumoDeCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();









    }
}

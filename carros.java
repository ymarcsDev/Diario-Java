package carro;

public class carros {
    String marca;
    String modelo;
    int NumeroDePassageiros;
    double CapacidadeDeCombustivel;
    double consumoDeCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + CapacidadeDeCombustivel * consumoDeCombustivel + " km");
    }
}

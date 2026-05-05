package entities;

public class TesteCarro {
    public static void main(String[] args) {

        carro van = new carro();
        van.marca = "fiat";
        van.modelo = "ducato";
        van.NumeroDePassageiros = 10;
        van.CapacidadeDeCombustivel = 100;
        van.consumoDeCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        carro fusca = new carro();
        fusca.marca = "volskwagen";
        fusca.modelo = "fusca";
        fusca.NumeroDePassageiros = 4;
        fusca.CapacidadeDeCombustivel = 30;
        fusca.consumoDeCombustivel = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);

    }
}

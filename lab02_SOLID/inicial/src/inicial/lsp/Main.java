package inicial.lsp;

public class Main {
    public static void main(String[] args) {
        Repartidor repartidorMoto = new RepartidorMoto("Carlos");
        Repartidor repartidorBici = new RepartidorBicicleta("Lucía");

        repartidorMoto.recogerPedido();
        repartidorMoto.entregarPedido();
        repartidorMoto.repostarCombustible();

        System.out.println();

        repartidorBici.recogerPedido();
        repartidorBici.entregarPedido();
        repartidorBici.repostarCombustible(); // Esto lanzará una excepción, lo cual viola el LSP
    }
}

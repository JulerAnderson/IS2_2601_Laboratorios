package corregido.lsp;

public class Main {
    public static void main(String[] args) {
        RepartidorMoto repartidorMoto = new RepartidorMoto("Carlos");
        Repartidor repartidorBici = new RepartidorBicicleta("Lucía");

        repartidorMoto.recogerPedido();
        repartidorMoto.entregarPedido();
        repartidorMoto.repostarCombustible();

        System.out.println();

        repartidorBici.recogerPedido();
        repartidorBici.entregarPedido();
    }
}

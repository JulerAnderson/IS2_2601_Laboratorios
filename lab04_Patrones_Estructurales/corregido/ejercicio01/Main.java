package corregido.ejercicio01;

public class Main {
    public static void main(String[] args) {
        PedidoJson pedido = new PedidoJson("P-1001", "Carlos Pérez", 250.0);

        System.out.println("MercaGo genera el pedido en JSON:");
        System.out.println(pedido.generarJson());

        System.out.println();

        ServicioLogisticaXML servicio = new ServicioLogisticaXML();
        AdaptadorPedidoXML adaptador = new AdaptadorPedidoXML(servicio);

        adaptador.enviarPedido(pedido);
    }
}
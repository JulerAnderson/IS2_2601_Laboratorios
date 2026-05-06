package inicial.ejercicio01;

public class Main {
    public static void main(String[] args) {
        PedidoJSON pedido = new PedidoJSON("P-1001", "Carlos Pérez", 250.0);
        ServicioLogisticaXML servicio = new ServicioLogisticaXML();

        String json = pedido.generarJSON();
        System.out.println("MercaGo genera el pedido en JSON:");
        System.out.println(json);

        System.out.println("\nNo se puede enviar directamente al proveedor porque espera XML.");
        
        // Esto sería incorrecto conceptualmente:
        // servicio.enviarPedidoEnXML(json);
    }
}
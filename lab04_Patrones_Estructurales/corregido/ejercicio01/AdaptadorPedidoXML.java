package corregido.ejercicio01;

public class AdaptadorPedidoXML {
    private ServicioLogisticaXML servicioLogisticaXML;

    public AdaptadorPedidoXML(ServicioLogisticaXML servicioLogisticaXML) {
        this.servicioLogisticaXML = servicioLogisticaXML;
    }

    public void enviarPedido(PedidoJson pedido) {
        String xml =
                "<pedido>" +
                    "<numeroPedido>" + pedido.getNumeroPedido() + "</numeroPedido>" +
                    "<cliente>" + pedido.getCliente() + "</cliente>" +
                    "<total>" + pedido.getTotal() + "</total>" +
                "</pedido>";

        servicioLogisticaXML.enviarPedidoEnXML(xml);
    }
}
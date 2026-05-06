package inicial.ejercicio01;

public class PedidoJSON {
    private String numeroPedido;
    private String cliente;
    private double total;

    public PedidoJSON(String numeroPedido, String cliente, double total) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.total = total;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }

    public String generarJSON() {
        return "{ \"numeroPedido\": \"" + numeroPedido + "\", " +
               "\"cliente\": \"" + cliente + "\", " +
               "\"total\": " + total + " }";
    }
}
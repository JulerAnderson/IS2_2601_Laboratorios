package inicial.lsp;

public class RepartidorBicicleta extends Repartidor {

    public RepartidorBicicleta(String nombre) {
        super(nombre);
    }

    @Override
    public void entregarPedido() {
        System.out.println(getNombre() + " está entregando el pedido en bicicleta.");
    }

    @Override
    public void recogerPedido() {
        System.out.println(getNombre() + " está recogiendo el pedido en bicicleta.");
    }

    @Override
    public void repostarCombustible() {
        throw new UnsupportedOperationException("Un repartidor en bicicleta no usa combustible.");
    }

    
}

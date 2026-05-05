package corregido.ejercicio03;

public class TemaClaroFactory implements TemaFactory {
    @Override
    public Boton crearBoton() {
        return new BotonClaro();
    }

    @Override
    public Checkbox crearCheckbox() {
        return new CheckboxClaro();
    }
}

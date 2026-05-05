package corregido.ejercicio03;

public class TemaOscuroFactory implements TemaFactory {
    @Override
    public Boton crearBoton() {
        return new BotonOscuro();
    }

    @Override
    public Checkbox crearCheckbox() {
        return new CheckboxOscuro();
    }
}

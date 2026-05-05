package corregido.ejercicio03;

public class Main {
    public static void main(String[] args) {
        // Creamos una fábrica de tema claro
        TemaFactory factoryClaro = new TemaClaroFactory();
        Boton botonClaro = factoryClaro.crearBoton();
        Checkbox checkboxClaro = factoryClaro.crearCheckbox();
        botonClaro.render();
        checkboxClaro.render();

        // Creamos una fábrica de tema oscuro
        TemaFactory factoryOscuro = new TemaOscuroFactory();
        Boton botonOscuro = factoryOscuro.crearBoton();
        Checkbox checkboxOscuro = factoryOscuro.crearCheckbox();
        botonOscuro.render();
        checkboxOscuro.render();
    }
}

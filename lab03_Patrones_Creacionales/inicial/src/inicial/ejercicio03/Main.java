package inicial.ejercicio03;

public class Main {
    public static void main(String[] args) {
        String tema = "Claro";

        if (tema.equals("Claro")) {
            BotonClaro boton = new BotonClaro();
            CheckboxClaro checkbox = new CheckboxClaro();
            boton.render();
            checkbox.render();
        } else if (tema.equals("Oscuro")) {
            BotonOscuro boton = new BotonOscuro();
            CheckboxOscuro checkbox = new CheckboxOscuro();
            boton.render();
            checkbox.render();
        }
    }
}

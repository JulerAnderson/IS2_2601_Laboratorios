package inicial.ejercicio01;

public class BotonGuardar {
    public void click(ProductoEditor editor) {
        System.out.println("Botón Guardar presionado.");
        editor.guardarCambios();
    }
}
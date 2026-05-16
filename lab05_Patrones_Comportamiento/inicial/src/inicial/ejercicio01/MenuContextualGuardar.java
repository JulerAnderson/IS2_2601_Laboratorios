package inicial.ejercicio01;

public class MenuContextualGuardar {
    public void seleccionarOpcion(ProductoEditor editor) {
        System.out.println("Opción Guardar seleccionada desde menú contextual.");
        editor.guardarCambios();
    }
}
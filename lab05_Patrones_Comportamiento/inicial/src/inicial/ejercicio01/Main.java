package inicial.ejercicio01;

public class Main {
    public static void main(String[] args) {
        ProductoEditor editor = new ProductoEditor("Mouse inalámbrico", 49.90, 15);

        editor.mostrarProducto();

        BotonGuardar boton = new BotonGuardar();
        MenuContextualGuardar menu = new MenuContextualGuardar();
        AtajoTecladoGuardar atajo = new AtajoTecladoGuardar();

        boton.click(editor);
        menu.seleccionarOpcion(editor);
        atajo.presionarCtrlS(editor);
    }
}
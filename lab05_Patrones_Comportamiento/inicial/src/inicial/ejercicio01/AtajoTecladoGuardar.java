package inicial.ejercicio01;

public class AtajoTecladoGuardar {
    public void presionarCtrlS(ProductoEditor editor) {
        System.out.println("Atajo Ctrl+S presionado.");
        editor.guardarCambios();
    }
}
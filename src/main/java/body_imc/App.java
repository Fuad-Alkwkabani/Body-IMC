package body_imc;

public class App {
    public static void main(String[] args) {
        // Crear la vista
            Bmiview vista = new Bmiview();

        // Crear el controlador conectando la vista
        BmiController controlador = new BmiController(vista);

        // Iniciar la aplicación
        controlador.iniciar();
    }
}

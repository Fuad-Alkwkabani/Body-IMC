package body_imc;

public class App {
    public static void main(String[] args) {
        
            Bmiview vista = new Bmiview();

        BmiController controlador = new BmiController(vista);

        controlador.iniciar();
    }
}

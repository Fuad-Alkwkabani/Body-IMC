package body_imc;

public class BmiController {
    private Bmiview vista;

    public BmiController(Bmiview vista) {
        this.vista = vista;
    }

    public void iniciar() {
        double peso = vista.solicitarPeso();
        double altura = vista.solicitarAltura();

        person persona = new person(peso, altura);

        BmiModel modelo = new BmiModel(persona);

        double imc = modelo.calculateBMI();
        String clasificacion = modelo.giveResultsBMI(imc);

        vista.mostrarResultado(clasificacion, imc);
    }
}



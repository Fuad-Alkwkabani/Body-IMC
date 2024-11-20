package body_imc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BmiModelTest {
    @Test
    void testCalculateBMI() {
        person person = new person(70.0, 1.75); 
        BmiModel model = new BmiModel(person);

        double result = model.calculateBMI();
        assertEquals(22.86, result, 0.01, "El cálculo del IMC no es correcto.");

    }

    @Test
    void testGiveResultsBMI() {

        person person = new person(70.0, 1.75);
        BmiModel model = new BmiModel(person);

        double bmi = model.calculateBMI();

        String classification = model.giveResultsBMI(bmi);
        assertEquals("Normal weight", classification, "La clasificación del IMC no es correcta.");

    }
    @Test
    public void testClassifications() {
        BmiModel model;

        model = new BmiModel(new person (50.0, 1.75)); // IMC: 16.33
        assertEquals("Moderate thinness", model.giveResultsBMI(model.calculateBMI()), "La clasificación no es correcta.");

        model = new BmiModel(new person (85.0, 1.75)); // IMC: 27.76
        assertEquals("Overweight", model.giveResultsBMI(model.calculateBMI()), "La clasificación no es correcta.");

        model = new BmiModel(new person(100.0, 1.75)); // IMC: 32.65
        assertEquals("Mild obesity", model.giveResultsBMI(model.calculateBMI()), "La clasificación no es correcta.");

        model = new BmiModel(new person(120.0, 1.75)); // IMC: 39.18
        assertEquals("Moderate obesity", model.giveResultsBMI(model.calculateBMI()), "La clasificación no es correcta.");

        model = new BmiModel(new person(150.0, 1.75)); // IMC: 49.02
        assertEquals("Morbid obesity", model.giveResultsBMI(model.calculateBMI()), "La clasificación no es correcta.");
    }
}

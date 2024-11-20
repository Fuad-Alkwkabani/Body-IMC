# # Calculadora de IMC (Índice de Masa Corporal)

Este proyecto es una aplicación de consola que permite calcular el **Índice de Masa Corporal (IMC)** de una persona basándose en su peso y altura. Además, clasifica el resultado en una de las categorías definidas (por ejemplo, peso normal, sobrepeso, obesidad).

---

## **Estructura del Proyecto**

El proyecto sigue una arquitectura basada en **Modelo-Vista-Controlador (MVC)** para separar las responsabilidades y mantener un diseño limpio y modular.

- **Modelo (`BmiModel`)**: Contiene la lógica para calcular el IMC y clasificarlo según los rangos predefinidos.
- **Vista (`BmiView`)**: Se encarga de interactuar con el usuario, solicitando datos y mostrando resultados.
- **Controlador (`BmiController`)**: Coordina la interacción entre la vista y el modelo.
- **Clase Principal (`App`)**: Punto de entrada de la aplicación.

---

## **Cómo Funciona**

1. El programa solicita al usuario que introduzca su peso (en kilogramos) y su altura (en metros).
2. Calcula el IMC utilizando la fórmula:  
   \[
   IMC = \frac{peso}{altura^2}
   \]
3. Clasifica el IMC en una categoría, según la siguiente tabla:

   | IMC           | Clasificación        |
   |---------------|----------------------|
   | **< 16**      | Severe thinness      |
   | **16 - 17**   | Moderate thinness    |
   | **17 - 18.5** | Mild thinness        |
   | **18.5 - 25** | Normal weight        |
   | **25 - 30**   | Overweight           |
   | **30 - 35**   | Mild obesity         |
   | **35 - 40**   | Moderate obesity     |
   | **>= 40**     | Morbid obesity       |

4. Muestra el IMC calculado y su clasificación al usuario.

---

## **Requisitos**

- **Java 11** o superior.
- **JUnit 5** (para pruebas unitarias).

---

## **Cómo Ejecutar el Proyecto**

### **1. Compilación**
Abre una terminal y ejecuta el siguiente comando para compilar todas las clases:
```bash
javac *.java

#  **Estructura del Proyecto
<pre>

Inicio
   ⬇
Solicitar peso y altura (IMCView)
   ⬇
Calcular IMC (BmiModel)
   ⬇
Clasificar IMC (BmiModel)
   ⬇
Mostrar resultado (IMCView)
   ⬇
Fin

</pre>

package numeros;

import javax.swing.JOptionPane;

public class Numeros {

    private int tam, cantidadDeVeces;
    float[] numeros;

    Numeros() {
        tam = 0;
        cantidadDeVeces = 0;
        numeros = null;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public float[] getNumeros() {
        return numeros;
    }

    public void setNumeros(float[] numeros) {
        this.numeros = numeros;
    }

    //Método para llenar el vector con los números 
    public void llenarVector() {
        numeros = new float[tam];
        for (int i = 0; i < tam; i++) {
            float aux = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el número de la posición: " + i));
            numeros[i] = aux;
        }
    }

    //Método para mostrar los datos en las posiciones pares e impares respectivamente
    public void mostrarDatos() {
        String contenidoPar = "", contenidoImpar = "";
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                contenidoPar += String.valueOf(numeros[i]) + " ";
            } else {
                contenidoImpar += String.valueOf(numeros[i]) + " ";
            }
        }
        JOptionPane.showMessageDialog(null, "Numeros que están las posiciones pares del vector\n" + contenidoPar);
        JOptionPane.showMessageDialog(null, "Numeros que están las posiciones impares del vector\n" + contenidoImpar);
    }

    //Método para buscar cuantas veces se repite algún número en el vector y que posiciones ocupa éste
    public void buscarNumero(float num) {
        String posicionesNumero = "";
        for (int i = 0; i < tam; i++) {
            if (numeros[i] == num) {
                cantidadDeVeces += 1;
                posicionesNumero += String.valueOf(i + " ");
            }
        }
        if (cantidadDeVeces == 0) {
            JOptionPane.showMessageDialog(null, "El número que intenta buscar no se encuentra en el vector\n¡¡Intentelo de nuevo!!");
        } else {
            if (cantidadDeVeces == 1) {
                JOptionPane.showMessageDialog(null, "El número se encuentra " + cantidadDeVeces + " vez en el vector"
                        + "\nSus posiciones en el vector son: " + posicionesNumero);
            } else {
                JOptionPane.showMessageDialog(null, "El número se encuentra " + cantidadDeVeces + " veces en el vector"
                        + "\nSus posiciones en el vector son: " + posicionesNumero);
            }

        }
        cantidadDeVeces = 0;
    }

    //Método para contar la cantidad de numeros inferiores al que dijite el usuario
    public int buscarCantidadNumeros(float num) {
        int cantidadDeNumeros = 0;
        for (int i = 0; i < tam; i++) {
            if (numeros[i] < num) {
                cantidadDeNumeros += 1;
            }
        }
        return cantidadDeNumeros;
    }
}

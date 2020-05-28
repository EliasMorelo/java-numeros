package numeros;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //Se crea un objeto de la clase número la cual contiene el vector que guardará los datos
        Numeros numero = new Numeros();
        //Se le pide al usuario que digite el tamaño del vector
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de numeros a ingresar"));
        numero.setTam(tam);
        //Se llena el vector
        numero.llenarVector();
        String op = "";
        int opcion = 0;
        do {
            op = JOptionPane.showInputDialog("¿Qué desea hacer?\n\n1. Mostrar los elementos en las posiciones pares e impares del vector, respectivamente"
                    + "\n2. Buscar número para ver cuantas veces se repite en el vector"
                    + "\n3. Cantidad de numeros menores a un número determinado"
                    + "\n4. Salir");

            opcion = Integer.parseInt(op);
            switch (opcion) {
                case 1:
                    numero.mostrarDatos();
                    break;
                case 2:
                    float num = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el número a buscar"));
                    numero.buscarNumero(num);
                    break;
                case 3:
                    float n = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el número"));
                    JOptionPane.showMessageDialog(null, "La cantidad de números es: " + numero.buscarCantidadNumeros(n));
                    break;
            }
        } while (opcion <= 3);
    }

}

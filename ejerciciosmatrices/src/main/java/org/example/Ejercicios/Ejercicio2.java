package org.example.Ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Definir la matriz identidad I
        int[][] I = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        // Definir las matrices A y B
        int[][] A = {{1, 2, 3}, {1, 1, 1}, {0, 1, -1}};
        int[][] B = {{1, 2, 1}, {0, 1, 0}, {1, 0, 1}};

        // Verificar si las matrices son multiplicables
        int filasA = A.length;
        int columnasA = A[0].length;
        int filasB = B.length;
        int columnasB = B[0].length;

        if (columnasA != filasB) {
            System.out.println("Las matrices no son multiplicables.");
            return;
        }

        // Crear la matriz resultante C
        int[][] C = new int[filasA][columnasB];

        // Multiplicar las matrices A y B
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Imprimir la matriz resultante C
        System.out.println("Matriz resultante C:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

}

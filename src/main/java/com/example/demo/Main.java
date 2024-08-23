package com.example.demo;

public class Main {
    public static void main(String[] args) {
        // Crear un tablero inicial
        int filas = 5; // Puedes ajustar el tamaño del tablero
        int columnas = 5;
        Tablero tablero = new Tablero(filas, columnas);

        // Inicializar el tablero con algunas células vivas
        tablero.setCelula(1, 2, true);
        tablero.setCelula(2, 2, true);
        tablero.setCelula(3, 2, true);

        // Crear una instancia del Juego de la Vida
        JuegoDeLaVida juego = new JuegoDeLaVida(tablero);

        // Aplicar las reglas del juego
        juego.aplicarReglas();

        // Mostrar el estado del tablero después de aplicar las reglas
        mostrarTablero(tablero);
    }

    // Método para mostrar el estado del tablero
    public static void mostrarTablero(Tablero tablero) {
        for (int i = 0; i < tablero.grid.length; i++) {
            for (int j = 0; j < tablero.grid[i].length; j++) {
                System.out.print(tablero.getCelula(i, j).estaViva() ? "O " : ". ");
            }
            System.out.println();
        }
    }
}

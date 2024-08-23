package com.example.demo;


public class Tablero {
    Celula[][] grid;

    public Tablero(int horizontal, int vertical){
        grid= new Celula[horizontal][vertical];
        for(int contA=0; contA<horizontal; contA++){
            for(int contB=0; contB<vertical; contB++){
                grid[contA][contB]= new Celula(false);
            }
        }
    }

    public void setCelula(int horizontal, int vertical, boolean viva){
        grid[horizontal][vertical].setViva(viva);
    }

    public Celula getCelula(int horizontal, int vertical){
        return grid[horizontal][vertical];
    }

    public int contarVecinosVivos(int horizontal, int vertical){
        int vivos = 0;
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                if(i==0 &&j==0){
                    int nuevaFila=horizontal+i;
                    int nuevaColumna=vertical+j;
                    if(nuevaFila>=0 && nuevaFila< grid.length && nuevaColumna >= 0
                            && nuevaColumna < grid[0].length) {
                        if(grid[nuevaFila][nuevaColumna].estaViva()){
                            vivos++;
                        }
                    }
                }
            }
        }
        return vivos;
    }
    
}

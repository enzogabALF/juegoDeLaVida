package com.example.demo;

public class ViveSiguienteTurno {
    public static Celula aplicar(boolean viva, int vecinosVivos){
        if(viva &&(vecinosVivos==2||vecinosVivos==3)){
            return new Celula(true);
        }
        return new Celula(viva);
    }
}

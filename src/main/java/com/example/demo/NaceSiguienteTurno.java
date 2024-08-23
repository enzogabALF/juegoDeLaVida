package com.example.demo;

public class NaceSiguienteTurno {
    public static Celula aplicar(boolean viva, int vecinosVivos){
        if(!viva && vecinosVivos==2){
            return new Celula(true);
        }
        return new Celula(viva);
    }
}

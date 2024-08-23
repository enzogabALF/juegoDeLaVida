package com.example.demo;

public class MuereSiguienteTurno {
    public static Celula aplicar(boolean viva, int vecinosVivos){
        if(viva && (vecinosVivos<2|| vecinosVivos>3)){
            return new Celula(false);
        }
        return new Celula(viva);
    }
}

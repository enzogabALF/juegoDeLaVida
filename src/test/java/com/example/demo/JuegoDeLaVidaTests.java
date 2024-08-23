package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class JuegoDeLaVidaTests  {

  @Test
  public void testCaso1(){
    Tablero tablero= new Tablero(3,3);
    tablero.setCelula(0,1,true);
    tablero.setCelula(1,1,true);
    tablero.setCelula(2,1,true);
    tablero.setCelula(1,2,true);
    tablero.setCelula(2,1,true);

    JuegoDeLaVida juego = new JuegoDeLaVida(tablero);
    juego.aplicarReglas();
    assertTrue(tablero.getCelula(1,0).estaViva());
    assertTrue(tablero.getCelula(1,1).estaViva());
    assertTrue(tablero.getCelula(1,2).estaViva());
    assertTrue(tablero.getCelula(0,1).estaViva());
    assertTrue(tablero.getCelula(2,1).estaViva());  
  }
  @Test
  public void testCaso2(){
    Tablero tablero = new Tablero(4,4);
    tablero.setCelula(1,1,true);
    tablero.setCelula(1,2,true);
    tablero.setCelula(2,1,true);
    tablero.setCelula(2,2,true);

    JuegoDeLaVida juego = new JuegoDeLaVida(tablero);
    juego.aplicarReglas();
    assertTrue(tablero.getCelula(1,1).estaViva());
    assertTrue(tablero.getCelula(1,2).estaViva());
    assertTrue(tablero.getCelula(2,1).estaViva());
    assertTrue(tablero.getCelula(2,2).estaViva());
  }
}

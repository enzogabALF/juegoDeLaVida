package com.example.demo;


public class  JuegoDeLaVida{
private Tablero tablero;

  public JuegoDeLaVida(Tablero tablero){
    this.tablero = tablero;
  }

  public void aplicarReglas(){
    int filas = tablero.grid.length;
    int columnas= tablero.grid[0].length;
    Celula[][] nuevoEstado = new Celula[filas][columnas];
    
    for (int i=0;i<filas; i++){
      for(int j=0; j< columnas;j++){
        
        int vecinosVivos= tablero.contarVecinosVivos(i,j);
        boolean viva = tablero.getCelula(i,j).estaViva();
        
        if(viva&&(vecinosVivos<2||vecinosVivos>3)){
          nuevoEstado[i][j]= MuereSiguienteTurno.aplicar(viva, vecinosVivos);
        }else if(!viva && vecinosVivos==3){
          nuevoEstado[i][j]= NaceSiguienteTurno.aplicar(viva, vecinosVivos);
        }else{
          nuevoEstado[i][j]= ViveSiguienteTurno.aplicar(viva, vecinosVivos);
        }
      }
      for(int a =  0;a<filas;a++){
        for(int j=0;j<columnas;j++){
          tablero.setCelula(a,j,nuevoEstado[a][j].estaViva());
        }
      }
    }
  }
}

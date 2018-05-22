package com.mycompany.aritmetica_modular;

public class Calculo {

    public Calculo() {
    }
    
    public static int[][] sumaMatriz(int[][] matriz){
        for (int i=0; i< matriz.length;i++){
            for (int j=0; j<matriz.length;i++){
                matriz[i][j] = i+j;
            }
        }
        return matriz;
    }
    
    public static int[][] mulMatriz(int[][] matriz){
        for (int i=0; i< matriz.length;i++){
            for (int j=0; j<matriz.length;i++){
                matriz[i][j] = i*j;
            }
        }
        return matriz;
    } 
    
}

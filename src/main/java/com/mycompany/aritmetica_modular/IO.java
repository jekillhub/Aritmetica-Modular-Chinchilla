
package com.mycompany.aritmetica_modular;

import java.util.Scanner;

public class IO {
    
    private int[][]tabla;
    
    public int[][] generarTabla(){
        Scanner sca= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero= sca.nextInt();
        this.tabla=new int[numero][numero];
        return this.tabla;
    }
    
    public static void mostrarTabla(int[][] tabla){
        for (int i=0; i< tabla.length;i++){
            for (int j=0; j<tabla.length;i++){
                System.out.print(tabla[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
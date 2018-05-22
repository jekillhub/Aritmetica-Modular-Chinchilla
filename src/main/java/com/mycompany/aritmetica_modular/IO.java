
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
    
    public void mostrarTabla(){
        for (int i=0; i< this.tabla.length;i++){
            for (int j=0; j<this.tabla.length;i++){
                System.out.print(this.tabla[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
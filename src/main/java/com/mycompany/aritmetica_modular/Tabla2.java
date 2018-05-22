
package com.mycompany.aritmetica_modular;
import java.util.Scanner;
public class Tabla2 {
    private int[][]tabla;
    
    public int[][] generarTabla(){
        Scanner sca= new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero= sca.nextInt();
        this.tabla=new int[numero][numero];
        return tabla;
    }
    
    public static void main(String args[]){
        
    }
}
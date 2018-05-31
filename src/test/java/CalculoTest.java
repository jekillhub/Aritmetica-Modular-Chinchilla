import com.mycompany.aritmetica_modular.Calculo;
import org.junit.Test;
import static org.junit.Assert.*;
import com.mycompany.aritmetica_modular.IO;
import org.junit.Ignore;

public class CalculoTest {
    
    @Ignore
    public void sumaMatrizTest(){
        int[][] matrizEsperada ={{0,1,2},{1,2,0},{2,0,1}};
        int[][] matrizIngresada = new int[3][3];
        assertArrayEquals(matrizEsperada, Calculo.sumaMatriz(matrizIngresada));
    }
    @Test
    public void multiplicarTest(){
        int[][] matrizEsperada ={{0,0,0},{0,1,2},{0,2,1}};
        int[][] matrizIngresada = new int[3][3];
        assertArrayEquals(matrizEsperada, Calculo.mulMatriz(matrizIngresada));
    }
}

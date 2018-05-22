import com.mycompany.aritmetica_modular.Calculo;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculoTest {
    
    @Test
    
    public static void sumaMatrizTest(){
        int[][] matrizEsperada ={{0,1,2},{1,2,3},{2,3,0}};
        int[][] matrizIngresada = new int[3][3];
        assertArrayEquals(matrizEsperada, Calculo.sumaMatriz(matrizIngresada));
    }
    
}

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    public static ArrayList<Veiculo> listaVeiculos;

    @BeforeAll
    public static void criaArrayList(){
        listaVeiculos = new ArrayList<>();

    }

    /*REPEATEDTEST DISPENSA ANOTACAO @TEST*/

    /*REPEATEDTEST*/

    @RepeatedTest(10)
    @DisplayName("Teste getnroRodas")
    void testaNroRodas() {
        Veiculo v = new Veiculo("aquatico","abcde", 0, 200);
        listaVeiculos.add(v);
        assertEquals(0, v.getNroRodas());
    }

    @RepeatedTest(value=3, name ="{displayName} : {currentRepetition}/{totalRepetitions}")
    @DisplayName("Teste getPotencia")
    void testaPotencia(){
        Veiculo v = new Veiculo("aquatico","abcde", 0, 200);
        listaVeiculos.add(v);
        assertEquals(200, v.getPotenciaMotor());
    }

    /*PARAMETERIZEDTEST*/

    @ParameterizedTest
    @ValueSource(ints = {0,1,2})
    void testRodasParametrizado(int parametro){
        Veiculo v = new Veiculo("aquatico","abcde", 0, 200);
        assertEquals(parametro, v.getNroRodas());
    }
}
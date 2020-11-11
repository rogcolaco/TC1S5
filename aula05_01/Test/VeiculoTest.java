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
        Veiculo v = new Veiculo("aquatico","abcde", parametro, 200);
        assertEquals(parametro, v.getNroRodas());
    }

    @ParameterizedTest
    @ValueSource(strings = {"abcde", "12345", "a2c4e"})
    void testChassiParametrizado(String parametro){
        Veiculo v = new Veiculo("aquatico",parametro, 0, 200);
        assertEquals(parametro, v.getNroChassi());
    }

    @ParameterizedTest
    @ValueSource(floats = {1.2f, 1.3f, 5.0f})
    void testFloatParametrizado(float parametro){
        Veiculo v = new Veiculo("aquatico","abcde", 0, 200, parametro);
        assertEquals(parametro, v.getA());
    }

    /*EXERCICIOS*/

    @Test
    @DisplayName("Teste compareTo")
    void testeCompara1(){
        Veiculo v1 = new Veiculo("aquatico","abcde", 0, 200);
        Veiculo v2 = v1.clonar();
        assertEquals(1, v1.compara1(v1,v2));
    }

    @Test
    @DisplayName("Teste ----")
    void testeCompara2(){
        Veiculo v1 = new Veiculo("aquatico","abcde", 0, 200);
        Veiculo v2 = v1.clonar();
        assertEquals(0, v1.compara2(v1,v2));
    }

    @Test
    @DisplayName("Teste clonar")
    void testeClonar(){
        Veiculo v1 = new Veiculo("aquatico","abcde", 0, 200);
        Veiculo v2 = v1.clonar();
        assertFalse(v1 == v2);
    }
}
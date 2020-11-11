import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    public static ArrayList<Veiculo> listaVeiculos;

    @BeforeAll
    public static void criaArrayList(){
        listaVeiculos = new ArrayList<>();

    }

    @Test
    @RepeatedTest(10)
    @DisplayName("Teste getnroRodas")
    void testaNroRodas() {
        Veiculo v = new Veiculo("aquatico","abcde", 0, 200);
        listaVeiculos.add(v);
        assertEquals(0, v.getNroRodas());
    }

    @Test
    @RepeatedTest(value=3, name ="Caso de teste número {currentRepetition}/{totalRepetitions}")
    void testaPotencia(){
        Veiculo v = new Veiculo("aquatico","abcde", 0, 200);
        listaVeiculos.add(v);
        assertEquals(200, v.getPotenciaMotor());
    }
}
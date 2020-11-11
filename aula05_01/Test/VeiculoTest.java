import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    @DisplayName("Teste getnroRodas")
    void test() {
        Veiculo v = new Veiculo("aquatico","abcde", 0, 200);
        assertEquals(0, v.getNroRodas());
    }

    @Test
    @DisplayName("xxxx")
    void clonar() {
    }

    @Test
    void compara1() {
    }

    @Test
    void compara2() {
    }
}
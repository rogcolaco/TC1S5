import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void adicaoTest() {
        Operations p = new Operations();
        assertEquals(10.0f,p.adicao(3.0f,7.0f));
    }

    @Test
    void subtracaoTest() {
        Operations p = new Operations();
        assertEquals(10.f,p.subtracao(13.0f,3.0f));
    }

    @Test
    void multiplicacaoTest() {
    }

    @Test
    void restoTest() {
    }
}
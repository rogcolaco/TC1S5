import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    static Operations p;

    @BeforeAll
    public static void  createObject(){
        p = new Operations();
    }

    @Test
    @DisplayName("Teste do método adição da classe Operations")
    void adicaoTest() {
        assertEquals(10.0f,p.adicao(3.0f,7.0f));
    }

    @Test
    @DisplayName("Teste do método subtração da classe Operations")
    void subtracaoTest() {
        assertEquals(10.f,p.subtracao(13.0f,3.0f));
    }

    @Test
    @DisplayName("Teste do método multiplicação da classe Operations")
    void multiplicacaoTest() {
        assertEquals(6.0f,p.multiplicacao(3.0f,2.0f));
    }

    @Test
    @DisplayName("Teste do método resto da classe Operations com assertEquals")
    void restoTest() {
        assertEquals(1,p.resto(5,2));
    }

    @Test
    @DisplayName("Teste do método resto da classe Operations com assertNotEquals")
    void restoTest2(){
        assertNotEquals(1,10,2);
    }
}
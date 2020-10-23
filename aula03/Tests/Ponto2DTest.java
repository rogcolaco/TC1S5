import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class Ponto2DTest {

    //@DisplayName("Teste-1A do construtor")

    @ParameterizedTest(name="Testa para x = {0}...")
    @ValueSource(ints = {2,3})
        void TestandoConstrutorPorX_Equals(int par){
        Ponto2D p = new Ponto2D(2,3);
        assertEquals(par,p.getX());
    }

    @Test
    //@DisplayName("Teste-2 do construtor")
    void TestandoConstrutorPorX_NotEquals(){
        Ponto2D p = new Ponto2D(2,3);
        assertNotEquals(0,p.getX());
    }

}
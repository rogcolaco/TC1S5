import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PontoTest {

    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
    class TestarPonto2D{
        @DisplayName("Teste do construtor da classe Ponto 2D")
        @ParameterizedTest(name="Testa para x = {0}...")
        @ValueSource(ints = {2,3})
        void Testando_Construtor_PorX_Equals(int par){
            Ponto2D p = new Ponto2D(2,3);
            assertEquals(par,p.getX());
        }

        @Test
        void Testando_construtor_geral_x_y(){
            Ponto2D p = new Ponto2D(4,5);
            assertAll("TEsta se as propriedades x e y foram incializadas corretamente",
                    () -> assertEquals(2,p.getX()),
                    () -> assertEquals(6, p.getY())
                    );
        }

        @Test
        @DisplayName("Teste Simples de assertArrayEquals")
        void testeArrayEquals(){
            String [] arr1 = new String[] {"olá","pw1"};
            String [] arr2 = new String[] {"olá","pw1"};
            assertArrayEquals(arr1,arr2);
        }

        @Test
        @DisplayName("Testa Booleano")
        void testecomparaXcom0(){
            Ponto2D p = new Ponto2D(0,4);
            assertFalse(p.comparaXcom0());
        }

    }

    @Nested
    @DisplayNameGeneration(ClasseEstendida.class)
    class TestarPonto3D{
        @ParameterizedTest(name="Testa para x = {0}...")
        @ValueSource(ints = {2,3})
        void Testando_Construtor_PorX_Equals(int par){
            Ponto3D p = new Ponto3D(2,3,4);
            assertEquals(par,p.getX());
        }

    }

}
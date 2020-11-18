import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class ExplosaoSolarDiariaTest {

    public static ArrayList<String> listaClassesExplosoes;


    @ParameterizedTest
    @DisplayName("Teste get/set Ciclo Solar")
    @Order(3)
    @ValueSource(ints = {0,1,2})
    void testCicloSolar(int parametro){
        ExplosaoSolarDiaria e = new ExplosaoSolarDiaria(parametro,"10/10/2020", 1.5f, listaClassesExplosoes);
        assertEquals(parametro, e.getCicloSolar());
    }

    @ParameterizedTest
    @DisplayName("Teste get/set Data")
    @Order(1)
    @ValueSource(strings = {"10/10/99", "05/08/84", "14/06/85"})
    void testData(String parametro){
        ExplosaoSolarDiaria e = new ExplosaoSolarDiaria(0,parametro, 1.5f, listaClassesExplosoes);
        assertEquals(parametro, e.getData());
    }

    @ParameterizedTest
    @DisplayName("Teste get/set Nível Máximo de Raios X")
    @Order(2)
    @ValueSource(floats = {1.5f, 0.3f, 2.0f})
    void testNivelMaxRaioX(float parametro){
        ExplosaoSolarDiaria e = new ExplosaoSolarDiaria(0,"10/10/2020", parametro, listaClassesExplosoes);
        assertEquals(parametro, e.getNivelMaximoRaioX());
    }

    @Test
    @DisplayName("Teste ArrayList listaClasseExplosoes")
    @Order(4)
    void testListaClasseExplosoes(){
        ArrayList<String> listaClasseExplosoes = new ArrayList<>();
        ArrayList<String> novaListaClasseExplosoes = new ArrayList<>();

        ExplosaoSolarDiaria e = new ExplosaoSolarDiaria(1,"10/10/20",2.3f,listaClasseExplosoes);
        e.adiciona1ClasseExplosao("Ana");
        e.adiciona1ClasseExplosao("Rita");
        e.adiciona1ClasseExplosao("Isis");
        e.adiciona1ClasseExplosao("Sara");

        novaListaClasseExplosoes.add("Ana");
        novaListaClasseExplosoes.add("Rita");
        novaListaClasseExplosoes.add("Isis");
        novaListaClasseExplosoes.add("Sara");

        assertArrayEquals(listaClasseExplosoes.toArray(),novaListaClasseExplosoes.toArray());
    }

    @Test
    @DisplayName("Teste Clone AssertAll")
    @Order(5)
    void testClonar(){
        ArrayList<String> listaClasseExplosoes = new ArrayList<>();

        ExplosaoSolarDiaria original = new ExplosaoSolarDiaria(1,"10/10/20",2.3f,listaClasseExplosoes);
        original.adiciona1ClasseExplosao("Ana");
        original.adiciona1ClasseExplosao("Rita");
        original.adiciona1ClasseExplosao("Isis");
        original.adiciona1ClasseExplosao("Sara");

        ExplosaoSolarDiaria clonada = original.clona();

        assertAll("Testa o método clonar",
                () -> assertEquals(1,clonada.getCicloSolar()),
                () -> assertEquals("10/10/20",clonada.getData()),
                () -> assertEquals(2.3f,clonada.getNivelMaximoRaioX()),
                () -> assertArrayEquals(listaClasseExplosoes.toArray(),clonada.retornaClassesExplosoes().toArray()),
                () -> assertNotSame(original,clonada)
        );
    }


    @Test
    @DisplayName("Testa se adiciona1ClasseExplosao não adiciona itens com mais de 4 caracteres")
    @Order(6)
    void testAddClasse() {
        ArrayList<String> listaExplosoes = new ArrayList<>();
        ArrayList<String> novaListaExplosoes = new ArrayList<>();
        ExplosaoSolarDiaria e = new ExplosaoSolarDiaria(1,"10/10/20",2.3f, listaExplosoes);

        /*ESPERA-SE QUE O MÉTODO  ADICIONA1CLASSEEXPLOSAO ACEITE OS VALORES ABAIXO (MAX =4)*/
        e.adiciona1ClasseExplosao("Ana");
        e.adiciona1ClasseExplosao("Sara");

        /*ESPERA-SE QUE O MÉTODO  ADICIONA1CLASSEEXPLOSAO NÃO ACEITE OS VALORES ABAIXO (MAX =4)*/
        e.adiciona1ClasseExplosao("Monica");
        e.adiciona1ClasseExplosao("Carla");

        /*COMPARA A LISTA CRIADA COM O METODO ADICIONA1CLASSEEXPLOSAO COM UM ARRAY LIST COM O RESULTADO ESPERADO*/
        novaListaExplosoes.add("Ana");
        novaListaExplosoes.add("Sara");

        assertArrayEquals(e.retornaClassesExplosoes().toArray(), novaListaExplosoes.toArray());

    }
}
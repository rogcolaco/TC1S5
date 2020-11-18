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

}
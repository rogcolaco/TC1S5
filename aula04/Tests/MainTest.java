import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private static Main p;

    @BeforeAll
    public static void criaObjeto(){
        p=new Main();
    }

    @Test
    @Tag("tag-1")
    public void casoTeste1(){
        assertTrue(p.retornaBoolean(true));
    }

    @Test
    @Tag("tag-1")
    public void casoTeste2(){
        assertFalse( p.retornaBoolean(false));
    }

    @Test
    @Tag("tag-2")
    public void casoTeste3(){
        assertTrue( p.retornaBoolean(false));
    }

    @Test
    @Tag("tag-2")
    public void casoTeste4(){
        assertFalse( p.retornaBoolean(true));
    }

}
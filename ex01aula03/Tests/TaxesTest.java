import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.*;

class TaxesTest {
    private static Taxes ir;

    @BeforeAll
    public static void criarObjeto(){
        ir = new Taxes();
    }

    @Test
    @EnabledOnJre({JRE.JAVA_8})
    public void classe1_Isento(){
        assertEquals("Isento",ir.aliquota(1500.00f));
    }

    @Test
    public void classe2_75(){
        assertEquals("7,5%",ir.aliquota(2000.00f));
    }

    @Test
    public void classe3_15(){
        assertEquals("15%",ir.aliquota(2900.00f));
    }

    @Test
    public void classe4_225(){
        assertEquals("22,5%",ir.aliquota(3500.00f));
    }

    @Test
    public void classe5_275(){
        assertEquals("27,5%",ir.aliquota(4500.00f));
    }

    @Test
    //HABILITA PARA UM SISTEMA OPERACIONAL ESPECÍFICO
    //@EnabledOnOs({OS.WINDOWS})

    //DESABILITA PARA UM SISTEMA OPERACIONAL ESPECÍFICO
    @DisabledOnOs({OS.WINDOWS})
    public void classeIR_all(){
        assertAll("Testa todas as alíquotas",
                () -> assertEquals("Isento",ir.aliquota(2000.00f)),
                () -> assertEquals("7,5%",ir.aliquota(2900.00f)),
                () -> assertEquals("15%",ir.aliquota(3500.00f)),
                () -> assertEquals("22,5%",ir.aliquota(4000.00f)),
                () -> assertEquals("27,5%",ir.aliquota(4000.00f))
                        );
    }

}
package com.iescastelar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {
    static App app;

    @BeforeAll
    public static void init(){
        app = new App();
    }

    /* Test para verificar que los test fallan
    @Test
    @DisplayName("Prueba roja")
    public void pruebaRojaTest(){
        Assertions.assertTrue(true, "Prueba de fallo");
    }*/

    @Test
    @DisplayName("Prueba del método suma:")
    void sumaTest() {
        Assertions.assertAll(
                ()->Assertions.assertEquals(4, app.suma(1, 3)),
                //()->Assertions.assertEquals(0, app.suma(1, 3), "Prueba de fallo"),
                ()->Assertions.assertEquals(-2, app.suma(1, -3))
        );
    }
}

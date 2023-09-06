package Test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Úlohy.ZakladneMatematickeOperacieCezMetody;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Testovanie zakladnych matematickych metod triedy  ZakladneMatematickeOperacieCezMetody")

public class TestujZakladneMatematickeOperacieCezMetody {
    @DisplayName("Testovanie sčitania triedy  ZakladneMatematickeOperacieCezMetody")
    @Test
    public void testScitanie() {
        assertEquals(15, ZakladneMatematickeOperacieCezMetody.scitanie(10, 5));
        assertEquals(13, ZakladneMatematickeOperacieCezMetody.scitanie(2, 11));
    }
    @DisplayName("Testovanie odčitania triedy  ZakladneMatematickeOperacieCezMetody")
    @Test
    public void testOdcitanie() {
        assertEquals(3, ZakladneMatematickeOperacieCezMetody.odcitanie(3, 0));
        assertEquals(1, ZakladneMatematickeOperacieCezMetody.odcitanie(1.99, 0.99));
    }
    @DisplayName("Testovanie delenia triedy  ZakladneMatematickeOperacieCezMetody")
    @Test
    public void testDelenia() {
        assertEquals(0, ZakladneMatematickeOperacieCezMetody.delenie(0,3));

        assertTrue(Double.isInfinite(ZakladneMatematickeOperacieCezMetody.delenie(3,0)));
        assertTrue(Double.isInfinite(3.0/0));

        assertEquals(15, ZakladneMatematickeOperacieCezMetody.delenie(30, 2));
    }
    @DisplayName("Testovanie násobenia triedy  ZakladneMatematickeOperacieCezMetody")
    @Test
    public void testNasobenia() {
        assertEquals(0, ZakladneMatematickeOperacieCezMetody.nasobenie(3, 0));
        assertEquals(60, ZakladneMatematickeOperacieCezMetody.nasobenie(30, 2));
    }
    @DisplayName("Testovanie modulo triedy  ZakladneMatematickeOperacieCezMetody")
    @Test
    public void testModulo() {
        assertEquals(0, ZakladneMatematickeOperacieCezMetody.modulo(5, 1));
        assertEquals(1, ZakladneMatematickeOperacieCezMetody.modulo(10, 3));
    }
}

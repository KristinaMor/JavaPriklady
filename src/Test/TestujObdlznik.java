package Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestujObdlznik {

    @BeforeEach
    void setUp() {
        System.out.println("Metóda setUp sa vykoná ako prvá pred jUnit testami");
    }

    @DisplayName("Testy na vypočet obvodu")
    @Test
    public void testVypocitajObvod() {
        assertEquals(9, Obdlznik.vypocitajObvod(2,3), "Výpočet obvodu by mal byť 10"); //prvý argument je očkávaná hodnota, druhy metoda ktoru volame, treti hlaska resp. spatná väzba ak test nepresiel
        assertEquals(12, Obdlznik.vypocitajObvod(2.5,3.5));
    }
    @DisplayName("Testy na vypočet obsahu")
    @Test
    public void testVypocitajObsah() {
        assertEquals(20, Obdlznik.vypocitajObsah(2, 10));
        assertEquals(8, Obdlznik.vypocitajObsah(2, 4));
    }
}

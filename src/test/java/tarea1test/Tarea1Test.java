package tarea1test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tarea1.Tarea1;

public class Tarea1Test {
    Tarea1 tarea1 = new Tarea1();

    @ParameterizedTest
    @CsvSource({
            "-1,-1",
            "0,0",
            "1231,1321",
            "-34,-43",
            "100000000,000000001",
            "1590,0951",
            "87600765, 56700678",
            "864230000, 000032468"
    })
    public void verifyInvertir(int number, String expected) {
        String actual = tarea1.invertir(number);
        Assertions.assertEquals(actual, expected);
    }
}

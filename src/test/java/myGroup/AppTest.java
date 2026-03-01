package myGroup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    public void testCalc(){
        assertEquals(5, App.addCalculator(2,3));
    }
}
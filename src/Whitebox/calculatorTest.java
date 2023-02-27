package Whitebox;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {
    private calculator c;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        c = new calculator();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void add() {
        double result = c.add(1,3);
        Assertions.assertEquals(4,result);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        try{
            double result = c.divide(1,0);
            Assertions.assertTrue(false);
        }
        catch(Exception exception){
            Assertions.assertTrue(true);
        }

    }
}
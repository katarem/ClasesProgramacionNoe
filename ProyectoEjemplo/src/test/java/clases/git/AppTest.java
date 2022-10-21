package clases.git;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest{
    @Test
    public void Test1() {
        assertEquals(10, App.sumar(2, 8));
    }
    @Test
    public void Test2() {
        assertEquals("HOLA", App.toCaps("hola"));
    }
}


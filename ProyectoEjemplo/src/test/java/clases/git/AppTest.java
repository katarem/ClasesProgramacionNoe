package clases.git;

import org.junit.Test;

import junit.framework.TestCase;

public class AppTest extends TestCase{
    @Test
    public void Test1() {
        assertEquals(10, App.sumar(2, 8));
    }
}


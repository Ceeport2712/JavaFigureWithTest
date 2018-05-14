package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Before
    public void setUp() throws Exception {
        Triangle triangle = new Triangle(3,4,5);
    }
    @Test
    public void validTriangelTest() throws  Exception{
        assertEquals("Треугольник");
    }

    }

    @Test
    public void getPerimeter() throws Exception {
        Triangle triangle = new Triangle(3,4,5);
        assertEquals(12 , triangle.getPerimeter(), 0);
    }
    @Test
    public void invalidTriangelTest() throws Exception {
        Triangle triangle = new Triangle(1, 2 ,3);
        assertNull(triangle.name);
    }

}
package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void setUp() throws Exception {
        triangle = new Triangle(3,4,5);
    }
    @Test
    public void validTriangelTest() throws  Exception{
        assertEquals("Треугольник", triangle.name);
        assertEquals(12 , triangle.getPerimeter(), 0);
    }

    @Test
    public void invalidTriangelTest() throws Exception {
        Triangle triangle = new Triangle(1, 2 ,3);
        assertNull(triangle.name);
    }

}
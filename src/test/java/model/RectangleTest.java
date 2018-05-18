package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


    public class RectangleTest {
        Rectangle rectangle;

        @Before
        public void setUp() throws Exception {
            rectangle = new Rectangle(3, 5, 3, 5);

        }

        @Test
        public void validRectangleTest() throws Exception {
            assertEquals("Прямоугольник", rectangle.name);
            assertEquals(16, rectangle.getPerimeter(), 0);
        }

        @Test
        public void invalidRectangleTest() throws Exception {
            rectangle = new Rectangle(1, 2, 3, 4);
            assertNull(rectangle.name);
        }
    }

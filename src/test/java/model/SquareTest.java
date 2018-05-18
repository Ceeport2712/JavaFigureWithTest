package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
                Square square;


                @Before
                public void setUp() throws Exception {
                    square = new Square(4, 4, 4, 4);

                }

                @Test
                public void validSquareTest() throws Exception {
                    assertEquals("Квадрат", square.name);
                    assertEquals(16, Square.getPerimeter(), 0);
                }

                @Test
                public void invalidSquareTest() throws Exception {
                    square = new Square(1, 2, 3, 4);
                    assertNull(square.name);
                }
    }

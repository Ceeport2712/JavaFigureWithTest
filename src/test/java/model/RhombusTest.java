package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



    public class RhombusTest {
        Rhombus rhombus;


        @Before
        public void setUp() throws Exception {
            rhombus = new Rhombus(3, 3, 3, 3);

        }

        @Test
        public void validRhombusTest() throws Exception {
            assertEquals("Ромб", rhombus.name);
            assertEquals(16, Rhombus.getPerimeter(), 0);
        }

        @Test
        public void invalidRhombusTest() throws Exception {
            rhombus = new Rhombus(1, 2, 3, 4);
            assertNull(rhombus.name);
        }
    }

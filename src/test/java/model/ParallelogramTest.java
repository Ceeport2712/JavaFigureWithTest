package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ParallelogramTest {
    Parallelogram parallelogram;

    @Before
    public void setUp() throws Exception {
        parallelogram = new Parallelogram(3, 6, 3, 6);

    }

    @Test
    public void validParallelogramTest() throws Exception {
        assertEquals("Паралеллограмм", parallelogram.name);
        assertEquals(18, parallelogram.getPerimeter(), 0);
    }

    @Test
    public void invalidParallelogramTest() throws Exception {
        parallelogram = new Parallelogram(1, 2, 3, 4);
        assertNull(parallelogram.name);
    }
}
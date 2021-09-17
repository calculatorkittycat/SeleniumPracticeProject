package com.cybertek.day06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertFalseTest {

    @Test
    public void testNum(){
        int num = 10;

        assertTrue(num > 9);

        assertTrue( !(num<5) );

        assertFalse( num < 5);
    }
}

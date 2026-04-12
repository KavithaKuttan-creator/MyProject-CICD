package com.example.demo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SampleTests {

    @Test
    @Tag("smoke")
    public void testBasicMath_shouldPass() {
        // A simple test verifying basic framework functionality
        assertEquals(4, 2 + 2, "2 + 2 should be 4");
    }

    @Test
    public void testLogic_shouldPass() {
        assertTrue("Continuous Testing".contains("Testing"), "String should contain Testing");
    }

    /* 
    // Uncomment this test to simulate a failure during Day 2 Lab!
    @Test
    @Tag("smoke")
    public void testDeliberateFailure() {
        assertEquals("Green", "Red", "This test is designed to fail to demonstrate exit codes");
    }
    */
}

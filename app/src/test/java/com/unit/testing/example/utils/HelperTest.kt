package com.unit.testing.example.utils

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class HelperTest {

    lateinit var helper: Helper

    @Before
    fun setUp() {
        helper = Helper()
        println("Before every test case")
    }

    @After
    fun tearDown() {
        println("After every test case")
    }

    @Test
    fun isPalindrome() {
        //Arrange
        //Act
        val result = helper.isPalindrome("")
        //Assert
        assertEquals(true, result)
    }

    @Test
    fun isPalindrome_inputString_level_expectedTrue() {
        //Arrange
        val helper = Helper()
        //Act
        val result = helper.isPalindrome("a")
        //Assert
        assertEquals(true, result)
    }
}
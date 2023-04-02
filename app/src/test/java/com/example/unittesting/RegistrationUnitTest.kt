package com.example.unittesting



import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUnitTest{
    @Test
    fun `empty username return false` (){
        val result = Registration.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `valid username and correct repeated password return true` (){
        val result = Registration.validateRegistrationInput(
            "Mona",
            "123",
            "123"
        )
        assertThat(result).isTrue()

    }

    @Test
    fun `exist username return false` (){
        val result = Registration.validateRegistrationInput(
            "Peter",
            "123",
            "123"
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `when password not equal to confirmed password return false` (){
        val result = Registration.validateRegistrationInput(
            "Ali",
            "124",
            "123"
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `password is less than two digits return false` (){
        val result = Registration.validateRegistrationInput(
            "Ali",
            "1",
            "1"
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `empty password return false` (){
        val result = Registration.validateRegistrationInput(
            "Ali",
            "",
            ""
        )
        assertThat(result).isFalse()

    }
}
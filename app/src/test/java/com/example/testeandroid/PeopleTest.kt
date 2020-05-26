package com.example.testeandroid

import com.example.testeandroid.models.People
import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith


class PeopleTest {

    @Test(expected = IllegalArgumentException::class)
    public fun peopleForAgeLowerZeroNewException(){
        val people = People("test", -5, 1.6)
    }

    @Test
    public fun peopleForAgeLower16NotVote(){
        val people = People("test", 15)
        assertFalse(people.canVote())
    }

    @Test
    public fun peopleForAgeBigger16CanVote(){
        val people = People("test", 53)
        assertTrue(people.canVote())
    }

}
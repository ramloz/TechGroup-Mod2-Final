package herbasluis;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestSubject {

    @Test
    public void TestAdd(){
        Subject testSubjects = new Subject();
        assertTrue(testSubjects.isEmpty());
        assertTrue(testSubjects.add("Mathematics", "545154"));
        assertFalse(testSubjects.isEmpty());
        assertFalse(testSubjects.add("Mathematics", "545154"));
        assertTrue(testSubjects.add("Languaje", "545154"));
    }

    @Test
    public void TestChangeTeacher(){


    }

}

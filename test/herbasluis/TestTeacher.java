package herbasluis;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestTeacher {

    @Test
    public void TestAddTeacher(){
        Teacher<String> teachers = new Teacher<String>();
        Person<String> persons = new Person<String>();
        assertTrue(persons.isEmpty());
        assertTrue(teachers.isEmpty());
        teachers.add("Juan", "Perez", "11/01/1990", "97851465", "Mathematics", persons);
        assertFalse(persons.isEmpty());
        assertFalse(teachers.isEmpty());
        assertTrue(persons.containsID("97851465"));
        assertTrue(persons.containsFN("Juan", "Perez"));
        assertTrue(teachers.contains("97851465"));
        assertEquals("Mathematics", teachers.getSubjects("97851465").get(0).toString());
    }

    @Test
    public void AddSubject(){
        Teacher<String> teachers = new Teacher<String>();
        Person<String> persons = new Person<String>();
        teachers.add("Juan", "Perez", "11/01/1990", "97851465", "Mathematics", persons);
        teachers.addSubject("97851465", "Arithmethics");
        assertEquals("Mathematics", teachers.getSubjects("97851465").get(0).toString());
        assertEquals("Arithmethics", teachers.getSubjects("97851465").get(1).toString());
    }

    @Test
    public void TestDuplicateTeacher(){
        Teacher<String> teachers = new Teacher<String>();
        Person<String> persons = new Person<String>();
        teachers.add("Juan", "Perez", "11/01/1990", "97851465", "Mathematics", persons);
        assertFalse(teachers.add("Juan", "Perez", "11/01/1990", "97851465", "Mathematics", persons));
    }
}

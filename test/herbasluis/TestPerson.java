package herbasluis;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestPerson {

    @Test
    public void TestAddPerson(){
        Person<String> personList = new Person<String>();

        assertTrue(personList.isEmpty());
        personList.add("Juan", "Perez", "30-jan-90", "8575844");
        assertFalse(personList.isEmpty());
        assertTrue(personList.containsID("8575844"));
        assertTrue(personList.containsFN("Juan", "Perez"));
        assertFalse(personList.containsID("5542151"));
        assertFalse(personList.containsFN("Cosme", "Fulanito"));
        personList.add("Cosme", "Fulanito", "30-jan-90", "5542151");
        assertTrue(personList.containsID("5542151"));
        assertTrue(personList.containsFN("Cosme", "Fulanito"));
    }

    @Test
    public void TestNotAddduplicate(){
        Person<String> personList = new Person<String>();
        personList.add("Juan", "Perez", "30-jan-90", "8575844");
        assertTrue(personList.containsID("8575844"));
        assertTrue(personList.containsFN("Juan", "Perez"));
        assertFalse(personList.add("Juan", "Perez", "30-jan-90", "8575844"));

    }



}

package herbasluis;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class TestStudent {

    @Test
    public void TestAddStudent(){
        Person<String> persons = new Person<>();
        Student<String> TestStudents = new Student<>();
        ArrayList subjects = new ArrayList();
        subjects.add("Mathematics");
        subjects.add("Science");
        assertTrue(TestStudents.add("Jose", "Rodriguez", "30-jan-90", "454165", "First A", subjects, persons));
        assertFalse(TestStudents.add("Jose", "Rodriguez", "30-jan-90", "454165", "First A", subjects, persons));
        assertEquals(1, TestStudents.size());
        assertTrue(TestStudents.add("Sultana", "Claros", "30-jan-90", "454165845", "First A", subjects, persons));
        assertEquals(2, TestStudents.size());
    }

    @Test
    public void TestAdvanceCourse(){

    }

    @Test
    public void RemoveStudent(){

    }

    @Test
    public void GetReports(){

    }


}

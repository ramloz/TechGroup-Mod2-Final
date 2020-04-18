package herbasluis;

import org.junit.Test;

import static org.junit.Assert.*;



public class TestFileBridge {

    @Test
    public void testValidFile(){
        FileBridge valid = new FileBridge();


        assertTrue(valid.getFile("test/test.json"));
        //assertTrue(valid.getFile("test/test.csv"));
    }

    @Test
    public void testInvalidFile(){
        FileBridge invalid = new FileBridge();
        assertFalse(invalid.getFile("ADGADGQEdg43"));
        assertFalse(invalid.getFile("tes/test.json"));
        assertFalse(invalid.getFile("test/testo.json"));
    }
}

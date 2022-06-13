package artifact;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }
    
    @Test
    public void testgetString1() {
        String result = myString.getString();
        assertEquals(null, result);
    }
    
    @Test
    public void testgetString2() {
        myString.setString("awdaw 1 duhawuid");
        String result = myString.getString();
        assertEquals("awdaw 1 duhawuid", result);
    }
    
    @Test
    public void testsetString3() {
        myString.setString(" ");
        String result = myString.getString();
        assertEquals(" ", result);
    }
    @Test
    public void testsetString4() {
        myString.setString("");
        String result = myString.getString();
        assertEquals("", result);
    }

    @Test
    public void testsetString5() {
        myString.setString("1");
        String result = myString.getString();
        assertEquals("1", result);
    }
    @Test
    public void detectCapitalUseTest1() {
        myString.setString("aBc");
        boolean result = myString.detectCapitalUse();
        assertEquals("aBc", result);
    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("abc");
        boolean result = myString.detectCapitalUse();
        assertEquals(false, result);
    }
    @Test
    public void detectCapitalUseTest3() {
        myString.setString("A");
        boolean result = myString.detectCapitalUse();
        assertEquals(true, result);
    }
    @Test
    public void detectCapitalUseTest4() {
        myString.setString("aBc");
        boolean result = myString.detectCapitalUse();
        assertEquals(true, result);
    }

    @Test
    public void detectCapitalUseTest5() {
        myString.setString("ABC");
        boolean result = myString.detectCapitalUse();
        assertEquals(true, result);
    }
    @Test
    public void detectCapitalUseTest6() {
        myString.setString(" 5 a B c");
        boolean result = myString.detectCapitalUse();
        assertEquals(true, result);
    }


    
	/*
    public void testCount2() { //This test checks whether method count returns the correct output, returning the amount of actual words in the string
        manipulatedstring.setString("The value , here should b six");
        int length = manipulatedstring.count();
        assertEquals(6, length);
    	//fail("Not yet implemented");
    }
    
    public void testRemoveNthCharacter1() { //This test checks whether method RemoveNthCharacter suitably throws an IndexOutOfBoundsException if n > string.length
        manipulatedstring.setString("ABCDEF");
        Throwable exception = Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
        manipulatedstring.removeNthCharacter(7,false);
        });
    }
    */


}
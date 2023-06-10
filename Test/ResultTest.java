import org.junit.jupiter.api.Test;
import studentdatabase.Prize;
import studentdatabase.Result;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @Test
    void getTopicCode1() {
        Result result = new Result("M1", "A");
        assertEquals("M1", result.getTopicCode());
    }

    @Test
    void getTopicCode2() {
        Result result = new Result();
        assertEquals(null, result.getTopicCode());
    }

    @Test
    void getTopicCode3() {
        Result result = new Result("", "A");
        assertEquals("", result.getTopicCode());
    }

    @Test
    void setTopicCode1() {
        Result result = new Result("M1", "A");
        result.setTopicCode("");
        assertEquals("", result.getTopicCode());
    }

    @Test
    void setTopicCode2() {
        Result result = new Result();
        result.setTopicCode("M2");
        assertEquals("M2", result.getTopicCode());
    }

    @Test
    void setTopicCode3() {
        Result result = new Result("", "A");
        result.setTopicCode(null);
        assertEquals(null, result.getTopicCode());
    }

    @Test
    void getGrade1() {
        Result result = new Result("M1", "A");
        assertEquals("A", result.getGrade());
    }

    @Test
    void getGrade2() {
        Result result = new Result();
        assertEquals(null, result.getGrade());
    }

    @Test
    void getGrade3() {
        Result result = new Result("M2", "");
        assertEquals("", result.getGrade());
    }

    @Test
    void setGrade1() {
        Result result = new Result("M1", "A");
        result.setGrade("");
        assertEquals("", result.getGrade());
    }

    @Test
    void setGrade2() {
        Result result = new Result();
        result.setGrade("C");
        assertEquals("C", result.getGrade());
    }

    @Test
    void setGrade3() {
        Result result = new Result("M1", "A");
        result.setGrade(null);
        assertEquals(null, result.getGrade());
    }

    @Test
    void getMarks1() {
        Result result = new Result("M1", "A",1);
        assertEquals(1, result.getMarks());
    }

    @Test
    void getMarks2() {
        Result result = new Result();
        assertEquals((Integer) null, result.getMarks());
    }

    @Test
    void getMarks3() {
        Result result = new Result("M2", "B",0);
        assertEquals(0, result.getMarks());
    }

    @Test
    void setMarks1() {
        Result result = new Result("M1", "A",1);
        result.setMarks(0);
        assertEquals(0, result.getMarks());
    }

    @Test
    void setMarks2() {
        Result result = new Result();
        result.setMarks(0);
        assertEquals(0, result.getMarks());
    }

    @Test
    void setMarks3() {
        Result result = new Result("M1", "A",2);
        result.setMarks(3);
        assertEquals(3, result.getMarks());
    }

    @Test
    public void testToString1() {
        Result result = new Result();
        String expectedString = "null null ";
        assertEquals(expectedString, result.toString());
    }

    @Test
    public void testToString2() {
        Result result = new Result("", "",0);
        String expectedString = "  ";
        assertEquals(expectedString, result.toString());
    }

    @Test
    public void testToString3() {
        Result result = new Result("M1", "A",2);
        String expectedString = "M1 A 2";
        assertEquals(expectedString, result.toString());
    }
}
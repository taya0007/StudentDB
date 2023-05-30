//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import studentdatabase.Result;

class ResultTest {
    ResultTest() {
    }

    @Test
    void getTopicCode1() {
        Result result = new Result("M1", "A");
        Assertions.assertEquals("M1", result.getTopicCode());
    }

    @Test
    void getTopicCode2() {
        Result result = new Result();
        Assertions.assertEquals((Object)null, result.getTopicCode());
    }

    @Test
    void getTopicCode3() {
        Result result = new Result("", "A");
        Assertions.assertEquals("", result.getTopicCode());
    }

    @Test
    void setTopicCode1() {
        Result result = new Result("M1", "A");
        result.setTopicCode("");
        Assertions.assertEquals("", result.getTopicCode());
    }

    @Test
    void setTopicCode2() {
        Result result = new Result();
        result.setTopicCode("M2");
        Assertions.assertEquals("M2", result.getTopicCode());
    }

    @Test
    void setTopicCode3() {
        Result result = new Result("", "A");
        result.setTopicCode((String)null);
        Assertions.assertEquals((Object)null, result.getTopicCode());
    }

    @Test
    void getGrade1() {
        Result result = new Result("M1", "A");
        Assertions.assertEquals("A", result.getGrade());
    }

    @Test
    void getGrade2() {
        Result result = new Result();
        Assertions.assertEquals((Object)null, result.getGrade());
    }

    @Test
    void getGrade3() {
        Result result = new Result("M2", "");
        Assertions.assertEquals("", result.getGrade());
    }

    @Test
    void setGrade1() {
        Result result = new Result("M1", "A");
        result.setGrade("");
        Assertions.assertEquals("", result.getGrade());
    }

    @Test
    void setGrade2() {
        Result result = new Result();
        result.setGrade("C");
        Assertions.assertEquals("C", result.getGrade());
    }

    @Test
    void setGrade3() {
        Result result = new Result("M1", "A");
        result.setGrade((String)null);
        Assertions.assertEquals((Object)null, result.getGrade());
    }

    @Test
    void getMarks1() {
        Result result = new Result("M1", "A", 1);
        Assertions.assertEquals(1, result.getMarks());
    }

    @Test
    void getMarks2() {
        Result result = new Result();
        Assertions.assertEquals((Integer)null, result.getMarks());
    }

    @Test
    void getMarks3() {
        Result result = new Result("M2", "B", 0);
        Assertions.assertEquals(0, result.getMarks());
    }

    @Test
    void setMarks1() {
        Result result = new Result("M1", "A", 1);
        result.setMarks(0);
        Assertions.assertEquals(0, result.getMarks());
    }

    @Test
    void setMarks2() {
        Result result = new Result();
        result.setMarks(0);
        Assertions.assertEquals(0, result.getMarks());
    }

    @Test
    void setMarks3() {
        Result result = new Result("M1", "A", 2);
        result.setMarks(3);
        Assertions.assertEquals(3, result.getMarks());
    }

    @Test
    public void testToString1() {
        Result result = new Result();
        String expectedString = "null null ";
        Assertions.assertEquals(expectedString, result.toString());
    }

    @Test
    public void testToString2() {
        Result result = new Result("", "", 0);
        String expectedString = "  ";
        Assertions.assertEquals(expectedString, result.toString());
    }

    @Test
    public void testToString3() {
        Result result = new Result("M1", "A", 2);
        String expectedString = "M1 A 2";
        Assertions.assertEquals(expectedString, result.toString());
    }
}

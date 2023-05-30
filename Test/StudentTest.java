//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import studentdatabase.Result;
import studentdatabase.Student;

class StudentTest {
    StudentTest() {
    }

    @Test
    void getStudentNumber1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        Assertions.assertEquals(123456, student.getStudentNumber());
    }

    @Test
    void getStudentNumber2() {
        Student student = new Student(0, "Smith", "John", "Medicine");
        Assertions.assertEquals(0, student.getStudentNumber());
    }

    @Test
    void getStudentNumber3() {
        Student student = new Student();
        Assertions.assertEquals((Integer)null, student.getStudentNumber());
    }

    @Test
    void setStudentNumber1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.setStudentNumber(0);
        Assertions.assertEquals(0, student.getStudentNumber());
    }

    @Test
    void setStudentNumber2() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.setStudentNumber(0);
        Assertions.assertEquals(0, student.getStudentNumber());
    }

    @Test
    void setStudentNumber3() {
        Student student = new Student();
        student.setStudentNumber(134567);
        Assertions.assertEquals(134567, student.getStudentNumber());
    }

    @Test
    void getFamilyName1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        Assertions.assertEquals("Smith", student.getFamilyName());
    }

    @Test
    void getFamilyName2() {
        Student student = new Student(892793, "", "John", "Medicine");
        Assertions.assertEquals("", student.getFamilyName());
    }

    @Test
    void getFamilyName3() {
        Student student = new Student();
        Assertions.assertEquals((Object)null, student.getFamilyName());
    }

    @Test
    void setFamilyName1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.setFamilyName("");
        Assertions.assertEquals("", student.getFamilyName());
    }

    @Test
    void setFamilyName2() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.setFamilyName((String)null);
        Assertions.assertEquals((Object)null, student.getFamilyName());
    }

    @Test
    void setFamilyName3() {
        Student student = new Student();
        student.setFamilyName("Jones");
        Assertions.assertEquals("Jones", student.getFamilyName());
    }

    @Test
    void getGiverName1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        Assertions.assertEquals("John", student.getGiverName());
    }

    @Test
    void getGiverName2() {
        Student student = new Student(892793, "Smith", "", "Medicine");
        Assertions.assertEquals("", student.getGiverName());
    }

    @Test
    void getGiverName3() {
        Student student = new Student();
        Assertions.assertEquals((Object)null, student.getGiverName());
    }

    @Test
    void setGiverName1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.setGiverName("");
        Assertions.assertEquals("", student.getGiverName());
    }

    @Test
    void setGiverName2() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.setGiverName((String)null);
        Assertions.assertEquals((Object)null, student.getGiverName());
    }

    @Test
    void setGiverName3() {
        Student student = new Student();
        student.setGiverName("Jones");
        Assertions.assertEquals("Jones", student.getGiverName());
    }

    @Test
    void getDegree1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        Assertions.assertEquals("Medicine", student.getDegree());
    }

    @Test
    void getDegree2() {
        Student student = new Student(892793, "Smith", "John", "");
        Assertions.assertEquals("", student.getDegree());
    }

    @Test
    void getDegree3() {
        Student student = new Student();
        Assertions.assertEquals((Object)null, student.getDegree());
    }

    @Test
    void setDegree1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.setDegree("");
        Assertions.assertEquals("", student.getDegree());
    }

    @Test
    void setDegree2() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.setDegree((String)null);
        Assertions.assertEquals((Object)null, student.getDegree());
    }

    @Test
    void setDegree3() {
        Student student = new Student();
        student.setDegree("IT");
        Assertions.assertEquals("IT", student.getDegree());
    }

    @Test
    public void addResult1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        Result result = new Result("Biology", "A");
        student.addResult(result);
        Assertions.assertEquals(1, student.getResults().size());
        Assertions.assertEquals(result, student.getResults().get(0));
    }

    @Test
    public void addResult2() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        Result result = new Result((String)null, "");
        student.addResult(result);
        Assertions.assertEquals(result, student.getResults().get(0));
    }

    @Test
    public void addResult3() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        Result result = new Result();
        student.addResult(result);
        Assertions.assertEquals(result, student.getResults().get(0));
    }

    @Test
    public void testToString1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.addResult(new Result("Biology", "A"));
        student.addResult(new Result("Anatomy", "B"));
        String expectedString = "Academic record for John Smith(123456)\nDegree: Medicine\nBiology A \nAnatomy B \n";
        Assertions.assertEquals(expectedString, student.toString());
    }

    @Test
    public void testToString2() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.addResult(new Result());
        student.addResult(new Result());
        String expectedString = "Academic record for John Smith(123456)\nDegree: Medicine\nnull null \nnull null \n";
        Assertions.assertEquals(expectedString, student.toString());
    }

    @Test
    public void testToString3() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.addResult(new Result((String)null, (String)null));
        student.addResult(new Result((String)null, (String)null));
        String expectedString = "Academic record for John Smith(123456)\nDegree: Medicine\nnull null \nnull null \n";
        Assertions.assertEquals(expectedString, student.toString());
    }

    @Test
    public void testToString4() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.addResult(new Result("", ""));
        student.addResult(new Result("", ""));
        String expectedString = "Academic record for John Smith(123456)\nDegree: Medicine\n  \n  \n";
        Assertions.assertEquals(expectedString, student.toString());
    }
}

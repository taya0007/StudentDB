import org.junit.jupiter.api.Test;
import studentdatabase.MedStudent;
import studentdatabase.Result;
import studentdatabase.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getStudentNumber1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        assertEquals(123456, student.getStudentNumber());
    }

    @Test
    void getStudentNumber2() {
        Student student = new Student(0, "Smith", "John", "Medicine");
        assertEquals(0, student.getStudentNumber());
    }

    @Test
    void getStudentNumber3() {
        Student student = new Student();
        assertEquals((Integer) null, student.getStudentNumber());
    }

    @Test
    void setStudentNumber1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.setStudentNumber(0);
        assertEquals(0, student.getStudentNumber());
    }

    @Test
    void setStudentNumber2() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.setStudentNumber(0);
        assertEquals(0, student.getStudentNumber());
    }

    @Test
    void setStudentNumber3() {
        Student student = new Student();
        student.setStudentNumber(134567);
        assertEquals(134567, student.getStudentNumber());
    }

    @Test
    void getFamilyName1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        assertEquals("Smith", student.getFamilyName());
    }

    @Test
    void getFamilyName2() {
        Student student = new Student(892793, "", "John", "Medicine");
        assertEquals("", student.getFamilyName());
    }

    @Test
    void getFamilyName3() {
        Student student = new Student();
        assertEquals( null, student.getFamilyName());
    }

    @Test
    void setFamilyName1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.setFamilyName("");
        assertEquals("", student.getFamilyName());
    }

    @Test
    void setFamilyName2() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.setFamilyName(null);
        assertEquals(null, student.getFamilyName());
    }

    @Test
    void setFamilyName3() {
        Student student = new Student();
        student.setFamilyName("Jones");
        assertEquals("Jones", student.getFamilyName());
    }

    @Test
    void getGiverName1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        assertEquals("John", student.getGiverName());
    }

    @Test
    void getGiverName2() {
        Student student = new Student(892793, "Smith", "", "Medicine");
        assertEquals("", student.getGiverName());
    }

    @Test
    void getGiverName3() {
        Student student = new Student();
        assertEquals( null, student.getGiverName());
    }

    @Test
    void setGiverName1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.setGiverName("");
        assertEquals("", student.getGiverName());
    }

    @Test
    void setGiverName2() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.setGiverName(null);
        assertEquals(null, student.getGiverName());
    }

    @Test
    void setGiverName3() {
        Student student = new Student();
        student.setGiverName("Jones");
        assertEquals("Jones", student.getGiverName());
    }

    @Test
    void getDegree1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        assertEquals("Medicine", student.getDegree());
    }

    @Test
    void getDegree2() {
        Student student = new Student(892793, "Smith", "John", "");
        assertEquals("", student.getDegree());
    }

    @Test
    void getDegree3() {
        Student student = new Student();
        assertEquals( null, student.getDegree());
    }

    @Test
    void setDegree1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.setDegree("");
        assertEquals("", student.getDegree());
    }

    @Test
    void setDegree2() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.setDegree(null);
        assertEquals(null, student.getDegree());
    }

    @Test
    void setDegree3() {
        Student student = new Student();
        student.setDegree("IT");
        assertEquals("IT", student.getDegree());
    }

    @Test
    public void addResult1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        Result result = new Result("Biology", "A");
        student.addResult(result);
        assertEquals(1, student.getResults().size());
        assertEquals(result, student.getResults().get(0));
    }

    @Test
    public void addResult2() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        Result result = new Result(null, "");
        student.addResult(result);
        assertEquals(result, student.getResults().get(0));
    }

    @Test
    public void addResult3() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        Result result = new Result();
        student.addResult(result);
        assertEquals(result, student.getResults().get(0));
    }

    @Test
    public void testToString1() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.addResult(new Result("Biology", "A"));
        student.addResult(new Result("Anatomy", "B"));
        String expectedString = "Academic record for John Smith(123456)\n" +
                "Degree: Medicine\n" +
                "Biology A \n" +
                "Anatomy B \n";
        assertEquals(expectedString, student.toString());
    }

    @Test
    public void testToString2() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.addResult(new Result());
        student.addResult(new Result());
        String expectedString = "Academic record for John Smith(123456)\n" +
                "Degree: Medicine\n" +
                "null null \n" +
                "null null \n";
        assertEquals(expectedString, student.toString());
    }

    @Test
    public void testToString3() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.addResult(new Result(null, null));
        student.addResult(new Result(null, null));
        String expectedString = "Academic record for John Smith(123456)\n" +
                "Degree: Medicine\n" +
                "null null \n" +
                "null null \n";
        assertEquals(expectedString, student.toString());
    }

    @Test
    public void testToString4() {
        Student student = new Student(123456, "Smith", "John", "Medicine");
        student.addResult(new Result("", ""));
        student.addResult(new Result("", ""));
        String expectedString = "Academic record for John Smith(123456)\n" +
                "Degree: Medicine\n" +
                "  \n" +
                "  \n";
        assertEquals(expectedString, student.toString());
    }
}
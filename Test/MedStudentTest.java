import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import studentdatabase.ArtsStudent;
import studentdatabase.MedStudent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MedStudentTest {

    @Test
    void addPrize1() {
        MedStudent Stu = new MedStudent(1,"John","Smith","IT");
        Stu.addPrize("Prize1");
        Stu.addPrize("Prize2");
        List<String> ans = Stu.getPrizes();
        List<String> Expected = new ArrayList<>(
                Arrays.asList("Prize1","Prize2"));
        assertEquals(Expected,ans);
    }

    @Test
    void addPrize2() {
        MedStudent Stu = new MedStudent(1,"John","Smith","IT");
        Stu.addPrize("");
        Stu.addPrize("");
        List<String> ans = Stu.getPrizes();
        List<String> Expected = new ArrayList<>(
                Arrays.asList("",""));
        assertEquals(Expected,ans);
    }

    @Test
    void addPrize3() {
        MedStudent Stu = new MedStudent(1,"John","Smith","IT");
        Stu.addPrize(null);
        Stu.addPrize(null);
        List<String> ans = Stu.getPrizes();
        List<String> Expected = new ArrayList<>(
                Arrays.asList(null,null));
        assertEquals(Expected,ans);
    }

    @Test
    void setPrizes1() {
        MedStudent Stu = new MedStudent(1,"John","Smith","IT");
        List<String> List = new ArrayList<>(
                Arrays.asList(null,null));
        Stu.setPrizes(List);
        List<String> ans = Stu.getPrizes();
        List<String> Expected = new ArrayList<>(
                Arrays.asList(null,null));
        assertEquals(Expected,ans);
    }

    @Test
    void setPrizes2() {
        MedStudent Stu = new MedStudent(1,"John","Smith","IT");
        List<String> List = new ArrayList<>(
                Arrays.asList("",""));
        Stu.setPrizes(List);
        List<String> ans = Stu.getPrizes();
        List<String> Expected = new ArrayList<>(
                Arrays.asList("",""));
        assertEquals(Expected,ans);
    }

    @Test
    void setPrizes3() {
        MedStudent Stu = new MedStudent(1,"John","Smith","IT");
        List<String> List = new ArrayList<>(
                Arrays.asList("Prize1","Prize2"));
        Stu.setPrizes(List);
        List<String> ans = Stu.getPrizes();
        List<String> Expected = new ArrayList<>(
                Arrays.asList("Prize1","Prize2"));
        assertEquals(Expected,ans);
    }

    @Test
    void getPrizesString1() {
        MedStudent medStudent = new MedStudent(123456, "Smith", "John", "Medicine");
        medStudent.addPrize("Prize1");
        medStudent.addPrize("Prize2");
        String expectedPrizesString = "Prize: Prize1\nPrize: Prize2\n";
        assertEquals(expectedPrizesString, medStudent.getPrizesString());
    }

    @Test
    void getPrizesString2() {
        MedStudent medStudent = new MedStudent(123456, "Smith", "John", "Medicine");
        medStudent.addPrize("");
        medStudent.addPrize("");
        String expectedPrizesString = "Prize: \nPrize: \n";
        assertEquals(expectedPrizesString, medStudent.getPrizesString());
    }

    @Test
    void getPrizesString3() {
        MedStudent medStudent = new MedStudent(123456, "Smith", "John", "Medicine");
        medStudent.addPrize(null);
        medStudent.addPrize(null);
        String expectedPrizesString = "Prize: null\nPrize: null\n";
        assertEquals(expectedPrizesString, medStudent.getPrizesString());
    }
    @ParameterizedTest
    @ValueSource(strings = {"Prize1", ""," ","Prize2"})
    void getPrizesString4(String prize) {
        MedStudent medStudent = new MedStudent(123456, "Smith", "John", "Medicine");
        medStudent.addPrize(prize);
        String expectedPrizesString = "Prize: "+ prize + "\n";
        assertEquals(expectedPrizesString, medStudent.getPrizesString());
    }
}
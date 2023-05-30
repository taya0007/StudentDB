//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import studentdatabase.MedStudent;

class MedStudentTest {
    MedStudentTest() {
    }

    @Test
    void addPrize1() {
        MedStudent Stu = new MedStudent(1, "John", "Smith", "IT");
        Stu.addPrize("Prize1");
        Stu.addPrize("Prize2");
        List<String> ans = Stu.getPrizes();
        List<String> Expected = new ArrayList(Arrays.asList("Prize1", "Prize2"));
        Assertions.assertEquals(Expected, ans);
    }

    @Test
    void addPrize2() {
        MedStudent Stu = new MedStudent(1, "John", "Smith", "IT");
        Stu.addPrize("");
        Stu.addPrize("");
        List<String> ans = Stu.getPrizes();
        List<String> Expected = new ArrayList(Arrays.asList("", ""));
        Assertions.assertEquals(Expected, ans);
    }

    @Test
    void addPrize3() {
        MedStudent Stu = new MedStudent(1, "John", "Smith", "IT");
        Stu.addPrize((String)null);
        Stu.addPrize((String)null);
        List<String> ans = Stu.getPrizes();
        List<String> Expected = new ArrayList(Arrays.asList(null, null));
        Assertions.assertEquals(Expected, ans);
    }

    @Test
    void setPrizes1() {
        MedStudent Stu = new MedStudent(1, "John", "Smith", "IT");
        List<String> List = new ArrayList(Arrays.asList(null, null));
        Stu.setPrizes(List);
        List<String> ans = Stu.getPrizes();
        List<String> Expected = new ArrayList(Arrays.asList(null, null));
        Assertions.assertEquals(Expected, ans);
    }

    @Test
    void setPrizes2() {
        MedStudent Stu = new MedStudent(1, "John", "Smith", "IT");
        List<String> List = new ArrayList(Arrays.asList("", ""));
        Stu.setPrizes(List);
        List<String> ans = Stu.getPrizes();
        List<String> Expected = new ArrayList(Arrays.asList("", ""));
        Assertions.assertEquals(Expected, ans);
    }

    @Test
    void setPrizes3() {
        MedStudent Stu = new MedStudent(1, "John", "Smith", "IT");
        List<String> List = new ArrayList(Arrays.asList("Prize1", "Prize2"));
        Stu.setPrizes(List);
        List<String> ans = Stu.getPrizes();
        List<String> Expected = new ArrayList(Arrays.asList("Prize1", "Prize2"));
        Assertions.assertEquals(Expected, ans);
    }

    @Test
    void getPrizesString1() {
        MedStudent medStudent = new MedStudent(123456, "Smith", "John", "Medicine");
        medStudent.addPrize("Prize1");
        medStudent.addPrize("Prize2");
        String expectedPrizesString = "Prize: Prize1\nPrize: Prize2\n";
        Assertions.assertEquals(expectedPrizesString, medStudent.getPrizesString());
    }

    @Test
    void getPrizesString2() {
        MedStudent medStudent = new MedStudent(123456, "Smith", "John", "Medicine");
        medStudent.addPrize("");
        medStudent.addPrize("");
        String expectedPrizesString = "Prize: \nPrize: \n";
        Assertions.assertEquals(expectedPrizesString, medStudent.getPrizesString());
    }

    @Test
    void getPrizesString3() {
        MedStudent medStudent = new MedStudent(123456, "Smith", "John", "Medicine");
        medStudent.addPrize((String)null);
        medStudent.addPrize((String)null);
        String expectedPrizesString = "Prize: null\nPrize: null\n";
        Assertions.assertEquals(expectedPrizesString, medStudent.getPrizesString());
    }
}

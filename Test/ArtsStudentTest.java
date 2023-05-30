//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import studentdatabase.ArtsStudent;

class ArtsStudentTest {
    ArtsStudentTest() {
    }

    @Test
    void getMajor1() {
        ArtsStudent Stu = new ArtsStudent();
        String ans = Stu.getMajor();
        Assertions.assertEquals((Object)null, ans);
    }

    @Test
    void getMajor2() {
        ArtsStudent Stu = new ArtsStudent(1, "John", "Smith", "IT", "CHEMISTRY", "MATHS");
        String ans = Stu.getMajor();
        Assertions.assertEquals("CHEMISTRY", ans);
    }

    @Test
    void getMajor3() {
        ArtsStudent Stu = new ArtsStudent(1, "John", "Smith", "IT", "S & C", "MATHS");
        String ans = Stu.getMajor();
        Assertions.assertEquals("S & C", ans);
    }

    @Test
    void getMajor4() {
        ArtsStudent Stu = new ArtsStudent();
        String ans = Stu.getMajor();
        Assertions.assertEquals("", ans);
    }

    @Test
    void setMajor1() {
        ArtsStudent Stu = new ArtsStudent(1, "John", "Smith", "IT", "S & C", "MATHS");
        Stu.setMajor("PK");
        String ans = Stu.getMajor();
        Assertions.assertEquals("PK", ans);
    }

    @Test
    void setMajor2() {
        ArtsStudent Stu = new ArtsStudent();
        Stu.setMajor("");
        String ans = Stu.getMajor();
        Assertions.assertEquals("", ans);
    }

    @Test
    void setMajor3() {
        ArtsStudent Stu = new ArtsStudent(1, "John", "Smith", "IT", "CHEMISTRY", "MATHS");
        Stu.setMajor("MATHS");
        String ans = Stu.getMajor();
        Assertions.assertEquals("MATHS", ans);
    }

    @Test
    void setMajor4() {
        ArtsStudent Stu = new ArtsStudent(1, "John", "Smith", "IT", "CHEMISTRY", "MATHS");
        Stu.setMajor((String)null);
        String ans = Stu.getMajor();
        Assertions.assertEquals("", ans);
    }

    @Test
    void getMinor1() {
        ArtsStudent Stu = new ArtsStudent();
        String ans = Stu.getMinor();
        Assertions.assertEquals((Object)null, ans);
    }

    @Test
    void getMinor2() {
        ArtsStudent Stu = new ArtsStudent(1, "John", "Smith", "IT", "CHEMISTRY", "MATHS");
        String ans = Stu.getMinor();
        Assertions.assertEquals("MATHS", ans);
    }

    @Test
    void getMinor3() {
        ArtsStudent Stu = new ArtsStudent(1, "John", "Smith", "IT", "S & C", "C & P");
        String ans = Stu.getMinor();
        Assertions.assertEquals("C & P", ans);
    }

    @Test
    void getMinor4() {
        ArtsStudent Stu = new ArtsStudent();
        String ans = Stu.getMinor();
        Assertions.assertEquals("", ans);
    }

    @Test
    void setMinor1() {
        ArtsStudent Stu = new ArtsStudent(1, "John", "Smith", "IT", "S & C", "MATHS");
        Stu.setMinor("LK");
        String ans = Stu.getMinor();
        Assertions.assertEquals("LK", ans);
    }

    @Test
    void setMinor2() {
        ArtsStudent Stu = new ArtsStudent();
        Stu.setMinor("");
        String ans = Stu.getMinor();
        Assertions.assertEquals("", ans);
    }

    @Test
    void setMinor3() {
        ArtsStudent Stu = new ArtsStudent(1, "John", "Smith", "IT", "CHEMISTRY", "MATHS");
        Stu.setMinor("CHEMISTRY");
        String ans = Stu.getMinor();
        Assertions.assertEquals("CHEMISTRY", ans);
    }

    @Test
    void setMinor4() {
        ArtsStudent Stu = new ArtsStudent(1, "John", "Smith", "IT", "CHEMISTRY", "MATHS");
        Stu.setMinor((String)null);
        String ans = Stu.getMinor();
        Assertions.assertEquals("", ans);
    }

    @Test
    void getMajorMinorString1() {
        ArtsStudent Stu = new ArtsStudent(1, "John", "Smith", "IT", "S & C", "MATHS");
        String ans = Stu.getMajorMinorString();
        Assertions.assertEquals("Major: S & C\nMinor: MATHS\n", ans);
    }

    @Test
    void getMajorMinorString2() {
        ArtsStudent Stu = new ArtsStudent(1, "John", "Smith", "IT", "S & C", "C & P");
        String ans = Stu.getMajorMinorString();
        Assertions.assertEquals("Major: S & C\nMinor: C & P\n", ans);
    }

    @Test
    void getMajorMinorString3() {
        ArtsStudent Stu = new ArtsStudent();
        String ans = Stu.getMajorMinorString();
        Assertions.assertEquals("Major: null\nMinor: null\n", ans);
    }

    @Test
    void getMajorMinorString4() {
        ArtsStudent Stu = new ArtsStudent();
        String ans = Stu.getMajorMinorString();
        Assertions.assertEquals("Major:  \nMinor:   \n", ans);
    }
}

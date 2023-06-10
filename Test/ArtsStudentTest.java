import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import studentdatabase.ArtsStudent;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArtsStudentTest {

    @Test
    void getMajor1() {
        ArtsStudent Stu = new ArtsStudent();
            String ans = Stu.getMajor();
            assertEquals(null,ans);
    }

    @Test
    void getMajor2() {
        ArtsStudent Stu = new ArtsStudent(1,"John","Smith","IT","CHEMISTRY","MATHS");
        String ans = Stu.getMajor();
        assertEquals("CHEMISTRY",ans);
    }

    @Test
    void getMajor3() {
        ArtsStudent Stu = new ArtsStudent(1,"John","Smith","IT","S & C","MATHS");
        String ans = Stu.getMajor();
        assertEquals("S & C",ans);
    }
    @Test
    void getMajor4() {
        ArtsStudent Stu = new ArtsStudent();
        String ans = Stu.getMajor();
        assertEquals("",ans);
    }

    @Test
    void setMajor1() {
        ArtsStudent Stu = new ArtsStudent(1,"John","Smith","IT","S & C","MATHS");
        Stu.setMajor("PK");
        String ans = Stu.getMajor();
        assertEquals("PK",ans);
    }

    @Test
    void setMajor2() {
        ArtsStudent Stu = new ArtsStudent();
        Stu.setMajor("");
        String ans = Stu.getMajor();
        assertEquals("",ans);
    }

    @Test
    void setMajor3() {
        ArtsStudent Stu = new ArtsStudent(1,"John","Smith","IT","CHEMISTRY","MATHS");
        Stu.setMajor("MATHS");
        String ans = Stu.getMajor();
        assertEquals("MATHS",ans);
    }

    @Test
    void setMajor4() {
        ArtsStudent Stu = new ArtsStudent(1,"John","Smith","IT","CHEMISTRY","MATHS");
        Stu.setMajor(null);
        String ans = Stu.getMajor();
        assertEquals("",ans);
    }

    @Test
    void getMinor1() {
        ArtsStudent Stu = new ArtsStudent();
        String ans = Stu.getMinor();
        assertEquals(null,ans);
    }

    @Test
    void getMinor2() {
        ArtsStudent Stu = new ArtsStudent(1,"John","Smith","IT","CHEMISTRY","MATHS");
        String ans = Stu.getMinor();
        assertEquals("MATHS",ans);
    }

    @Test
    void getMinor3() {
        ArtsStudent Stu = new ArtsStudent(1,"John","Smith","IT","S & C","C & P");
        String ans = Stu.getMinor();
        assertEquals("C & P",ans);
    }

    @Test
    void getMinor4() {
        ArtsStudent Stu = new ArtsStudent();
        String ans = Stu.getMinor();
        assertEquals("",ans);
    }

    @Test
    void setMinor1() {
        ArtsStudent Stu = new ArtsStudent(1,"John","Smith","IT","S & C","MATHS");
        Stu.setMinor("LK");
        String ans = Stu.getMinor();
        assertEquals("LK",ans);
    }

    @Test
    void setMinor2() {
        ArtsStudent Stu = new ArtsStudent();
        Stu.setMinor("");
        String ans = Stu.getMinor();
        assertEquals("",ans);
    }

    @Test
    void setMinor3() {
        ArtsStudent Stu = new ArtsStudent(1,"John","Smith","IT","CHEMISTRY","MATHS");
        Stu.setMinor("CHEMISTRY");
        String ans = Stu.getMinor();
        assertEquals("CHEMISTRY",ans);
    }

    @Test
    void setMinor4() {
        ArtsStudent Stu = new ArtsStudent(1,"John","Smith","IT","CHEMISTRY","MATHS");
        Stu.setMinor(null);
        String ans = Stu.getMinor();
        assertEquals("",ans);
    }

    @Test
    void getMajorMinorString1() {
        ArtsStudent Stu = new ArtsStudent(1,"John","Smith","IT","S & C","MATHS");
        String ans = Stu.getMajorMinorString();
        assertEquals("Major: S & C\nMinor: MATHS\n",ans);
    }
    @Test
    void getMajorMinorString2() {
        ArtsStudent Stu = new ArtsStudent(1,"John","Smith","IT","S & C","C & P");
        String ans = Stu.getMajorMinorString();
        assertEquals("Major: S & C\nMinor: C & P\n",ans);
    }
    @Test
    void getMajorMinorString3() {
        ArtsStudent Stu = new ArtsStudent();
        String ans = Stu.getMajorMinorString();
        assertEquals("Major: null\nMinor: null\n",ans);
    }

    @Test
    void getMajorMinorString4() {
        ArtsStudent Stu = new ArtsStudent();
        String ans = Stu.getMajorMinorString();
        assertEquals("Major:  \nMinor:   \n",ans);
    }
    @ParameterizedTest
    @CsvSource({
            "123456,Smith,John,Medicine,S & C,C & P",
            "234567,John,Doe,ABC,,",
            "345678,Keyur,Kakadiya,DEF, , ",
            "456789,Jane,desusa,MNP,SP,CP"
    })
    void getMajorMinorString5(int stNum, String Fname, String Gname, String degree,String min, String maj) {
        ArtsStudent Stu = new ArtsStudent(stNum, Fname, Gname, degree, min, maj);
        String ans = Stu.getMajorMinorString();
        assertEquals("Major: "+ min +"\nMinor: "+ maj +"\n",ans);
    }
}
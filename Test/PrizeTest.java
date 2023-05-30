import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import studentdatabase.MedStudent;
import studentdatabase.Prize;

import static org.junit.jupiter.api.Assertions.*;

class PrizeTest {

    @Test
    void getName1() {
        Prize prize = new Prize();
        assertEquals(null, prize.getName());
    }

    @Test
    void getName2() {
        Prize prize = new Prize("Third Prize", "History", 2);
        assertEquals("Third Prize", prize.getName());
    }

    @Test
    void getName3() {
        Prize prize = new Prize("", "Science", 2);
        assertEquals("", prize.getName());
    }

    @Test
    void setName1() {
        Prize prize = new Prize();
        prize.setName("");
        assertEquals("", prize.getName());
    }

    @Test
    void setName2() {
        Prize prize = new Prize("Third Prize", "History", 2);
        prize.setName(null);
        assertEquals(null, prize.getName());
    }

    @Test
    void setName3() {
        Prize prize = new Prize("Third Prize", "History", 2);
        prize.setName("First Prize");
        assertEquals("First Prize", prize.getName());
    }

    @Test
    void getTopic1() {
        Prize prize = new Prize();
        assertEquals(null, prize.getTopic());
    }

    @Test
    void getTopic2() {
        Prize prize = new Prize("Third Prize", "History", 2);
        assertEquals("History", prize.getTopic());
    }

    @Test
    void getTopic3() {
        Prize prize = new Prize("First Prize", "", 2);
        assertEquals("", prize.getTopic());
    }

    @Test
    void setTopic1() {
        Prize prize = new Prize();
        prize.setTopic("");
        assertEquals("", prize.getTopic());
    }

    @Test
    void setTopic2() {
        Prize prize = new Prize("Third Prize", "History", 2);
        prize.setTopic(null);
        assertEquals(null, prize.getTopic());
    }

    @Test
    void setTopic3() {
        Prize prize = new Prize("First Prize", "History", 2);
        prize.setTopic("Science");
        assertEquals("Science", prize.getTopic());
    }

    @Test
    void getMinTopics1() {
        Prize prize = new Prize();
        assertEquals((Integer) null, prize.getMinTopics());
    }

    @Test
    void getMinTopics2() {
        Prize prize = new Prize("Third Prize", "History", 2);
        assertEquals(2, prize.getMinTopics());
    }

    @Test
    void getMinTopics3() {
        Prize prize = new Prize("First Prize", "Science", 0);
        assertEquals(0, prize.getMinTopics());
    }

    @Test
    void setMinTopics1() {
        Prize prize = new Prize();
        prize.setMinTopics(0);
        assertEquals(0, prize.getMinTopics());
    }

    @Test
    void setMinTopics2() {
        Prize prize = new Prize("Third Prize", "History", 2);
        prize.setMinTopics(0);
        assertEquals(0, prize.getMinTopics());
    }

    @Test
    void setMinTopics3() {
        Prize prize = new Prize("First Prize", "History", 2);
        prize.setMinTopics(1);
        assertEquals(1, prize.getMinTopics());
    }

    @Test
    public void testToString1() {
        Prize prize = new Prize();
        String expectedString = "Prize{name='null', topic='null', minTopics=0}";
        assertEquals(expectedString, prize.toString());
    }

    @Test
    public void testToString2() {
        Prize prize = new Prize("Third Prize", "History", 2);
        String expectedString = "Prize{name='Third Prize', topic='History', minTopics=2}";
        assertEquals(expectedString, prize.toString());
    }

    @Test
    public void testToString3() {
        Prize prize = new Prize("", "", 0);
        String expectedString = "Prize{name='', topic='', minTopics=0}";
        assertEquals(expectedString, prize.toString());
    }
}
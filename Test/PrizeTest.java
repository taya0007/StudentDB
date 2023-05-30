//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import studentdatabase.Prize;

class PrizeTest {
    PrizeTest() {
    }

    @Test
    void getName1() {
        Prize prize = new Prize();
        Assertions.assertEquals((Object)null, prize.getName());
    }

    @Test
    void getName2() {
        Prize prize = new Prize("Third Prize", "History", 2);
        Assertions.assertEquals("Third Prize", prize.getName());
    }

    @Test
    void getName3() {
        Prize prize = new Prize("", "Science", 2);
        Assertions.assertEquals("", prize.getName());
    }

    @Test
    void setName1() {
        Prize prize = new Prize();
        prize.setName("");
        Assertions.assertEquals("", prize.getName());
    }

    @Test
    void setName2() {
        Prize prize = new Prize("Third Prize", "History", 2);
        prize.setName((String)null);
        Assertions.assertEquals((Object)null, prize.getName());
    }

    @Test
    void setName3() {
        Prize prize = new Prize("Third Prize", "History", 2);
        prize.setName("First Prize");
        Assertions.assertEquals("First Prize", prize.getName());
    }

    @Test
    void getTopic1() {
        Prize prize = new Prize();
        Assertions.assertEquals((Object)null, prize.getTopic());
    }

    @Test
    void getTopic2() {
        Prize prize = new Prize("Third Prize", "History", 2);
        Assertions.assertEquals("History", prize.getTopic());
    }

    @Test
    void getTopic3() {
        Prize prize = new Prize("First Prize", "", 2);
        Assertions.assertEquals("", prize.getTopic());
    }

    @Test
    void setTopic1() {
        Prize prize = new Prize();
        prize.setTopic("");
        Assertions.assertEquals("", prize.getTopic());
    }

    @Test
    void setTopic2() {
        Prize prize = new Prize("Third Prize", "History", 2);
        prize.setTopic((String)null);
        Assertions.assertEquals((Object)null, prize.getTopic());
    }

    @Test
    void setTopic3() {
        Prize prize = new Prize("First Prize", "History", 2);
        prize.setTopic("Science");
        Assertions.assertEquals("Science", prize.getTopic());
    }

    @Test
    void getMinTopics1() {
        Prize prize = new Prize();
        Assertions.assertEquals((Integer)null, prize.getMinTopics());
    }

    @Test
    void getMinTopics2() {
        Prize prize = new Prize("Third Prize", "History", 2);
        Assertions.assertEquals(2, prize.getMinTopics());
    }

    @Test
    void getMinTopics3() {
        Prize prize = new Prize("First Prize", "Science", 0);
        Assertions.assertEquals(0, prize.getMinTopics());
    }

    @Test
    void setMinTopics1() {
        Prize prize = new Prize();
        prize.setMinTopics(0);
        Assertions.assertEquals(0, prize.getMinTopics());
    }

    @Test
    void setMinTopics2() {
        Prize prize = new Prize("Third Prize", "History", 2);
        prize.setMinTopics(0);
        Assertions.assertEquals(0, prize.getMinTopics());
    }

    @Test
    void setMinTopics3() {
        Prize prize = new Prize("First Prize", "History", 2);
        prize.setMinTopics(1);
        Assertions.assertEquals(1, prize.getMinTopics());
    }

    @Test
    public void testToString1() {
        Prize prize = new Prize();
        String expectedString = "Prize{name='null', topic='null', minTopics=0}";
        Assertions.assertEquals(expectedString, prize.toString());
    }

    @Test
    public void testToString2() {
        Prize prize = new Prize("Third Prize", "History", 2);
        String expectedString = "Prize{name='Third Prize', topic='History', minTopics=2}";
        Assertions.assertEquals(expectedString, prize.toString());
    }

    @Test
    public void testToString3() {
        Prize prize = new Prize("", "", 0);
        String expectedString = "Prize{name='', topic='', minTopics=0}";
        Assertions.assertEquals(expectedString, prize.toString());
    }
}

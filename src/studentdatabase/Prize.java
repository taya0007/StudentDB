package studentdatabase;

/**
 * A class to create a Prize and the means to award it.
 */
public class Prize {
    private String name;
    private String topic;
    private int minTopics;

    public Prize() {
    }

    public Prize(String name, String topic, int minTopics) {
        this.name = name;
        this.topic = topic;
        this.minTopics = minTopics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getMinTopics() {
        return minTopics;
    }

    public void setMinTopics(int minTopics) {
        this.minTopics = minTopics;
    }

    @Override
    public String toString() {
        return "Prize{" +
                "name='" + name + '\'' +
                ", topic='" + topic + '\'' +
                ", minTopics=" + minTopics +
                '}';
    }
}

package studentdatabase;

public class Result {
    private String topicCode;
    private String grade;
    private int marks;

    public Result() {
    }

    public Result(String topicCode, String grade) {
        this.topicCode = topicCode;
        this.grade = grade;
    }

    public Result(String topicCode, String grade, int marks) {
        this.topicCode = topicCode;
        this.grade = grade;
        this.marks = marks;
    }

    public String getTopicCode() {
        return topicCode;
    }

    public void setTopicCode(String topicCode) {
        this.topicCode = topicCode;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        String marksStr = "";
        if(marks > 0){
            marksStr = marks + "";
        }
        return topicCode + " " + grade + " " + marksStr;
    }
}

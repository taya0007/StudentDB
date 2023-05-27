package studentdatabase;

public class ArtsStudent extends Student{
    private String major, minor;

    public ArtsStudent() {
    }

    public ArtsStudent(int studentNumber, String familyName, String giverName, String degree, String major, String minor) {
        super(studentNumber, familyName, giverName, degree);
        this.major = major;
        this.minor = minor;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }



    public String getMajorMinorString() {
        return "Major: " + this.getMajor() + "\nMinor: " + this.getMinor() + "\n";
    }
}

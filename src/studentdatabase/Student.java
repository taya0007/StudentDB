package studentdatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that represents a Student.
 */
public class Student {
    private int studentNumber;
    private String familyName;
    private String giverName;
    private  String degree;
    private List<Result> results;

    public Student() {

    }

    public Student(int studentNumber, String familyName, String giverName, String degree) {
        this.studentNumber = studentNumber;
        this.familyName = familyName;
        this.giverName = giverName;
        this.degree = degree;
        results = new ArrayList<>();
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGiverName() {
        return giverName;
    }

    public void setGiverName(String giverName) {
        this.giverName = giverName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public void addResult(Result result){
        this.results.add(result);
    }

    @Override
    public String toString() {
        String str = "Academic record for " + this.getGiverName() + " " + this.getFamilyName() + "(" + this.getStudentNumber() +")\n" +
                "Degree: " + this.getDegree() + "\n";

        if(this instanceof MedStudent){
            str += ((MedStudent)this).getPrizesString();
        }

        if(this instanceof ArtsStudent){
            str += ((ArtsStudent)this).getMajorMinorString();
        }

        for(Result result: this.results){
            str += result.toString() + "\n";
        }

        return  str;
    }
}

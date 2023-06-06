package studentdatabase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDatabase {

    public final ArrayList<Student> studentDatabse;
    private ArrayList<Prize> prizes;

    public StudentDatabase() {
        studentDatabse = new ArrayList<>();
        prizes = new ArrayList<>();
    }

    public void addStudent(String s) {
        String[] splitted = s.split(",");
        switch (s.charAt(0)) {
            case 'A' -> {
                ArtsStudent artsStudent = new ArtsStudent(Integer.parseInt(splitted[1]), splitted[2], splitted[3], "Arts", splitted[4], splitted[5]);
                studentDatabse.add(artsStudent);
                break;
            }
            case 'M' -> {
                MedStudent student = new MedStudent(Integer.parseInt(splitted[1]), splitted[2], splitted[3], "Medicine");
                for (int i = 4; i < splitted.length; i++) {
                    student.addPrize(splitted[i].trim());
                }

                studentDatabse.add(student);
                break;
            }
            case 'S' -> {
                Student student = new Student(Integer.parseInt(splitted[1]), splitted[2], splitted[3], "Science");
                studentDatabse.add(student);
                break;
            }
        }
    }


    public Student findStudent(String ID) {
        for(Student s :studentDatabse){
            if (s.getStudentNumber() == Integer.parseInt(ID)){
                return s;
            }
        }
        return null;
    }

    public void addResult(String s) {
        String[] splitted = s.split(",");
        Student student = this.findStudent(splitted[1]);
        if (student != null){
            Result result = new Result(splitted[2], splitted[3]);
            if(splitted.length > 4){
                result.setMarks(Integer.parseInt(splitted[4]));
            }
            student.addResult(result);
        }

    }

    public void printRecords() throws IOException {
        for(Student student : studentDatabse){
            System.out.println(student.toString());
        }
    }

    public void clearRecords() {
        studentDatabse.clear();
    }

    public void addPrize(String s) {
        String[] splitted = s.split(",");
        Prize prize = new Prize(splitted[1], splitted[2], Integer.parseInt(splitted[3]));
        prizes.add(prize);
    }

    public void awardPrizes() {
        for (Prize prize : prizes){

            double highestAverage = 0.0;
            MedStudent highestAverageStudent = null;

            for (Student s: studentDatabse){
                if(s instanceof  MedStudent) {
                    MedStudent medStudent = (MedStudent) s;
                    List<Result> results = medStudent.getResults();

                    int total = 0;
                    int count = 0;

                    for (Result result : results) {
                        String topicCode = result.getTopicCode().substring(0, prize.getTopic().length());
                        if (topicCode.equals(prize.getTopic().trim())) {
                            total += result.getMarks();
                            count++;
                        }
                    }


                    double average = 0.0;
                    if(count != 0){
                        average = total / count;
                    }

                    if(average > highestAverage){
                        highestAverage = average;
                        highestAverageStudent = medStudent;
                    }

                }
            }

            if(highestAverageStudent != null){
                highestAverageStudent.addPrize(prize.getName());
            }


        }
    }
}

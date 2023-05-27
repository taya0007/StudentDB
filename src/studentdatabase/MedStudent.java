package studentdatabase;

import java.util.ArrayList;
import java.util.List;

public class MedStudent extends Student{
    private List<String> prizes;

    public MedStudent(int studentNumber, String familyName, String giverName, String degree) {
        super(studentNumber, familyName, giverName, degree);
        prizes = new ArrayList<>();
    }

    public void addPrize(String prize){
        prizes.add(prize);
    }

    public List<String> getPrizes() {
        return prizes;
    }

    public void setPrizes(List<String> prizes) {
        this.prizes = prizes;
    }

    public String getPrizesString() {
        String prizesStr = "";
        for(String prize : this.prizes){
            prizesStr += "Prize: " + prize + "\n";
        }
        return prizesStr;
    }
}

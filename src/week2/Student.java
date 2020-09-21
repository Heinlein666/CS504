package week2;

public class Student {
    private int id;
    private int midtermExam;
    private int finalExam;

    public double calcAvg() {
        double avg;
        avg = (midtermExam + finalExam) / 2.0;
        return avg;
    }

    public char getLetterGrade() {
        char letterGrade = ' ';
        return letterGrade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMidtermExam() {
        return midtermExam;
    }

    public void setMidtermExam(int midtermExam) {
        this.midtermExam = midtermExam;
    }

    public int getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(int finalExam) {
        this.finalExam = finalExam;
    }
}

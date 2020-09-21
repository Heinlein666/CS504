package week2;

public class UnderGraduateStudent extends Student {
    @Override
    public char getLetterGrade() {
        double avg = super.calcAvg();
        char letterGrade = ' ';
        if (avg >= 90) {
            letterGrade = 'A';
        }else if (avg >= 80) {
            letterGrade = 'B';
        }else if (avg >= 70) {
            letterGrade = 'C';
        }else if (avg >=60) {
            letterGrade = 'D';
        }else {
            letterGrade = 'F';
        }
        return letterGrade;
    }
}

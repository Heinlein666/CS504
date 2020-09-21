package week2;

public class GraduateStudent extends Student {

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
        }else {
            letterGrade = 'F';
        }
        return letterGrade;
    }
}

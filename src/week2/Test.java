package week2;

public class Test {
    public static void main(String[] args) {
        Student graduateStudent =  new GraduateStudent();
        Student underGraduateStudent =  new UnderGraduateStudent();

        graduateStudent.setId(20200101);
        graduateStudent.setFinalExam(92);
        graduateStudent.setMidtermExam(90);
        System.out.println("Graduate Student which id is " + graduateStudent.getId() + " get Letter grade " + graduateStudent.getLetterGrade() + ".");

        underGraduateStudent.setId(2020000101);
        underGraduateStudent.setMidtermExam(80);
        underGraduateStudent.setFinalExam(85);
        System.out.println("Undergraduate Student which id is " + underGraduateStudent.getId() + " get Letter grade " + underGraduateStudent.getLetterGrade() + ".");
    }
}

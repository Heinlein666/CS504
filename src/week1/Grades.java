package week1;

public class Grades {
    private int[] values;

    public Grades(){};
    public Grades(int[] values) {
        this.values = values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    public int[] getValues() {
        return values;
    }

    public int highest() {
        int highest = values[0];
        for (int grad : values) {
            if (grad > highest) {
                highest = grad;
            }
        }
        return  highest;
    }

    public int lowest() {
        int lowest = values[0];
        for (int grad : values) {
            if (grad < lowest) {
                lowest = grad;
            }
        }
        return  lowest;
    }


    public int numOfGrade() {
        return values.length;
    }
    
    public double average() {
        double sum = 0;
        for (int grad : values) {
            sum += grad;
        }
        return sum / values.length;
    }

    public int numOfFailingGrades(int gradeValue) {
        int count = 0;
        for (int grad : values) {
            if (grad < gradeValue) {
                count++;
            }
        }
        return  count;
    }

    public void histogram() {
        String grad90_100 = "90 – 100 | ";
        String grad80_89 = "80 – 89  | ";
        String grad70_79 = "70 – 79  | ";
        String grad60_69 = "60 – 69  | ";
        String grad0_60 = "<60      | ";

        for (int grad : values) {
          if (grad >= 90){
              grad90_100 += "*";
          }else if (grad >= 80){
              grad80_89 += "*";
          }else if (grad >= 70) {
              grad70_79 += "*";
          }else if (grad >= 60) {
              grad60_69 += "*";
          }else {
              grad0_60 += "*";
          }
        }
        System.out.println(grad90_100 + "\n" + grad80_89 + "\n" + grad70_79 + "\n" + grad60_69 + "\n" + grad0_60);
    }
}

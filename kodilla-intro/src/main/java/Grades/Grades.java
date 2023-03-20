package Grades;

public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void addGrade(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGrade() {
        if (size > 0) {
            return grades[size - 1];
        } else {
            return 0;
        }
    }

    public double getAverage() {
        double sum = 0;
        for (int k = 0; k < size; k++) {
            sum += grades[k];
        }
        return sum / size;
    }
}
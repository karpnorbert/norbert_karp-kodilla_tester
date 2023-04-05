package grades;

public class GradesApp {
    public static void main(String[] args){
        Grades grades = new Grades();
        grades.addGrade(2);
        grades.addGrade(3);
        grades.addGrade(6);
        grades.addGrade(4);
        grades.addGrade(1);
        grades.addGrade(4);
        grades.addGrade(5);
        grades.addGrade(5);
        grades.addGrade(3);
        grades.addGrade(4);
        System.out.println(grades.getLastGrade());
        System.out.println(grades.getAverage());
    }
}

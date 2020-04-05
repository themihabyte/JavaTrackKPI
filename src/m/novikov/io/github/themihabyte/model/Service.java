package m.novikov.io.github.themihabyte.model;

import java.util.Arrays;

public class Service {
    private Student[] students;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents() {
        int numberOfStudents = 10;
        students=new Student[numberOfStudents];

        for (int i=0; i < numberOfStudents; i++) {
            students[i]=DataSource.generateStudent();
        }
    }

    public Student[] getExcellentSecondYearStudents(){
        Student[] filter = new Student[students.length];

        int iterator = 0;
        for (Student student:
             students) {
            if ((student.getMark() > 95) && (student.getStudyYear() == 2)){
                filter[iterator] = student;
                iterator++;
            }
        }

        return Arrays.copyOf(filter, iterator);
    }

    public Student[] getForeignWellStudyingStudents(){
        Student[] filter = new Student[students.length];

        int iterator = 0;
        for (Student student:
                students) {
            if ((student.getMark() > 85) && (!student.getCountry().equals("Ukraine"))){
                filter[iterator] = student;
                iterator++;
            }
        }

        return Arrays.copyOf(filter, iterator);
    }
}

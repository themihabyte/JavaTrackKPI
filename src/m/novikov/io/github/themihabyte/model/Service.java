package m.novikov.io.github.themihabyte.model;

import java.util.Arrays;

public class Service {
    private Student[] students;
    private final WorkWithFile workWithFile;

    public Student[] getStudents() {
        return students;
    }

    public Service() {
        workWithFile=new WorkWithFile();
    }

    public void setStudents() {
        int numberOfStudents=10;
        students=workWithFile.readDataFromTextFile(
                "C:\\Users\\Admin\\Desktop\\JavaTrackKPI\\files\\DataSource.txt",
                numberOfStudents);
    }

    public Student[] getExcellentSecondYearStudents() {
        Student[] filter=new Student[students.length];

        int iterator=0;
        for (Student student :
                students) {
            if ((student.getMark() > 95) && (student.getStudyYear() == 2)) {
                filter[iterator]=student;
                iterator++;
            }
        }

        return Arrays.copyOf(filter, iterator);
    }

    public Student[] getForeignWellStudyingStudents() {
        Student[] filter=new Student[students.length];

        int iterator=0;
        for (Student student :
                students) {
            if ((student.getMark() > 85) && (!student.getCountry().equals("Ukraine"))) {
                filter[iterator]=student;
                iterator++;
            }
        }

        return Arrays.copyOf(filter, iterator);
    }

    public void writeStudentsToFile(Student[] students, String filePath) {
        workWithFile.writeDataToTextFile(students, filePath);
    }
}

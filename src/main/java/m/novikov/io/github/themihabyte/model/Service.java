package m.novikov.io.github.themihabyte.model;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Arrays;

public class Service {
    private Student[] students;
    private static final Logger logger=LogManager.getLogger(Service.class);
    private final WorkWithFile workWithFile;

    public Student[] getStudents() {
        return students;
    }

    public Service() {
        workWithFile=new WorkWithFile();
    }

    public void setStudents() throws IOException {
        int numberOfStudents=10;
        students=workWithFile.readDataFromTextFile(
                "C:\\Users\\Admin\\Desktop\\JavaTrackKPI\\files\\DataSource.txt",
                numberOfStudents);
        logger.trace("In studetns now: "+students);
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

    public void writeStudentsToFile(Student[] students, String filePath) throws IOException {
        workWithFile.writeDataToTextFile(students, filePath);
        logger.debug("This students written: " +Arrays.toString(students));
    }
}

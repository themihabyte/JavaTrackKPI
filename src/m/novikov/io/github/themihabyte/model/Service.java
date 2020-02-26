package m.novikov.io.github.themihabyte.model;

public class Service {
    private Student[] students;

    public Student[] getStudents() {
        return students;
    }

    // Gets students from some data source
    public void setStudents(int n) {
        students=new Student[n];

        for (int i=0; i < n; i++) {
            students[i]=DataSource.generateStudent();
        }
    }

    // Finds excellent second year students in array
    public Student[] getExcellentSecondYearStudents(){
        Student[] filter = new Student[students.length]; // New array for filtered students

        int i = 0; // Variable for counting and indexing filtered students
        for (Student student:
             students) {
            if ((student.getMark() > 95) && (student.getStudyYear() == 2)){
                filter[i] = student;
                i++;
            }
        }

        // For returning full-filled array
        if (i != 0){
            Student[] list = new Student[i];
            System.arraycopy(filter, 0, list, 0, i);
            return list;
        } else {
            return null;
        }
    }

    // Finds foreign well-studying students in array
    public Student[] getForeignWellStudyingStudents(){
        Student[] filter = new Student[students.length]; // New array for filtered students

        int i = 0; // Variable for counting and indexing filtered students
        for (Student student:
                students) {
            if ((student.getMark() > 85) && (!student.getCountry().equals("Ukraine"))){
                filter[i] = student;
                i++;
            }
        }

        // For returning full-filled array
        if (i != 0){
            Student[] list = new Student[i];
            System.arraycopy(filter, 0, list, 0, i);
            return list;
        } else {
            return null;
        }
    }
}

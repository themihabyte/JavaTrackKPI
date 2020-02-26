package m.novikov.io.github.themihabyte.model;

public class Service {
    private Student[] students;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(int n) {
        students=new Student[n];

        for (int i=0; i < n; i++) {
            students[i]=DataSource.generateStudent();
        }
    }

    public Student[] getExcellentSecondYearStudents(){
        Student[] filter = new Student[students.length]; // new array for filtered students

        int i = 0; // Variable for counting and indexing filtered students
        for (Student student:
             students) {
            if ((student.getMark() == 5) && (student.getStudyYear() == 2)){
                filter[i] = student;
                i++;
            }
        }

        // For returning full-filled array
        Student[] list = new Student[i];
        System.arraycopy(filter, 0, list, 0, i);

        return list;
    }

    //TODO second exercise
}

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
        Student[] filter = new Student[students.length];

        int i = 0;
        for (Student student:
             students) {
            if ((student.getMark() > 95) && (student.getStudyYear() == 2)){
                filter[i] = student;
                i++;
            }
        }

        if (i != 0){
            Student[] list = new Student[i];
            System.arraycopy(filter, 0, list, 0, i);
            return list;
        } else {
            return null;
        }
    }

    public Student[] getForeignWellStudyingStudents(){
        Student[] filter = new Student[students.length];

        int i = 0;
        for (Student student:
                students) {
            if ((student.getMark() > 85) && (!student.getCountry().equals("Ukraine"))){
                filter[i] = student;
                i++;
            }
        }

        if (i != 0){
            Student[] list = new Student[i];
            System.arraycopy(filter, 0, list, 0, i);
            return list;
        } else {
            return null;
        }
    }
}

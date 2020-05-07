package m.novikov.io.github.themihabyte.model;

import java.io.*;

class WorkWithFile {
    void writeDataToTextFile(Student[] students, String filePath) {
        if (students.length == 0) {
            return;
        }
        try (FileWriter fileWriter=new FileWriter(filePath, true);
             BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)) {

            for (Student student :
                    students) {
                bufferedWriter.write(student.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Student[] readDataFromTextFile(String filePath, int numberOfStudents) {
        Student[] students=new Student[numberOfStudents];

        try (FileReader fileReader=new FileReader(filePath);
             BufferedReader bufferedReader=new BufferedReader(fileReader)) {

            for (int i=0; bufferedReader.read() != -1; i++) {
                String data=bufferedReader.readLine();
                String[] studentData=data.split(" ");
                students[i]=new Student();
                students[i].setName(studentData[0]);
                students[i].setSurname(studentData[1]);
                students[i].setLastName(studentData[2]);
                students[i].setStudentID(Integer.parseInt(studentData[3]));
                students[i].setStudyYear(Byte.parseByte(studentData[4]));
                students[i].setCountry(studentData[5]);
                students[i].setGender(studentData[6]);
                students[i].setMark(Byte.parseByte(studentData[7]));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }
}

package m.novikov.io.github.themihabyte.model;

import java.util.Random;

public class DataSource {
    Student generateStudent() {
        Student student=new Student();

        student.setName(generateString((generateRandomNumber() % 8)+4)); // length of name = [4;11]
        student.setSurname(generateString((generateRandomNumber() % 12)+5)); // Length of surname = [5;16]
        student.setLastName(generateString((generateRandomNumber() % 12)+5)); // Length of last name = [5;16]
        student.setCountry(generateString((generateRandomNumber() % 15)+5)); // length of country = [5; 19]
        student.setStudentID(generateRandomNumber() % 1000); // in range: [0;999]
        student.setGender(new Random().nextBoolean());
        student.setMark((byte) (generateRandomNumber() % 101)); // mark in range: [0;100]
        student.setStudyYear((byte) (generateRandomNumber() % 6+1)); // study year: [1 ; 6]

        return student;
    }

    private int generateRandomNumber() {
        Random random=new Random();
        return random.nextInt();
    }

    // Generates random string with given length
    private String generateString(int length) {
        StringBuilder str=new StringBuilder();
        for (int i=0; i < length; i++) {
            str.append((char) (generateRandomNumber() % 25+65));
        }
        return str.toString();
    }
}

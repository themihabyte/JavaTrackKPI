package m.novikov.io.github.themihabyte.model;

import java.util.Random;

public class DataSource {
    private static Random random=new Random();

    static Student generateStudent() {
        Student student=new Student();

        student.setName(generateString(generateRandomNumber(4, 11))); // length of name = [4;11]
        student.setSurname(generateString(generateRandomNumber(5, 15))); // Length of surname = [5;16]
        student.setLastName(generateString(generateRandomNumber(5, 15))); // Length of last name = [5;16]
        student.setStudentID(generateRandomNumber(0, 1000)); // in range: [0;999]
        student.setGender(random.nextBoolean());
        student.setMark((byte) (generateRandomNumber(0, 100))); // mark in range: [0;100]
        student.setStudyYear((byte) (generateRandomNumber(1, 6))); // study year: [1 ; 6]

        // Generating random country
        String[] countries={"Ukraine", "Germany", "England", "Russia", "China", "Netherlands"};
        student.setCountry(countries[(generateRandomNumber(0, 5))]);

        return student;
    }

    private static int generateRandomNumber(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    // Generates random string with given length
    private static String generateString(int length) {
        StringBuilder str=new StringBuilder();
        for (int i=0; i < length; i++) {
            str.append((char) (generateRandomNumber(65, 90)));
        }
        return str.toString();
    }
}

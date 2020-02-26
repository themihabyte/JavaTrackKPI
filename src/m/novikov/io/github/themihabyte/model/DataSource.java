package m.novikov.io.github.themihabyte.model;

import java.util.Random;

public class DataSource {
    private static Random random=new Random();

    static Student generateStudent() {
        Student student=new Student();

        student.setName(generateString(generateRandomNumber(4, 11))); // length of name generates in range: [4;11]
        student.setSurname(generateString(generateRandomNumber(5, 15))); // Length of surname generates in range [5;15]
        student.setLastName(generateString(generateRandomNumber(5, 15))); // Length of last name generates in range [5;15]
        student.setStudentID(generateRandomNumber(0, 1000)); // Students ID number generates in range: [0;1000]
        student.setGender(random.nextBoolean()); // Generating students gender
        student.setMark((byte) (generateRandomNumber(0, 100))); // Mark generates in range: [0;100]
        student.setStudyYear((byte) (generateRandomNumber(1, 6))); // Study year generates in range: [1 ; 6]

        // Generating random country
        String[] countries={"Ukraine", "Germany", "England", "Russia", "China", "Netherlands"};
        student.setCountry(countries[(generateRandomNumber(0, countries.length - 1))]);

        return student;
    }

    private static int generateRandomNumber(int min, int max) {
        // Generates numbers in range: [min, max]
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

package m.novikov.io.github.themihabyte.model;

import java.util.Random;

public class DataSource {
    private static Random random=new Random();

    static Student generateStudent() {
        Student student=new Student();

        student.setName(generateString(generateRandomNumber(4, 11)));
        student.setSurname(generateString(generateRandomNumber(5, 15)));
        student.setLastName(generateString(generateRandomNumber(5, 15)));
        student.setStudentID(generateRandomNumber(0, 1000));
        student.setGender(random.nextBoolean());
        student.setMark((byte) (generateRandomNumber(0, 100)));
        student.setStudyYear((byte) (generateRandomNumber(1, 6)));

        String[] countries={"Ukraine", "Germany", "England", "Russia", "China", "Netherlands"};
        student.setCountry(countries[(generateRandomNumber(0, countries.length - 1))]);

        return student;
    }

    private static int generateRandomNumber(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    private static String generateString(int length) {
        StringBuilder str=new StringBuilder();
        for (int i=0; i < length; i++) {
            str.append((char) (generateRandomNumber(65, 90)));
        }
        return str.toString();
    }
}

package m.novikov.io.github.themihabyte.model;

public class Student {
    private String name;
    private String surname;
    private String lastName;
    private int studentID;
    private byte studyYear;
    private String country;
    private boolean gender;
    private byte mark;

    public Student() {
    }

    public Student(String name, String surname, String lastName, boolean gender) {
        this.name=name;
        this.surname=surname;
        this.lastName=lastName;
        this.gender=gender;
    }

    @Override
    public String toString() {
        return "Student: "+name+" "+surname+' '+lastName
                +'\n'+
                "studentID="+studentID+
                "\tstudyYear="+studyYear+
                "\ncountry:"+country+
                "\tgender:"+getGender()+
                "\tmark="+mark+"\n";
    }

    public Student(String name, String surname, String lastName, int studentID, byte studyYear, String country, boolean gender, byte mark) {
        this.name=name;
        this.surname=surname;
        this.lastName=lastName;
        this.studentID=studentID;
        this.studyYear=studyYear;
        this.country=country;
        this.gender=gender;
        this.mark=mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname=surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID=studentID;
    }

    public byte getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(byte studyYear) {
        this.studyYear=studyYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country=country;
    }

    public String getGender() {
        if (gender) return "MALE";
        return "FEMALE";
    }

    public void setGender(boolean gender) {
        this.gender=gender;
    }

    public byte getMark() {
        return mark;
    }

    public void setMark(byte mark) {
        this.mark=mark;
    }
}

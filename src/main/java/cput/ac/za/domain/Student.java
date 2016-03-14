package cput.ac.za.domain;

import java.util.Date;

/**
 * Created by student on 2016/03/14.
 */
public class Student extends Person
{
    private String studentNumber;

    public Student(String fName, String lName, String address, Date dob) {
        super(fName, lName, address, dob);
    }

    public Student() {
        super();
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

}

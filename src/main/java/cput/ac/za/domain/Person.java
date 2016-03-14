package cput.ac.za.domain;

import java.util.Date;

/**
 * Created by student on 2016/03/14.
 */
public class Person
{
    private String fName;
    private String lName;
    private String address;
    private Date dob;

    public Person() {
    }

    public Person(String fName, String lName, String address, Date dob) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.dob = dob;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }


    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", address='" + address + '\'' +
                ", dob=" + dob +
                '}';
    }
}

package cput.ac.za.domain.composition;

import java.util.Date;

/**
 * Created by student on 2016/03/23.
 */
public class PersonComp
{
    private String fName;
    private String lName;
    private String address;
    private Date dob;

    public PersonComp(String fName, String lName, String address, Date dob) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.dob = dob;
    }

    public PersonComp() {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
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
        return "PersonComp{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", address='" + address + '\'' +
                ", dob=" + dob +
                '}';
    }
}

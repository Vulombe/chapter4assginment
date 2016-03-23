package cput.ac.za.domain.composition;

/**
 * Created by student on 2016/03/23.
 */
public class StudentComp
{
    private PersonComp personComp;
    String sNumber;

    public StudentComp()
    {
        this.personComp = new PersonComp();
        personComp.setfName("Chauke");
    }

    public void setsNumber(String sNumber) {
        this.sNumber = sNumber;
    }

    public String getsNumber() {
        return sNumber;
    }
    public String getFname()
    {
        return personComp.getfName();
    }

}

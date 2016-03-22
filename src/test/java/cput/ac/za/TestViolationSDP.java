package cput.ac.za;

import cput.ac.za.conf.AppCinfigViolation;
import cput.ac.za.softwaredesignprinciple.violation.AnimalServiceISP;
import cput.ac.za.softwaredesignprinciple.violation.Impl.CarDIPImpl;
import cput.ac.za.softwaredesignprinciple.violation.Impl.VehicleDIPImpl;
import cput.ac.za.softwaredesignprinciple.violation.PersonServiceSRP;
import cput.ac.za.softwaredesignprinciple.violation.SalaryViolationOCP;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/22.
 */
public class TestViolationSDP
{
    //Start of Open Close Principle
    private SalaryViolationOCP salaryViolationOCP;
    private VehicleDIPImpl vehicleDIP;
    private CarDIPImpl carDIP;
    private AnimalServiceISP animalServiceISP;
    private PersonServiceSRP personSRP;
    @Before
    public void setUpPaymentViolationOCP() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppCinfigViolation.class);
        salaryViolationOCP = (SalaryViolationOCP)ctx.getBean("ocp");
    }

    @Test
    public void testPaymentViolationOCP() throws Exception
    {
       String position =  salaryViolationOCP.makePaymentToo("Manager");
        Assert.assertEquals("Manager", position);
    }

    //End of Open Close Principle

    //Start of Dependency Inversion Principle

    @Before
    public void setUpVehicleViolation() throws Exception
    {
        carDIP = new CarDIPImpl();
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppCinfigViolation.class);
        vehicleDIP = (VehicleDIPImpl)ctx.getBean("dip");
    }

    @Test
    public void testVehicleViolation() throws Exception
    {
        vehicleDIP.setCarDIP(carDIP);
        int speed = vehicleDIP.accelarateVehicle();
       Assert.assertEquals(25,speed);
    }

    //End of Dependency Inversion Principle

    //Start of Interface Segregation Principle (ISP)

    @Before
    public void setUpAnimalService() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppCinfigViolation.class);
        animalServiceISP = (AnimalServiceISP)ctx.getBean("isp");
    }

    @Test
    public void testAnimalService() throws Exception {
        String state = animalServiceISP.walk();
        Assert.assertEquals("I can walk", state);
    }

    //End of Interface Segregation Principle (ISP)

    // Start of Single Responsibility Principle

    @Before
    public void setUpUser() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppCinfigViolation.class);
        personSRP = (PersonServiceSRP)ctx.getBean("srp");
    }

    @Test
    public void testUser() throws Exception
    {
        String password = personSRP.SetPassowrd();
        Assert.assertEquals("veeboi", password);
    }

    //End of Single Responsibility Principle
}

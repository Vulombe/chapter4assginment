package cput.ac.za;


import cput.ac.za.conf.AppConfigCorrection;
import cput.ac.za.softwaredesignprinciple.correction.AnimalServicesISP;
import cput.ac.za.softwaredesignprinciple.correction.PersonServicesSRP;
import cput.ac.za.softwaredesignprinciple.correction.SalaryServiceOCP;
import cput.ac.za.softwaredesignprinciple.correction.VehicleServiceDIP;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/22.
 */
public class TestCorrectionSDP
{

    private SalaryServiceOCP salaryServiceOCP;
    private VehicleServiceDIP vehicleServiceDIP;
    private AnimalServicesISP animalServicesISP;
    private PersonServicesSRP personServicesSRP;
    //Start of Open Close Principle
    @Before
    public void setUpPaymentViolationOCP() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigCorrection.class);
        salaryServiceOCP = (SalaryServiceOCP)ctx.getBean("ocp2");
    }

    @Test
    public void testPaymentViolationOCP() throws Exception
    {
        String position =  salaryServiceOCP.payEmployee();
        Assert.assertEquals("Manager", position);
    }

    //End of Open Close Principle

    //Start of Dependency Inversion Principle

    @Before
    public void setUpVehicleViolation() throws Exception
    {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigCorrection.class);
        vehicleServiceDIP = (VehicleServiceDIP)ctx.getBean("dip2");
    }

    @Test
    public void testVehicleViolation() throws Exception
    {

        int speed = vehicleServiceDIP.accelerate();
        Assert.assertEquals(25,speed);
    }

    //End of Dependency Inversion Principle

    //Start of Interface Segregation Principle (ISP)

    @Before
    public void setUpAnimalService() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigCorrection.class);
        animalServicesISP = (AnimalServicesISP)ctx.getBean("isp2");
    }

    @Test
    public void testAnimalService() throws Exception {
        String state = animalServicesISP.move();
        Assert.assertEquals("I can walk", state);
    }

    //End of Interface Segregation Principle (ISP)

    // Start of Single Responsibility Principle

    @Before
    public void setUpUser() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigCorrection.class);
        personServicesSRP = (PersonServicesSRP)ctx.getBean("srp2");
    }

    @Test
    public void testUser() throws Exception
    {
        String password = personServicesSRP.SetPassowrds();
        Assert.assertEquals("veeboi1", password);
    }

    //End of Single Responsibility Principle
}

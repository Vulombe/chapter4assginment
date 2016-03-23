package cput.ac.za;

import cput.ac.za.conf.AppConfig;
import cput.ac.za.domain.Person;
import cput.ac.za.domain.Student;
import cput.ac.za.services.PersonService;
import cput.ac.za.services.StudentService;
import cput.ac.za.services.TransportServices;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/14.
 */
public class TestObjectOriented
{
//********************* For Encapsulation **********
    private PersonService personService;
    @Before
    public void setUpPerson() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        personService = (PersonService)ctx.getBean("person");
    }

    @Test
    public void testPerson() throws Exception {
        Person person = personService.getPerson();
        System.out.println("The Person's address is " + personService.getPerson().getAddress());
        Assert.assertEquals(person.getfName(), "Vulombe");
    }
//********************** End Of Encapsulation **************

//********************** For Inheritance *******************

    private StudentService studentService;
    @Before
    public void setUpStudent() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        studentService = (StudentService)ctx.getBean("student");
    }

    @Test
    public void testStudent() throws Exception {
        Student student = studentService.getStudent();
        System.out.println("The Student number is " + studentService.getStudent().getStudentNumber());
        Assert.assertEquals(student.getfName(), "Themba");
    }
//********************** END of Inheritance *******************

//********************** For Polymorphism *******************
    private TransportServices transportServices;
    private TransportServices transportServices2;

    @Before
    public void setUpAirPlane() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        transportServices = (TransportServices)ctx.getBean("airplane");
    }

    @Test
    public void testAirPlane() throws Exception {
        String movePlane = transportServices.move();
        Assert.assertEquals("Fly High", movePlane);
    }

    @Before
    public void setUpTruck() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        transportServices2 = (TransportServices)ctx.getBean("truck");
    }

    @Test
    public void testTruck() throws Exception {
        String moveTruck = transportServices2.move();
        Assert.assertEquals("Move Straight", moveTruck);
    }
// ******************** End Of Polymorphism ******************
}

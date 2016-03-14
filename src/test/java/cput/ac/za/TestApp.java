package cput.ac.za;

import cput.ac.za.conf.AppConfig;
import cput.ac.za.domain.Person;
import cput.ac.za.services.PersonService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/14.
 */
public class TestApp
{
    private PersonService personService;
    private PersonService studentService;
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



}

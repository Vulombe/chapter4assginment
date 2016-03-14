package cput.ac.za.services.Impl;

import cput.ac.za.domain.Person;
import cput.ac.za.services.PersonService;

import java.util.Date;

/**
 * Created by student on 2016/03/14.
 */
public class PersonServiceImpl implements PersonService
{
    @Override
    public Person getPerson()
    {
        Person person = new Person();
        person.setfName("Vulombe");
        person.setlName("Makhubele");
        person.setAddress("Cape Town");
        person.setDob(new Date());

        return person;
    }
}

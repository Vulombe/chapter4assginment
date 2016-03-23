package cput.ac.za.conf;

import cput.ac.za.services.Impl.AirPlaneServiceImpl;
import cput.ac.za.services.Impl.PersonServiceImpl;
import cput.ac.za.services.Impl.StudentServiceImpl;
import cput.ac.za.services.Impl.TruckServiceImpl;
import cput.ac.za.services.PersonService;
import cput.ac.za.services.StudentService;
import cput.ac.za.services.TransportServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 2016/03/14.
 */
@Configuration
public class AppConfig
{
    @Bean (name = "person")
    public PersonService getPerson()
    {
        return new PersonServiceImpl();
    }

    @Bean (name = "student")
    public StudentService getStudent()
    {
        return new StudentServiceImpl();
    }

    @Bean (name = "airplane")
    public TransportServices getAirplane()
    {
        return new AirPlaneServiceImpl();
    }

    @Bean (name = "truck")
    public TransportServices getTruck()
    {
        return new TruckServiceImpl();
    }
}

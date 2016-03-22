package cput.ac.za.conf;

import cput.ac.za.services.PersonService;
import cput.ac.za.softwaredesignprinciple.violation.AnimalServiceISP;
import cput.ac.za.softwaredesignprinciple.violation.Impl.PaymentViolationImplOCP;
import cput.ac.za.softwaredesignprinciple.violation.Impl.ReptileServiceImpl;
import cput.ac.za.softwaredesignprinciple.violation.Impl.UserServiceImplSRP;
import cput.ac.za.softwaredesignprinciple.violation.Impl.VehicleDIPImpl;
import cput.ac.za.softwaredesignprinciple.violation.PersonServiceSRP;
import cput.ac.za.softwaredesignprinciple.violation.SalaryViolationOCP;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 2016/03/22.
 */
@Configuration
public class AppCinfigViolation
{
    @Bean(name = "ocp")
    public SalaryViolationOCP getSalaryViolation()
    {
        return new PaymentViolationImplOCP();
    }

    @Bean(name = "dip")
    public VehicleDIPImpl getVehicle()
    {
        return new VehicleDIPImpl();
    }

    @Bean(name = "isp")
    public AnimalServiceISP getAnimal()
    {
        return new ReptileServiceImpl();
    }

    @Bean(name = "srp")
    public PersonServiceSRP getUser()
    {
        return new UserServiceImplSRP();
    }
}

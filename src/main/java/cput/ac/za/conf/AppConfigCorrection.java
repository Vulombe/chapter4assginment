package cput.ac.za.conf;

import cput.ac.za.softwaredesignprinciple.correction.AnimalServicesISP;
import cput.ac.za.softwaredesignprinciple.correction.Impl.*;
import cput.ac.za.softwaredesignprinciple.correction.PersonServicesSRP;
import cput.ac.za.softwaredesignprinciple.correction.SalaryServiceOCP;
import cput.ac.za.softwaredesignprinciple.correction.VehicleServiceDIP;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 2016/03/22.
 */
@Configuration
public class AppConfigCorrection
{
    @Bean(name = "ocp2")
    public SalaryServiceOCP getManagerPayment()
    {
        return new PayManagerServiceImpl();
    }

    @Bean(name = "ocp3")
    public SalaryServiceOCP getBaseWorkerPayment()
    {
        return new PayBaseWorkerServiceImpl();
    }
    @Bean(name = "dip2")
    public VehicleServiceDIP getVehicle()
    {
        return new CarServiceImpl();
    }

    @Bean(name = "isp2")
    public AnimalServicesISP getAnimal()
    {
        return new ReptileServicesImpl();
    }

    @Bean(name = "srp2")
    public PersonServicesSRP getUser()
    {
        return new UserServiceImpl();
    }

}

package cput.ac.za.softwaredesignprinciple.violation.Impl;

/**
 * Created by student on 2016/03/22.
 */
public class VehicleDIPImpl
{
    CarDIPImpl carDIP;

    public void setCarDIP(CarDIPImpl carDIP) {
        this.carDIP = carDIP;
    }

    public int accelarateVehicle()
    {
        return carDIP.accelerate();
    }
}

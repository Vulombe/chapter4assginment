package cput.ac.za.softwaredesignprinciple.correction.Impl;

import cput.ac.za.softwaredesignprinciple.correction.VehicleServiceDIP;

/**
 * Created by student on 2016/03/23.
 */
public class CarServiceImpl implements VehicleServiceDIP
{
    @Override
    public int accelerate()
    {
        return 5 * 5;
    }
}

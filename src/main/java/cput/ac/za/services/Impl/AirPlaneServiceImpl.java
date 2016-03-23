package cput.ac.za.services.Impl;

import cput.ac.za.services.TransportServices;

/**
 * Created by student on 2016/03/23.
 */
public class AirPlaneServiceImpl implements TransportServices
{
    @Override
    public String StartEngine()
    {
        return "Press Button";
    }
    @Override
    public String move()
    {
        return "Fly High";
    }
}

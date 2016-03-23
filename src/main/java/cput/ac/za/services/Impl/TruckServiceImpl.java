package cput.ac.za.services.Impl;

import cput.ac.za.services.TransportServices;

/**
 * Created by student on 2016/03/23.
 */
public class TruckServiceImpl implements TransportServices
{
    @Override
    public String StartEngine()
    {
        return "Enter Key";
    }
    @Override
    public String move()
    {
        return "Move Straight";
    }
}

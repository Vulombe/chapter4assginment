package cput.ac.za.softwaredesignprinciple.correction.Impl;

import cput.ac.za.softwaredesignprinciple.correction.AnimalServicesISP;

/**
 * Created by student on 2016/03/23.
 */
public class ReptileServicesImpl implements AnimalServicesISP
{
    @Override
    public String move()
    {
        return "I can walk";
    }
}

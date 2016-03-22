package cput.ac.za.softwaredesignprinciple.violation.Impl;

import cput.ac.za.softwaredesignprinciple.violation.AnimalServiceISP;

/**
 * Created by student on 2016/03/22.
 */
public class ReptileServiceImpl implements AnimalServiceISP
{
    @Override
    public String fly()
    {
        return "I cannot fly";
    }

    @Override
    public String walk()
    {
        return "I can walk";
    }
}

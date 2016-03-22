package cput.ac.za.softwaredesignprinciple.violation.Impl;

import cput.ac.za.softwaredesignprinciple.violation.PersonServiceSRP;

/**
 * Created by student on 2016/03/22.
 */
public class UserServiceImplSRP implements PersonServiceSRP
{
    @Override
    public String setUserName()
    {
        return "Vulombe";
    }
    @Override
    public String SetPassowrd()
    {
        return "veeboi";
    }
    @Override
    public String setCridentials()
    {
        return "Match";
    }
}

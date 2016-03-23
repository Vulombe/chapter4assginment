package cput.ac.za.softwaredesignprinciple.correction.Impl;

import cput.ac.za.softwaredesignprinciple.correction.CridentialsServiceSRP;
import cput.ac.za.softwaredesignprinciple.correction.PersonServicesSRP;


/**
 * Created by student on 2016/03/23.
 */
public class UserServiceImpl implements PersonServicesSRP
{
    @Override
    public String setUserNames()
    {
        return "Vulombe1";
    }
    @Override
    public String SetPassowrds()
    {
        return "veeboi1";
    }
    @Override
    public void setUserCridentials(CridentialsServiceSRP cridentials){
        cridentials.getCridentialsAsString();
    }
}

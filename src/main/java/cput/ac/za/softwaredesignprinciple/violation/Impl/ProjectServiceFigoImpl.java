package cput.ac.za.softwaredesignprinciple.violation.Impl;

import cput.ac.za.softwaredesignprinciple.violation.ProjectServiceLSK;

import java.util.Scanner;

/**
 * Created by student on 2016/03/23.
 */
public class ProjectServiceFigoImpl implements ProjectServiceLSK
{
    @Override
    public boolean InstallPlumping()
    {
        char check = 'N';

        if(check == 'Y')
            return true;
        return false;
    }
    //Only for buildings with elevators
    @Override
    public boolean MaintainElevator()
    {

        char check = 'Y';
        if(check == 'Y')
            return true;
        return false;
    }
}

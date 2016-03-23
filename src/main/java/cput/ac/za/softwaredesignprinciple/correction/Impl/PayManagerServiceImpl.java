package cput.ac.za.softwaredesignprinciple.correction.Impl;

import cput.ac.za.softwaredesignprinciple.correction.SalaryServiceOCP;

/**
 * Created by student on 2016/03/23.
 */
public class PayManagerServiceImpl implements SalaryServiceOCP
{
    @Override
    public String payEmployee()
    {
        return "Manager";
    }
}

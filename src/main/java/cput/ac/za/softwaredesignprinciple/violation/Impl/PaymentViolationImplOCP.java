package cput.ac.za.softwaredesignprinciple.violation.Impl;

import cput.ac.za.softwaredesignprinciple.violation.SalaryViolationOCP;

/**
 * Created by student on 2016/03/22.
 */
public class PaymentViolationImplOCP extends PaymentViolation
{
    String salary = "";
    @Override
    public String makePaymentToo(String position)
    {
        if (position == "Manager")
            return salary = "Manager";
        else
            return salary = "base workers";
    }
}

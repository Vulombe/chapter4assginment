package cput.ac.za.softwaredesignprinciple.violation.Impl;

import cput.ac.za.softwaredesignprinciple.violation.SalaryViolationOCP;

/**
 * Created by student on 2016/03/22.
 */
public abstract class PaymentViolation implements SalaryViolationOCP
{
    @Override
    public abstract String makePaymentToo(String position);
}

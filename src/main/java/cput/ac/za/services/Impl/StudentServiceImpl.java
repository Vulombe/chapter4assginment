package cput.ac.za.services.Impl;

import cput.ac.za.domain.Student;
import cput.ac.za.services.StudentService;

import java.util.Date;

/**
 * Created by student on 2016/03/15.
 */
public class StudentServiceImpl implements StudentService
{
    @Override
    public Student getStudent()
    {
        Student student = new Student("Themba","Makhubele","Polokwane", new Date());
        student.setStudentNumber("212064078");

        return student;
    }
}

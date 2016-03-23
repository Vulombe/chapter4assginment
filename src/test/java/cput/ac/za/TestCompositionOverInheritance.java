package cput.ac.za;

import cput.ac.za.domain.composition.StudentComp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/23.
 */
public class TestCompositionOverInheritance
{
    private StudentComp studentComp;
    @Before
    public void setUpStudentComp() throws Exception {
        studentComp = new StudentComp();

    }

    @Test
    public void testStudentComp() throws Exception {
        String fName = studentComp.getFname();
        Assert.assertEquals("Chauke", fName);
    }
}

package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

       assertEquals(job1.getId() + 1, job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job3.getName() instanceof String);
        assertEquals("Product tester", job3.getName());

        assertTrue(job3.getEmployer() instanceof Employer);
        assertEquals("ACME", job3.getEmployer().toString()); //Had to convert the different datat types to Strings.

        assertTrue(job3.getLocation() instanceof Location);
        assertEquals("Desert", job3.getLocation().toString());

        assertTrue(job3.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job3.getPositionType().toString());

        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job3.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality() {
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job4.equals(job5));
    }

}

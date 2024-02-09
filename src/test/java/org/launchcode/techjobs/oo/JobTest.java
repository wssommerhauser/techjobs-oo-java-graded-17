package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals("All jobs are meant to have unique IDs.", job1.getId(), job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertTrue(job1.getName() instanceof String);
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", job1.getName());
        assertEquals( "ACME", job1.getEmployer().getValue());
        assertEquals("Desert", job1.getLocation().getValue());
        assertEquals("Quality Control", job1.getPositionType().getValue());
        assertEquals("Persistence", job1.getCoreCompetency().getValue());
    }

     @Test
    public void testJobsForEquality() {
        Job job1 = new Job ("Samuel",new Employer("Company Inc"),new Location("Da Badlands"), new PositionType("Company Doings"),new CoreCompetency("Deeds"));
        Job job2 = new Job ("Samuel",new Employer("Company Inc"),new Location("Da Badlands"), new PositionType("Company Doings"),new CoreCompetency("Deeds"));

         assertTrue(!job1.equals(job2));

     }
}

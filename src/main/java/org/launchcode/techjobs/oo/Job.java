package org.launchcode.techjobs.oo;

import java.util.Objects;

import static java.util.Objects.isNull;


public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String aname, Employer e, Location l, PositionType pt, CoreCompetency cc){
        this();
        this.name = aname;
        this.employer = e;
        this.location = l;
        this.positionType = pt;
        this.coreCompetency = cc;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString(){
        if(isNull(this.name) && isNull(this.location) && isNull(this.employer) && isNull(this.positionType) && isNull(this.coreCompetency)){
            return System.lineSeparator() + "OOPS! This job does not seem to exist." + System.lineSeparator();
        }
        else{
            return "\nID: " + this.id +
                    "\nName: " + ((this.name.isBlank()) ?  "Data not available" : this.name)+
                    "\nEmployer: " + ((this.employer.toString().isBlank()) ?  "Data not available" : this.employer)+
                    "\nLocation: " + ((this.location.toString().isBlank()) ?  "Data not available" : this.location)+
                    "\nPosition Type: " + ((this.positionType.toString().isBlank()) ?  "Data not available" : this.positionType)+
                    "\nCore Competency: " + ((this.coreCompetency.toString().isBlank()) ?  "Data not available" : this.coreCompetency) + "\n";
        }
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Job job = (Job) object;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}

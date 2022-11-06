package org.example;

public class Project {

    private String name;
    private int theResources;
    private int theEmployees;
    private int theWorkBreakdownStructure;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTheResources() {
        // TODO - implement Project.getTheResources
        return theResources;
    }


    public void setTheResources(int theResources) {
        this.theResources = theResources;
    }

    public void getTheEmployees() {
        // TODO - implement Project.getTheEmployees
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param theEmployees
     */
    public void setTheEmployees(int theEmployees) {
        this.theEmployees = theEmployees;
    }

    public int getTheWorkBreakdownStructure() {
        // TODO - implement Project.getTheWorkBreakdownStructure
        return theWorkBreakdownStructure;
    }

    /**
     *
     * @param theWordBreakdownStructure
     */
    public void setTheWorkBreakdownStructure(int theWordBreakdownStructure) {
        this.theWorkBreakdownStructure = theWordBreakdownStructure;
    }

}

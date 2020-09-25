/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshelter;

/**
 *
 * @author jessi
 */
//create an employee class that extends the people class
public class Employee extends People{
    
    //create a string  name
    private String name;
    
    //create an int employee ID
    private int employeeID;
    
    /**
     * Employee constructor
     */
    public Employee() {
        this.name = name;
        this.employeeID = employeeID;
    }


    /**
     * Get the value of employeeID
     * @return employeeId
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * Set the value of employeeID
     * @param employeeID 
     */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * Get the value of name
     * @return name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     * @param name 
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    
}

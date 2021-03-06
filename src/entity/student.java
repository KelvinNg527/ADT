/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author KELVIN
 */
public class student implements Serializable{
    
    private String ID;
    private String name;
    private String reason;

    public student(String ID, String name, String reason) {
        this.ID = ID;
        this.name = name;
        this.reason = reason;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getReason() {
        return reason;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return String.format("ID: %-20s Name: %-20s Reason: %-1000s", ID, name, reason);
    }

    

   

}

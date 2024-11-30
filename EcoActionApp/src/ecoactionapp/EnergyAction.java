/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecoactionapp;

/**
 *
 * @author joegr
 */
public class EnergyAction {
    private String actionDescription;
    private double energySaved; // in kWh

    public EnergyAction(String actionDescription, double energySaved) {
        this.actionDescription = actionDescription;
        this.energySaved = energySaved;
    }

    // Getters
    public String getActionDescription() {
        return actionDescription;
    }

    public double getEnergySaved() {
        return energySaved;
    }

    // Setters
    public void setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }

    public void setEnergySaved(double energySaved) {
        this.energySaved = energySaved;
    }
}

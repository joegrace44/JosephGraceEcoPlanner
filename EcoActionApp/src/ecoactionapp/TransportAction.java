/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecoactionapp;

/**
 *
 * @author joegr
 */
public class TransportAction {
    private String transportType;
    private double distanceTravelled; // in kilometers
    private double co2Emission; // in kg CO2 emitted

    public TransportAction(String transportType, double distanceTravelled) {
        this.transportType = transportType;
        this.distanceTravelled = distanceTravelled;
        this.co2Emission = calculateCO2Emission();
    }

    // Calculate CO2 emissions
    private double calculateCO2Emission() {
        switch (transportType.toLowerCase()) {
            case "car":
                return distanceTravelled * 0.21;
            case "bike":
            case "walk":
                return 0; // No emissions for biking or walking
            case "bus":
                return distanceTravelled * 0.05;
            default:
                return distanceTravelled * 0.0; 
        }
    }

    // Getters
    public String getTransportType() {
        return transportType;
    }

    public double getDistanceTravelled() {
        return distanceTravelled;
    }

    public double getCO2Emission() {
        return co2Emission;
    }

    // Setters
    public void setTransportType(String transportType) {
        this.transportType = transportType;
        this.co2Emission = calculateCO2Emission(); // Recalculate emissions
    }

    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
        this.co2Emission = calculateCO2Emission(); // Recalculate emissions
    }
}

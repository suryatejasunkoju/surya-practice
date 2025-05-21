package com.practise.surya_practise.LLD.design_patterns.builder.actual_builder;

public class Car {
    private int seats;
    private String engine;
    private boolean hasTripComputer;
    private boolean hasGPS;

    // Setters
    public void setSeats(int seats) { this.seats = seats; }
    public void setEngine(String engine) { this.engine = engine; }
    public void setTripComputer(boolean hasTripComputer) { this.hasTripComputer = hasTripComputer; }
    public void setGPS(boolean hasGPS) { this.hasGPS = hasGPS; }

    @Override
    public String toString() {
        return "Car [seats=" + seats + ", engine=" + engine + ", tripComputer=" + hasTripComputer + ", GPS=" + hasGPS + "]";
    }
}

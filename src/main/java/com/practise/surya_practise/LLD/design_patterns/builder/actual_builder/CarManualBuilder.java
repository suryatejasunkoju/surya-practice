package com.practise.surya_practise.LLD.design_patterns.builder.actual_builder;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        reset();
    }

    public void reset() {
        manual = new Manual();
    }

    public void setSeats(int number) {
        manual.addContent("Seats: " + number);
    }

    public void setEngine(String engine) {
        manual.addContent("Engine: " + engine);
    }

    public void setTripComputer() {
        manual.addContent("Includes trip computer.");
    }

    public void setGPS() {
        manual.addContent("Includes GPS.");
    }

    public Manual getResult() {
        return manual;
    }
}

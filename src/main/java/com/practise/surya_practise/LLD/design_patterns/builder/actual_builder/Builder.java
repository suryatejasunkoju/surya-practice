package com.practise.surya_practise.LLD.design_patterns.builder.actual_builder;

public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(String engine);
    void setTripComputer();
    void setGPS();
}

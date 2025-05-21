package com.practise.surya_practise.LLD.design_patterns.builder.actual_builder;

public class Manual {
    private String content = "";

    public void addContent(String instruction) {
        content += instruction + "\n";
    }

    @Override
    public String toString() {
        return "Manual:\n" + content;
    }
}

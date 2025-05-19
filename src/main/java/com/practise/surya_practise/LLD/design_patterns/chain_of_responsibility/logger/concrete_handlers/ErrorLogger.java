package com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.logger.concrete_handlers;

import com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.logger.abstract_handler.Logger;

public class ErrorLogger extends Logger {
    public ErrorLogger(int level) {
        super(level);
    }

    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}
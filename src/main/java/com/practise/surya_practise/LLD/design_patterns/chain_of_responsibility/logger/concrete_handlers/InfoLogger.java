package com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.logger.concrete_handlers;

import com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.logger.abstract_handler.Logger;

public class InfoLogger extends Logger {
    public InfoLogger(int level) {
        super(level);
    }

    protected void write(String message) {
        System.out.println("INFO: " + message);
    }
}
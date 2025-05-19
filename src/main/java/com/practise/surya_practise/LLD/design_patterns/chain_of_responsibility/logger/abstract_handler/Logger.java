package com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.logger.abstract_handler;

public abstract class Logger {
    protected Logger next;
    protected int level;

    public Logger(int level) {
        this.level = level;
    }

    public void setNext(Logger next) {
        this.next = next;
    }

    public void log(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (next != null) {
            next.log(level, message);
        }
    }

    protected abstract void write(String message);
}
package com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex2_DB.factory;

import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex2_DB.factory_of_factory.DbFactory;

public class MySqlFactory implements DbFactory {
    // This class implements the DbFactory interface and provides concrete implementations for the methods defined in the interface.
    @Override
    public void executeQuery() {
        System.out.println("Executing MySQL query");
    }
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database");
    }
    @Override
    public String toString() {
        return "MySqlFactory";
    }
}

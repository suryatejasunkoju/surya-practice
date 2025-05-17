package com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex2_DB.factory;

import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex2_DB.factory_of_factory.DbFactory;

public class MongoDbFactory implements DbFactory {

    @Override
    public void executeQuery() {
        System.out.println("Executing query in MongoDB");
    }

    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB");
    }
    @Override
    public String toString() {
        return "MongoDbFactory";
    }
}

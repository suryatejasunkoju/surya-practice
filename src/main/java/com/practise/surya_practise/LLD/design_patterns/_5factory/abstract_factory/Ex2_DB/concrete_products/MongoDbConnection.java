package com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex2_DB.concrete_products;

import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex2_DB.abstract_products.DbConnection;

public class MongoDbConnection implements DbConnection {
    @Override
    public void connect() {
        System.out.println("Mongo DB Connection");
    }
}

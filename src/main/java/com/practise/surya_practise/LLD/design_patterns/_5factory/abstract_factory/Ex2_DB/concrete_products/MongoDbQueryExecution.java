package com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex2_DB.concrete_products;

import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex2_DB.abstract_products.DbQueryExecution;

public class MongoDbQueryExecution implements DbQueryExecution {
    @Override
    public void executeQuery() {
        System.out.println("Mongo DB Query Execution");
    }
}

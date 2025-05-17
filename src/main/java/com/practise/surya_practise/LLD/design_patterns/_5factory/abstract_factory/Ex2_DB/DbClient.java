package com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex2_DB;

import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex2_DB.factory.MongoDbFactory;
import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex2_DB.factory.MySqlFactory;
import com.practise.surya_practise.LLD.design_patterns._5factory.abstract_factory.Ex2_DB.factory_of_factory.DbFactory;

public class DbClient {

    public static void run()
    {
        System.out.println("Running DB Client...");
        DbFactory dbFactory=null;
        String dbType = "MongoDB"; // This can be changed to "PostgreSQL" or "MongoDB" to test other factories
        System.out.println("DB Type: " + dbType);
        if (dbType.equals("MySQL"))
        {
            dbFactory = new MySqlFactory();
        } else if (dbType.equals("MongoDB")) {
            dbFactory = new MongoDbFactory();
        }
        else {
            throw new UnsupportedOperationException("Unsupported DB type: " + dbType);
        }
        dbFactory.connect();
        dbFactory.executeQuery();
    }
}

package com.dshulzhenko;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.h2.tools.DeleteDbFiles;

import com.dshulzhenko.resources.ShoppingListResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ShoppingListServiceApplication extends Application<ShoppingListServiceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ShoppingListServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "ShoppingListService";
    }

    @Override
    public void initialize(final Bootstrap<ShoppingListServiceConfiguration> bootstrap) {
        // TODO: application initialization
    	
    }

    @Override
    public void run(final ShoppingListServiceConfiguration configuration,
                    final Environment environment) {
    	final ShoppingListResource resource = new ShoppingListResource();
    	environment.jersey().register(resource);
    	
    	DeleteDbFiles.execute("~", "test", true);
    	Class.forName("org.h2.Driver");
        Connection conn = DriverManager.
            getConnection("jdbc:h2:~/test", "sa", "");
        // add application code here
        Statement stmt = conn.createStatement();
        stmt.execute("CREATE TABLE PERSON(id int primary key, name varchar(255))");
        conn.close();
    }

}

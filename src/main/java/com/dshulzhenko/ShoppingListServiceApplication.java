package com.dshulzhenko;

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
    }

}

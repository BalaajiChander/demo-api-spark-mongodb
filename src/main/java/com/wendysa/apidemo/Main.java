package com.wendysa.apidemo;

import org.mongodb.morphia.Morphia;
import static spark.Spark.*;
import java.lang.String;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import com.wendysa.apidemo.serviceImpl.GamingPCImplModule;
import com.wendysa.apidemo.services.IGamingPCService;
import com.wendysa.apidemo.utility.JsonResponseTransformer;

public class Main 
{
    public static final int API_VERSION = 1;

    private IGamingPCService gamingPcService;

    @Inject
    public Main(IGamingPCService gamingPcService) {
        this.gamingPcService = gamingPcService;
    }

    public static void main( String[] args )
    {
        Injector injector = Guice.createInjector(new GamingPCImplModule());
        IGamingPCService gamingPCService = injector.getInstance(IGamingPCService.class);
        new Main(gamingPCService).start();
    }

    public void start() {
        registerRoutes();
    }
    /**
     * A helper for registering API routes
     */
    private void registerRoutes() {
        /**
         * Set the response's content type as application/json
         */
        after((req, res) -> res.type("application/json"));

        /**
         * Get a list of gaming PC records. Default maximum records: 10 records.
         * Verb: GET
         * Path: /api/v1/gamingpc
         */
        get(String.format("/api/v%s/gamingpc", API_VERSION), (req, res) -> {
             // TODO: Get max retrieved record from request's param
            final int maxRetrievedRecord = 10;

            return gamingPcService.retrieve(maxRetrievedRecord);
        }, new JsonResponseTransformer());
    }

}

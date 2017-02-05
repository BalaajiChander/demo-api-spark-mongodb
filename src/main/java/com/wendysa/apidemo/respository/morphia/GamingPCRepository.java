package com.wendysa.apidemo.respository.morphia;

import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.FindOptions;
import org.mongodb.morphia.query.Query;
import com.mongodb.MongoClient;

import com.wendysa.apidemo.models.GamingPc;
import com.wendysa.apidemo.respository.IGamingPCRepository;
import com.wendysa.apidemo.utility.MongoClientFactory;

public class GamingPCRepository implements IGamingPCRepository {
    private Morphia morphia;
    private final String DB_NAME = "api-research";

    public GamingPCRepository(){
        this.morphia = new Morphia();
        this.morphia.mapPackage("com.wendysa.apidemo.models");
    }
    public List<GamingPc> getAll(int limit) {
        // Get mongodb connection from pool. 
        MongoClient mongoClient = MongoClientFactory.Create();
        Datastore dataStore = morphia.createDatastore(mongoClient, DB_NAME);
        
        Query<GamingPc> query = dataStore.find(GamingPc.class);
        
        // Build 'get All' mongodb query object 
        FindOptions findOptions = new FindOptions();
        findOptions.limit(limit);
        List<GamingPc> result = query.asList(findOptions);
        mongoClient.close();
        return result;
    }    
}
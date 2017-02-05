package com.wendysa.apidemo.utility;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;

public class MongoClientFactory {
    static final int maxConnectionIdleTime = 60000;

    public static MongoClient Create(){
        
        MongoClientOptions.Builder mongoClientOptionsBuilder = new MongoClientOptions.Builder();
        mongoClientOptionsBuilder.maxConnectionIdleTime(maxConnectionIdleTime);
        MongoClientOptions mongoClientOptions = mongoClientOptionsBuilder.build();

        return new MongoClient("localhost:27017", mongoClientOptions);
    }
}
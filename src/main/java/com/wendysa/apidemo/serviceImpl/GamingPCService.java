package com.wendysa.apidemo.serviceImpl;

import java.util.List;
import com.google.inject.Inject;

import com.wendysa.apidemo.services.IGamingPCService;
import com.wendysa.apidemo.respository.IGamingPCRepository;
import com.wendysa.apidemo.models.GamingPc;

public class GamingPCService implements IGamingPCService {
    private IGamingPCRepository gamingPcRepository;

    @Inject
    public GamingPCService(IGamingPCRepository gamingPcRepository) {
        this.gamingPcRepository = gamingPcRepository;
    }

    /**
     * Retrieve Gaming PC Records from database
     */
    public List<GamingPc> retrieve(int maxRetrievedRecord) {
        // TODO: Call gamingpc repository's getAll with empty criteria & pick first 10 records.
        //       The method should be an asynchronous method and return promise /future.
        return gamingPcRepository.getAll(maxRetrievedRecord);
    }

}
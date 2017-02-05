package com.wendysa.apidemo.services;

import java.util.List;

import com.wendysa.apidemo.models.GamingPc;

public interface IGamingPCService {
    List<GamingPc> retrieve(int maxRetrievedRecord);
}
package com.wendysa.apidemo.serviceImpl;

import com.google.inject.AbstractModule;
import com.wendysa.apidemo.respository.IGamingPCRepository;
import com.wendysa.apidemo.respository.morphia.GamingPCRepository;
import com.wendysa.apidemo.serviceImpl.GamingPCService;
import com.wendysa.apidemo.services.IGamingPCService;

public class GamingPCImplModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IGamingPCService.class).to(GamingPCService.class);
        bind(IGamingPCRepository.class).to(GamingPCRepository.class);
    }
}
package com.salary.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicesService {
 
	@Autowired
	private ServicesRepository servicesRepository;
	
    public Services addServices(Services Services) {
    	servicesRepository.save(Services);
    	return Services;
    }
    
    public List<Services>  getAllServices() {
    	return servicesRepository.findAll();
    }
    
    public Services getByIdServices(int id) {
    	return servicesRepository.findById(id).orElse(null);
    }
    
    public Services getByDesignationServices(String designationServices) {
    	return servicesRepository.findByDesignationServices(designationServices);
    }
    
    public Services updateServices(int id, Services services) {
    	Services oldServices = servicesRepository.findById(id).orElse(null);
    	oldServices.setDesignationServices(services.getDesignationServices()); 
    	oldServices.setUserModifiedServices(services.getUserModifiedServices());
    	oldServices.setDateModifiedServices(services.getDateModifiedServices()); 
    	servicesRepository.save(oldServices);
    	return oldServices;
    }
    
    public void deleteServices (int id) {
    	servicesRepository.deleteById(id);
    }
}



















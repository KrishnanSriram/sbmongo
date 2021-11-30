package com.example.sbmongo.sbmongo.service;

import com.example.sbmongo.sbmongo.model.Organization;
import com.example.sbmongo.sbmongo.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationRepository organizationRepository;

    public Organization saveOrganization(Organization org) {
        return organizationRepository.save(org);
    }

    public List<Organization> findAll() {
        return organizationRepository.findAll();
    }

    public Optional<Organization>findOrganizationByName(String orgName) {
        return organizationRepository.findByOrganizationName(orgName);
    }

    public Optional<Organization> findOrganizationById(String orgId) {
        return organizationRepository.findById(orgId);
    }
}

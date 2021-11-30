package com.example.sbmongo.sbmongo.repository;

import com.example.sbmongo.sbmongo.model.Organization;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface OrganizationRepository extends MongoRepository<Organization, String> {
    @Query("{name: '0?'}")
    public Optional<Organization> findByOrganizationName(String name);
}

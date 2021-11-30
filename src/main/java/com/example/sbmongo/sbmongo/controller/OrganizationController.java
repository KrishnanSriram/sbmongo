package com.example.sbmongo.sbmongo.controller;

import com.example.sbmongo.sbmongo.model.Organization;
import com.example.sbmongo.sbmongo.repository.OrganizationRepository;
import com.example.sbmongo.sbmongo.service.OrganizationService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/org")
public class OrganizationController {
    @Autowired
    private OrganizationService organizationService;

    public ResponseEntity<Organization> saveOrganization(@RequestBody Organization org) {
        Organization retOrg = organizationService.saveOrganization(org);
        return new ResponseEntity<>(retOrg, HttpStatus.OK);
    }

    public ResponseEntity<List<Organization>> listOrganizations() {
        List<Organization> lists = organizationService.findAll();
        return new ResponseEntity<>(lists, HttpStatus.OK);
    }

    @GetMapping("/{orgName}")
    public ResponseEntity<Organization> findOrganization(@RequestParam String orgName) {
        Optional<Organization> org = organizationService.findOrganizationById(orgName);
        return org.map(organization -> new ResponseEntity<>(organization, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}

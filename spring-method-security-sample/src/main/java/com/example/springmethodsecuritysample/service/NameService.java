package com.example.springmethodsecuritysample.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NameService {

    @PreAuthorize("hasAuthority('write')")
    public String getName() {
        return "Fantastic";
    }

    private Map<String, List<String>> secretNames = Map.of(
            "natalie", List.of("Energico", "Perfecto"),
            "emma", List.of("Fantastic")
            );

    @PreAuthorize("#name==authentication.principal.username")
    public List<String> getSecretName(String name) {
        return secretNames.get(name);
    }

}

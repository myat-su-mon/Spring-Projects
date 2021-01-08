package com.example.methodpermissionsdemo.security;

import com.example.methodpermissionsdemo.model.Document;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class DocumentsPermissionEvaluator implements PermissionEvaluator {
    @Override
    public boolean hasPermission(Authentication authentication,
                                 Object target,
                                 Object permission) {

        Document document=(Document) target;
        String p=(String) permission;

        boolean amdin=
                authentication.getAuthorities()
                .stream()
                .anyMatch(a -> a.getAuthority().equals(p));
        return amdin || document.getOwner().equals(authentication.getName());
    }

    @Override
    public boolean hasPermission(Authentication authentication,
                                 Serializable serializable,
                                 String targetType,
                                 Object permission) {
        return false;
    }
}

package com.solt.jdc.security;

import com.solt.jdc.security.utils.RolesHierarchyBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;

@Configuration
public class RoleHierarchyConfiguration {

    @Bean
    public RoleHierarchy roleHierarchy() {
        RoleHierarchyImpl roleHierarchy = new RoleHierarchyImpl();
        roleHierarchy.setHierarchy(
                new RolesHierarchyBuilder()
                        .append(SecurityRoles.CUSTOMERS_ADMIN, SecurityRoles.CUSTOMERS_CREATE)
                        .append(SecurityRoles.CUSTOMERS_ADMIN, SecurityRoles.CUSTOMERS_READ)
                        .append(SecurityRoles.CUSTOMERS_ADMIN, SecurityRoles.CUSTOMERS_DELETE)

                        .build()
        );

        return roleHierarchy;
    }
}

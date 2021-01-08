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
                        .append(SecurityRoles.SUPER_ADMIN, SecurityRoles.CUSTOMERS_ADMIN)
                        .append(SecurityRoles.CUSTOMERS_ADMIN, SecurityRoles.CUSTOMERS_CREATE)
                        .append(SecurityRoles.CUSTOMERS_ADMIN, SecurityRoles.CUSTOMERS_READ)
                        .append(SecurityRoles.CUSTOMERS_ADMIN, SecurityRoles.CUSTOMERS_DELETE)
                        .append(SecurityRoles.CUSTOMERS_ADMIN, SecurityRoles.CUSTOMERS_PAG_VIEW)

                        .append(SecurityRoles.SUPER_ADMIN, SecurityRoles.EMPLOYEES_ADMIN)
                        .append(SecurityRoles.EMPLOYEES_ADMIN, SecurityRoles.EMPLOYEES_CREATE)
                        .append(SecurityRoles.EMPLOYEES_ADMIN, SecurityRoles.EMPLOYEES_READ)
                        .append(SecurityRoles.EMPLOYEES_ADMIN, SecurityRoles.EMPLOYEES_DELETE)
                        .append(SecurityRoles.EMPLOYEES_ADMIN, SecurityRoles.EMPLOYEES_PAG_VIEW)

                        .append(SecurityRoles.SUPER_ADMIN, SecurityRoles.DEPARTMENTS_ADMIN)
                        .append(SecurityRoles.DEPARTMENTS_ADMIN, SecurityRoles.DEPARTMENTS_CREATE)
                        .append(SecurityRoles.DEPARTMENTS_ADMIN, SecurityRoles.DEPARTMENTS_READ)
                        .append(SecurityRoles.DEPARTMENTS_ADMIN, SecurityRoles.DEPARTMENTS_DELETE)
                        .append(SecurityRoles.DEPARTMENTS_ADMIN, SecurityRoles.DEPARTMENTS_PAG_VIEW)

                        .build()
        );

        return roleHierarchy;
    }
}

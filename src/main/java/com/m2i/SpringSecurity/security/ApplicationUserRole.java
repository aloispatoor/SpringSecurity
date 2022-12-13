package com.m2i.SpringSecurity.security;

import java.util.Set;

import static com.m2i.SpringSecurity.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    STUDENT(Set.of(STUDENT_READ, STUDENT_WRITE)),
    ADMIN(Set.of(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }
}

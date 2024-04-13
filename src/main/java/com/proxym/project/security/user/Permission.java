package com.proxym.project.security.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission {

    GET_ALL_USERS("user:getall"),
    ADMIN_READ("admin:read"),
    ADMIN_UPDATE("admin:update"),
    ADMIN_CREATE("admin:create"),
    ADMIN_DELETE("admin:delete"),
    COACH_READ("coach:read"),
    COACH_UPDATE("coach:update"),
    COACH_CREATE("coach:create"),
    COACH_DELETE("coach:delete"),
    TRAINEE_READ("trainee:read"),
    TRAINEE_UPDATE("trainee:update"),
    TRAINEE_CREATE("trainee:create"),
    TRAINEE_DELETE("trainee:delete"),

    ;
    @Getter
    private final String permission;
}

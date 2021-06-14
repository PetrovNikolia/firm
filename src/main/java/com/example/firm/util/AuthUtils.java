//package com.example.firm.util;
//
//import org.keycloak.KeycloakPrincipal;
//import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//
//import java.util.Collection;
//import java.util.UUID;
//
//public class AuthUtils {
//    public static UUID getCurrentUserUuid() {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        KeycloakAuthenticationToken keycloakAuthenticationToken = (KeycloakAuthenticationToken) auth;
//        KeycloakPrincipal keycloakPrincipal = (KeycloakPrincipal) keycloakAuthenticationToken.getPrincipal();
//        return UUID.fromString(keycloakPrincipal.getName());
//    }
//
//    public static Collection<? extends GrantedAuthority> getCurrentUserRole() {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        KeycloakAuthenticationToken keycloakAuthenticationToken = (KeycloakAuthenticationToken) auth;
//        return keycloakAuthenticationToken.getAuthorities();
//    }
//}

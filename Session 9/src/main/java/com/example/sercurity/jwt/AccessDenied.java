<<<<<<< HEAD
package com.example.sercurity.jwt;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Objects;
@Component
public class AccessDenied implements AccessDeniedHandler {
    private final Logger logger = LoggerFactory.getLogger(AccessDenied.class);
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        logger.error("UN PERMISSION {}", accessDeniedException.getMessage());
        ResponseEntity<String> responseEntity = new ResponseEntity<>("UN PERMISSION", HttpStatus.FORBIDDEN);
        response.setStatus(responseEntity.getStatusCode().value());
        response.getWriter().write(Objects.requireNonNull(responseEntity.getBody()));
    }
}
=======
package com.example.sercurity.jwt;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Objects;
@Component
public class AccessDenied implements AccessDeniedHandler {
    private final Logger logger = LoggerFactory.getLogger(AccessDenied.class);
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        logger.error("UN PERMISSION {}", accessDeniedException.getMessage());
        ResponseEntity<String> responseEntity = new ResponseEntity<>("UN PERMISSION", HttpStatus.FORBIDDEN);
        response.setStatus(responseEntity.getStatusCode().value());
        response.getWriter().write(Objects.requireNonNull(responseEntity.getBody()));
    }
}
>>>>>>> c3303dff8b471fcbb73403eba86ea8d7be10afd1

<<<<<<< HEAD
package com.ra.controller;

import com.ra.exception.CustomException;
import com.ra.model.dto.request.UserRequest;
import com.ra.model.dto.response.UserResponse;
import com.ra.service.user.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<Page<UserResponse>> index(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int limit) {
        Pageable pageable = PageRequest.of(page, limit);
        Page<UserResponse> userResponses = userService.findAll(pageable);
        return new ResponseEntity<>(userResponses, HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<?> save(@Valid @RequestBody UserRequest userRequest) throws CustomException {
//        if (result.hasErrors()) {
//            return new ResponseEntity<>(result.getAllErrors().get(0).getDefaultMessage(), HttpStatus.BAD_REQUEST);
//        }

        UserResponse userResponse = userService.saveOrUpdate(userRequest);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) throws CustomException {
        UserResponse userResponse = userService.findById(id);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

}
=======
package com.ra.controller;

import com.ra.exception.CustomException;
import com.ra.model.dto.request.UserRequest;
import com.ra.model.dto.response.UserResponse;
import com.ra.service.user.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<Page<UserResponse>> index(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int limit) {
        Pageable pageable = PageRequest.of(page, limit);
        Page<UserResponse> userResponses = userService.findAll(pageable);
        return new ResponseEntity<>(userResponses, HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<?> save(@Valid @RequestBody UserRequest userRequest) throws CustomException {
//        if (result.hasErrors()) {
//            return new ResponseEntity<>(result.getAllErrors().get(0).getDefaultMessage(), HttpStatus.BAD_REQUEST);
//        }

        UserResponse userResponse = userService.saveOrUpdate(userRequest);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) throws CustomException {
        UserResponse userResponse = userService.findById(id);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

}
>>>>>>> 1c065e15f1a3b41e68f9fa4d7be2ce15a25a2b7e

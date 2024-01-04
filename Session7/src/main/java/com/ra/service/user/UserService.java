<<<<<<< HEAD
package com.ra.service.user;

import com.ra.exception.CustomException;
import com.ra.model.dto.request.UserRequest;
import com.ra.model.dto.response.UserResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Page<UserResponse> findAll(Pageable pageable);
    UserResponse saveOrUpdate(UserRequest userRequest) throws CustomException;
    UserResponse findById (Long id) throws CustomException;
}
=======
package com.ra.service.user;

import com.ra.exception.CustomException;
import com.ra.model.dto.request.UserRequest;
import com.ra.model.dto.response.UserResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Page<UserResponse> findAll(Pageable pageable);
    UserResponse saveOrUpdate(UserRequest userRequest) throws CustomException;
    UserResponse findById (Long id) throws CustomException;
}
>>>>>>> 1c065e15f1a3b41e68f9fa4d7be2ce15a25a2b7e

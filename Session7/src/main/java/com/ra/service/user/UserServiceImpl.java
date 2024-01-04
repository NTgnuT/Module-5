<<<<<<< HEAD
package com.ra.service.user;

import com.ra.exception.CustomException;
import com.ra.model.dto.request.UserRequest;
import com.ra.model.dto.response.UserResponse;
import com.ra.model.entity.User;
import com.ra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public Page<UserResponse> findAll(Pageable pageable) {
        Page<User> userPage = userRepository.findAll(pageable);
        return userPage.map(user -> new UserResponse(user));
    }

    @Override
    public UserResponse saveOrUpdate(UserRequest userRequest) throws CustomException {
            // Check trùng
        if (userRepository.existsByUsername(userRequest.getUsername())) {
            throw new CustomException("username này đã tồng tại");
        }

        User user = User.builder()
                .username(userRequest.getUsername())
                .fullName(userRequest.getFullName())
                .password(userRequest.getPassword()).build();

        User UserNew = userRepository.save(user);

        return UserResponse.builder().id(UserNew.getId())
                .username(UserNew.getUsername())
                .fullName(UserNew.getFullName())
                .status(UserNew.isStatus()).build();
    }

    @Override
    public UserResponse findById(Long id) throws CustomException {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return UserResponse.builder()
                    .id(user.getId())
                    .username(user.getUsername())
                    .fullName(user.getFullName())
                    .status(user.isStatus()).build();
        }

        throw new CustomException ("Không tìm thấy!!!");

    }
}
=======
package com.ra.service.user;

import com.ra.exception.CustomException;
import com.ra.model.dto.request.UserRequest;
import com.ra.model.dto.response.UserResponse;
import com.ra.model.entity.User;
import com.ra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public Page<UserResponse> findAll(Pageable pageable) {
        Page<User> userPage = userRepository.findAll(pageable);
        return userPage.map(user -> new UserResponse(user));
    }

    @Override
    public UserResponse saveOrUpdate(UserRequest userRequest) throws CustomException {
            // Check trùng
        if (userRepository.existsByUsername(userRequest.getUsername())) {
            throw new CustomException("username này đã tồng tại");
        }

        User user = User.builder()
                .username(userRequest.getUsername())
                .fullName(userRequest.getFullName())
                .password(userRequest.getPassword()).build();

        User UserNew = userRepository.save(user);

        return UserResponse.builder().id(UserNew.getId())
                .username(UserNew.getUsername())
                .fullName(UserNew.getFullName())
                .status(UserNew.isStatus()).build();
    }

    @Override
    public UserResponse findById(Long id) throws CustomException {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return UserResponse.builder()
                    .id(user.getId())
                    .username(user.getUsername())
                    .fullName(user.getFullName())
                    .status(user.isStatus()).build();
        }

        throw new CustomException ("Không tìm thấy!!!");

    }
}
>>>>>>> 1c065e15f1a3b41e68f9fa4d7be2ce15a25a2b7e

package com.example.service;

import com.example.dto.request.UserRequest;
import com.example.dto.response.UserResponse;
import com.example.model.Role;
import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.sercurity.jwt.JWTProvider;
import com.example.sercurity.user_principle.UserPrinciple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationProvider authenticationProvider;
    @Autowired
    private JWTProvider jwtProvider;
    @Autowired
    private RoleService roleService;
    @Override
    public User register(User user) {
        // Mã hóa mật khẩu
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        // register của user thì coi là USER
        Set<Role> roles = new HashSet<>();
        if (user.getRoles() == null || user.getRoles().isEmpty()) {
            roles.add(roleService.findByRoleName("USER"));
        } else {
            // tạo tài khoản và phân quyền thì phải có quyền admin
            user.getRoles().forEach(role -> roles.add(roleService.findByRoleName(role.getName())));
        }
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setFullName(user.getFullName());
        newUser.setPassword(user.getPassword());
        newUser.setStatus(user.isStatus());
        newUser.setRoles(roles);

        return userRepository.save(newUser);
    }

    @Override
    public UserResponse login(UserRequest userRequest) {
        Authentication authentication;
        authentication = authenticationProvider
                .authenticate(new UsernamePasswordAuthenticationToken(userRequest.getUsername(), userRequest.getPassword()));
        UserPrinciple userPrinciple = (UserPrinciple) authentication.getPrincipal();

    return UserResponse.builder().token(jwtProvider.generateToken(userPrinciple))
            .username(userPrinciple.getUsername())
            .roles(userPrinciple.getAuthorities().stream()
                    .map(GrantedAuthority::getAuthority).collect(Collectors.toSet()))
            .build();
    }
}

<<<<<<< HEAD
package com.example.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserResponse {
    private String token;
    private String username;
    private Set<String> roles;
}
=======
package com.example.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserResponse {
    private String token;
    private String username;
    private Set<String> roles;
}
>>>>>>> c3303dff8b471fcbb73403eba86ea8d7be10afd1

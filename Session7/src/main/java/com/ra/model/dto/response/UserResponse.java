<<<<<<< HEAD
package com.ra.model.dto.response;

import com.ra.model.entity.User;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserResponse {
    private Long id;
    private String username;
    private String fullName;
    private boolean status;

    public UserResponse(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.fullName = user.getFullName();
        this.status = user.isStatus();
    }
}
=======
package com.ra.model.dto.response;

import com.ra.model.entity.User;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserResponse {
    private Long id;
    private String username;
    private String fullName;
    private boolean status;

    public UserResponse(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.fullName = user.getFullName();
        this.status = user.isStatus();
    }
}
>>>>>>> 1c065e15f1a3b41e68f9fa4d7be2ce15a25a2b7e

<<<<<<< HEAD
package com.ra.model.dto.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserRequest {
    @NotEmpty(message = "Không được rỗng!!!")
    private String username;
    private String fullName;
    @Size(min = 3, max = 15, message = "Mật khẩu tối thiểu 3 tối đa 15 ký tự!!!")
    private String password;
    @Column(columnDefinition = "boolean default true")
    private boolean status = true;
}
=======
package com.ra.model.dto.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserRequest {
    @NotEmpty(message = "Không được rỗng!!!")
    private String username;
    private String fullName;
    @Size(min = 3, max = 15, message = "Mật khẩu tối thiểu 3 tối đa 15 ký tự!!!")
    private String password;
    @Column(columnDefinition = "boolean default true")
    private boolean status = true;
}
>>>>>>> 1c065e15f1a3b41e68f9fa4d7be2ce15a25a2b7e

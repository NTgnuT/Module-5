<<<<<<< HEAD
package com.ra.model.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String username;
    private String fullName;
    private String password;
    @Column(columnDefinition = "boolean default true")
    private boolean status = true;
}
=======
package com.ra.model.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String username;
    private String fullName;
    private String password;
    @Column(columnDefinition = "boolean default true")
    private boolean status = true;
}
>>>>>>> 1c065e15f1a3b41e68f9fa4d7be2ce15a25a2b7e

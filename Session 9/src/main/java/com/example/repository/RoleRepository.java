<<<<<<< HEAD
package com.example.repository;

import com.example.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findRoleByName (String roleName);
}
=======
package com.example.repository;

import com.example.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findRoleByName (String roleName);
}
>>>>>>> c3303dff8b471fcbb73403eba86ea8d7be10afd1

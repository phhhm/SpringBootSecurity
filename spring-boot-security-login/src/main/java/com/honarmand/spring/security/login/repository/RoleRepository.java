package com.honarmand.spring.security.login.repository;

import java.util.Optional;

import com.honarmand.spring.security.login.models.ERole;
import com.honarmand.spring.security.login.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);


}

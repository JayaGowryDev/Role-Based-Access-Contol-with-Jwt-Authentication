package com.jayadev.AuthApplication.repository;

import com.jayadev.AuthApplication.model.ERole;
import com.jayadev.AuthApplication.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);
}

package com.example.ApiDoAn.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ApiDoAn.comom.ERole;
import com.example.ApiDoAn.entity.RoleEntity;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    Optional<RoleEntity> findByName(ERole name);
    Optional<RoleEntity> findByName(String  name);
}

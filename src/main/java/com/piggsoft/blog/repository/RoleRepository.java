package com.piggsoft.blog.repository;

import com.piggsoft.blog.po.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
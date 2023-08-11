package org.villalobos19javaguides.lms.repository;

import org.villalobos19javaguides.lms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

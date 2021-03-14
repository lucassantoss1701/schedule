package com.project.trainee.tc.repositories;

import com.project.trainee.tc.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}

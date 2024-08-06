package com.littleinn.storytelling.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.littleinn.storytelling.model.Users;

public interface UserRepo extends JpaRepository<Users, Long> {
    Optional<Users> findByEmail(String email);
    Users findByUid(Long uid);
}

package org.example.mapstructdifferentnames.repository;

import org.example.mapstructdifferentnames.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

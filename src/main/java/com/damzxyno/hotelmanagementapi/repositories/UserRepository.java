package com.damzxyno.hotelmanagementapi.repositories;

import com.damzxyno.hotelmanagementapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT U FROM User U WHERE U.username = :identifier or U.email = :identifier")
    Optional<User> findByUsernameOrEmail(String identifier);
}

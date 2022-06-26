package com.damzxyno.hotelmanagementapi.repositories;

import com.damzxyno.hotelmanagementapi.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
}

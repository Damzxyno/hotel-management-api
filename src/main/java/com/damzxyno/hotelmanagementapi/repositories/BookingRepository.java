package com.damzxyno.hotelmanagementapi.repositories;

import com.damzxyno.hotelmanagementapi.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}

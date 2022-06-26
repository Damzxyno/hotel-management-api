package com.damzxyno.hotelmanagementapi.repositories;

import com.damzxyno.hotelmanagementapi.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}

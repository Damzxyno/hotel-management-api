package com.damzxyno.hotelmanagementapi.models;

import com.damzxyno.hotelmanagementapi.enums.BookingStatus;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Room room;

    @ManyToOne
    @JoinColumn(name = "ordered_by", nullable = false)
    private User byUser;

    @ManyToOne
    @JoinColumn(name = "room_for", nullable = false)
    private User forUser;

    @CreationTimestamp
    @Column(nullable = false, name = "created_date_time")
    private LocalDateTime createdTime;

    @Enumerated(EnumType.STRING)
    private BookingStatus status;
}

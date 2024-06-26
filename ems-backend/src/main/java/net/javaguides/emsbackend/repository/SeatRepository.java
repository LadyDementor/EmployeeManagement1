package net.javaguides.emsbackend.repository;

import net.javaguides.emsbackend.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
     Optional<Seat> findBySeatNo(Long seatNo);
     void deleteBySeatNo(Long seatNo);

}

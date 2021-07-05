package com.doan.tma_spring_boot_test.repository;

import com.doan.tma_spring_boot_test.entity.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    List<Player> findByTeamId(Integer teamId);
    Optional<Player> findByIdAndTeamId(Integer teamId, Integer playerId);
}

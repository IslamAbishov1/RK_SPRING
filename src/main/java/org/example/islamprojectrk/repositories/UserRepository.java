package org.example.islamprojectrk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<org.example.islamprojectrk.models.UserEntity, Long> {
    List<org.example.islamprojectrk.models.UserEntity> findByTitleContainingIgnoreCase(String titlePart);
}

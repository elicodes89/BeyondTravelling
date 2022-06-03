package com.codeClan.example.BeyondTravelling.repositories;

import com.codeClan.example.BeyondTravelling.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}

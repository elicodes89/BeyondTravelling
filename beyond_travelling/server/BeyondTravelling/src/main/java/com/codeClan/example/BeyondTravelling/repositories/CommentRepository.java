package com.codeClan.example.BeyondTravelling.repositories;

import com.codeClan.example.BeyondTravelling.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}

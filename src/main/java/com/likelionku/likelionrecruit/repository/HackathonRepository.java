package com.likelionku.likelionrecruit.repository;

import com.likelionku.likelionrecruit.domain.Hackathon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HackathonRepository extends JpaRepository<Hackathon, Long> {
}

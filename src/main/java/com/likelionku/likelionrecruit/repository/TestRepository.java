package com.likelionku.likelionrecruit.repository;

import com.likelionku.likelionrecruit.domain.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity, Long> {
}

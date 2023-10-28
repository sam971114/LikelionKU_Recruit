package com.likelionku.likelionrecruit;

import com.likelionku.likelionrecruit.domain.TestEntity;
import com.likelionku.likelionrecruit.repository.TestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class LikelionRecruitApplicationTests {

	@Autowired
	TestRepository tr;

	@Test
	void contextLoads() {
	}

	@Test
	void DBConnectionTest() {
		TestEntity te = new TestEntity();
		te.setTitle("test TITLE");

		TestEntity savedEntity = tr.save(te);

		TestEntity foundEntity = tr.findById(savedEntity.getId()).orElse(null);

		assertNotNull(foundEntity);
		assertEquals(savedEntity.getId(), foundEntity.getId());
		assertEquals(savedEntity.getTitle(), foundEntity.getTitle());
	}

}

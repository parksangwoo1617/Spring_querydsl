package com.study.querydsl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.study.querydsl.entity.Hello;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootTest
class QuerydslApplicationTests {

	@PersistenceContext
	EntityManager em;

	@Test
	void contextLoads() {
	}

}

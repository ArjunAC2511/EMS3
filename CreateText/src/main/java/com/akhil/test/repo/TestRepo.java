package com.akhil.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhil.test.entity.TestEntity;
@Repository
public interface TestRepo extends JpaRepository<TestEntity, Long>
{

	TestEntity deleteTestByUserId(Integer userId);

	TestEntity getByUserId(Integer userId);

}

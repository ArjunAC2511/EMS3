package com.akhil.test.service;

import java.util.List;

import com.akhil.test.entity.TestEntity;

public interface TestService 
{
	TestEntity createTest(TestEntity testEntity);
	
	TestEntity updateTest(TestEntity testEntity);
	
	List<TestEntity> getAllTest();
	
	TestEntity deleteTestByUserId(Integer userId);
	
	TestEntity getByUserId(Integer userId);
}

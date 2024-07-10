package com.akhil.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhil.test.entity.TestEntity;
import com.akhil.test.repo.TestRepo;

@Service
public class TestServiceImp  implements TestService
{
	@Autowired
	private TestRepo testRepo;

	@Override
	public TestEntity createTest(TestEntity testEntity) 
	{
		return testRepo.save(testEntity);
	}

	@Override
	public TestEntity updateTest(TestEntity testEntity) 
	{
		return testRepo.save(testEntity);
	}

	@Override
	public List<TestEntity> getAllTest() 
	{
		return testRepo.findAll();
	}

	@Override
	public TestEntity deleteTestByUserId(Integer userId) 
	{
		return testRepo.deleteTestByUserId(userId);
	}

	@Override
	public TestEntity getByUserId(Integer userId) 
	{
		return testRepo.getByUserId(userId);
	}

}

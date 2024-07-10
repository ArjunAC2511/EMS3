package com.akhil.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akhil.test.entity.TestEntity;
import com.akhil.test.service.TestService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/test")
public class TestController 
{
	@Autowired
	private TestService testService;
	
	@PostMapping("/create")
	public TestEntity createTest(@RequestBody TestEntity testEntity)
	{
		return testService.createTest(testEntity);
	}
	
	@PutMapping("/update")
	public TestEntity updateTest(@RequestBody TestEntity testEntity)
	{
		return testService.updateTest(testEntity);
	}
	
	@GetMapping("/getAll")
	public List<TestEntity> getAllTest()
	{
		return testService.getAllTest();
	}
	
	@DeleteMapping("/delete")
	public TestEntity deleteTestByUserId(@PathVariable Integer userId)
	{
		return testService.deleteTestByUserId(userId);
	}
	
	@GetMapping("/user/{userId}")
	public TestEntity getByUserId(@PathVariable Integer userId)
	{
		return testService.getByUserId(userId);
	}
}

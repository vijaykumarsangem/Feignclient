package com.example.Interface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url="http://localhost:8081/get")
public interface FeignInter 
{
	@GetMapping("/name")
	public String getName();
}

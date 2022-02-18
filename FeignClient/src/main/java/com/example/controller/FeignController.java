package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Interface.FeignInter;
@RestController
@RequestMapping("/get")
public class FeignController {
	@Autowired
	FeignInter feignInter;

	@GetMapping("/name")
	private String getNames() {
		return feignInter.getName();

	}
}

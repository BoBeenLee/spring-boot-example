package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by BoBinLee on 2015. 10. 25..
 */

@Slf4j
@RequestMapping("thread")
@RestController
public class ThreadLocalController {
	public static final String TAG = "ThreadLocalController";
	public static String threadMsg = "";

	@RequestMapping("/local1")
	public String local1(){
		log.info(TAG + " : " + threadMsg);
		threadMsg = "local1";
		return "local1";
	}

	@RequestMapping("/local2")
	public String local2(){
		return "local2";
	}
}

package com.example;

import com.example.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@Slf4j
@RunWith(MockitoJUnitRunner.class)
public class DemoServiceTests {

	@Mock
	private MemberRepository memberRepository;

	@Test
	public void contextLoads() {


		//		memberRepository.save()

	}

}

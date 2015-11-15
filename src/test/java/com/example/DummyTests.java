package com.example;

import com.example.dto.PersonDto;
import com.example.dummy.DummyUtils;
import org.junit.Test;

/**
 * Created by BoBinLee on 2015. 10. 27..
 */
public class DummyTests {

	@Test
	public void test(){
		PersonDto personDto = new PersonDto();
		DummyUtils.setAutoMatch(personDto);

		System.out.println(personDto.getMobile());
	}


}

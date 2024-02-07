package com.hind.org.design.patterns.simpleExample;

import com.hind.org.design.patterns.simpleExample.SimpleClass;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SimpleClassTest {

	@Test
	public void testAddtion() {

    	SimpleClass simpleClass= new SimpleClass();
        
		int additionResult = simpleClass.add(2,5);
		
	    assertEquals(7, additionResult);
		
		
	}


	
}


 
	
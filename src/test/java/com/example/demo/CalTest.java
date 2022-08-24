package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.sonata.two.Calculator;

public class CalTest {
	Calculator c1 = new Calculator();
	
	@Test
	public void addTest() {
		Assertions.assertEquals(4, c1.add(2, 2));
	}

	@Test
	public void divTest() {
		//int x = c1.div(1, 1);
		assertThrows(ArithmeticException.class,()->c1.div(1,0),"error");
	}
	
	@Test
	public void divTest1() {
		//int x = c1.div(1, 1);
		assertThrows(ArithmeticException.class,()->c1.div(1,1),"error");
	}
	
}
	/*
	CurrentAccount c1 = new CurrentAccount();
	
	@Test
	public void mulTest() {
		Assertions.assertEquals(4, c1.mul(2, 2));
	}
	
	
	@Test
	public void depositTest() {
		c1.balance=100;
		Assertions.assertEquals(1122, c1.deposit(1022));
	}
	
	@Test
	public void NdepositTest() {
		Assertions.assertEquals(1022, c1.deposit(1022));
	}
	
	@Test
	public void PwithDrawTest() {
		Assertions.assertEquals(-1022, c1.withDraw(1022));
	}
	
	@Test
	public void withDrawTest() {
		Assertions.assertEquals(-1022, c1.withDraw(1022));
	}
	
}
*/

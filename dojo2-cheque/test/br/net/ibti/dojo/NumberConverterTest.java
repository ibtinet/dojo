package br.net.ibti.dojo;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Test;

public class NumberConverterTest {

	@Test
	public void test1() {
		assertThat(NumberConverter.parseRoman(1), equalTo("I"));
	}
	
	@Test
	public void test2() {
		assertThat(NumberConverter.parseRoman(2), equalTo("II"));
	}
	
	@Test
	public void test3() {
		assertThat(NumberConverter.parseRoman(3), equalTo("III"));
	}
	@Test
	public void test4() {
		assertThat(NumberConverter.parseRoman(4), equalTo("IV"));
	}
	@Test
	public void test5() {
		assertThat(NumberConverter.parseRoman(5), equalTo("V"));
	}
	@Test
	public void test6() {
		assertThat(NumberConverter.parseRoman(6), equalTo("VI"));
	}
	@Test
	public void test7() {
		assertThat(NumberConverter.parseRoman(7), equalTo("VII"));
	}
	@Test
	public void test8() {
		assertThat(NumberConverter.parseRoman(8), equalTo("VIII"));
	}
	@Test
	public void test9() {
		assertThat(NumberConverter.parseRoman(9), equalTo("IX"));
	}
	@Test
	public void test1000() {
		assertThat(NumberConverter.parseRoman(1000), equalTo("M"));
	}
}

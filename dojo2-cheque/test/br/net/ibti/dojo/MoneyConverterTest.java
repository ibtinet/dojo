package br.net.ibti.dojo;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MoneyConverterTest {

	@Test
	public void test1Real(){
		assertThat(MoneyConverter.numberToReal(1.0), equalTo("um real"));
	}
	
	@Test
	public void test2Reais(){
		assertThat(MoneyConverter.numberToReal(2.0), equalTo("dois reais"));
	}
	
	@Test
	public void test3Reais(){
		assertThat(MoneyConverter.numberToReal(3.0), equalTo("tres reais"));
	}
	
	@Test
	public void test8Reais(){
		assertThat(MoneyConverter.numberToReal(8.0), equalTo("oito reais"));
	}
	
	@Test
	public void test23Reais(){
		assertThat(MoneyConverter.numberToReal(23.0), equalTo("vinte e tres reais"));
	}
	@Test
	public void test48Reais(){
		assertThat(MoneyConverter.numberToReal(48.0), equalTo("quarenta e oito reais"));
	}
	@Test
	public void test99Reais(){
		assertThat(MoneyConverter.numberToReal(99.0), equalTo("noventa e nove reais"));
	}
	@Test
	public void test90Reais(){
		assertThat(MoneyConverter.numberToReal(90.0), equalTo("noventa reais"));
	}
	@Test
	public void test15Reais(){
		assertThat(MoneyConverter.numberToReal(15.0), equalTo("quinze reais"));
	}
	@Test
	public void test10Reais(){
		assertThat(MoneyConverter.numberToReal(10.0), equalTo("dez reais"));
	}
}

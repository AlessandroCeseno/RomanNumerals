package it.alex.tdd;

import static org.junit.Assert.assertEquals;
import it.alex.Roman;

import org.junit.Test;


public class RomanTest {
	
	private void check(String expectedString, int decimal){
		assertEquals(expectedString, new Roman(decimal).toString());
	}
	
	@Test
	public void zeroIsEmpty() throws Exception{
		check("", 0);
	}
	
	@Test
	public void oneIsI() throws Exception{
		check("I", 1);
	}
	
	@Test
	public void twoIsII() throws Exception{
		check("II", 2);
	}

	@Test
	public void threeIsIII() throws Exception{
		check("III", 3);
	}
	
	@Test
	public void fourIsIV() throws Exception{
		check("IV", 4);
	}
	
	@Test
	public void fiveIsV() throws Exception{
		check("V", 5);
	}
	
	@Test
	public void fiveIsVI() throws Exception{
		check("VI", 6);
	}
	
	@Test
	public void fiveIsVII() throws Exception{
		check("VII", 7);
	}
	
	@Test
	public void fiveIsVIII() throws Exception{
		check("VIII", 8);
	}
	
	@Test
	public void nineIsIX() throws Exception{
		check("IX", 9);
	}
	
	@Test
	public void tenIsX() throws Exception{
		check("X", 10);
	}
	
	@Test
	public void elevenIsXI() throws Exception{
		check("XI", 11);
	}
	
	@Test
	public void twelveIsXII() throws Exception{
		check("XII", 12);
	}
	
	@Test
	public void thirteenIsX() throws Exception{
		check("XIII", 13);
	}
	
	@Test
	public void fourteenIsX() throws Exception{
		check("XIV", 14);
	}
	
	@Test
	public void fifteenIsXV() throws Exception{
		check("XV", 15);
	}
	
	@Test
	public void sixteenIsXVI() throws Exception{
		check("XVI", 16);
	}
	
	@Test
	public void nineteenIsXIX() throws Exception{
		check("XIX", 19);
	}
	
	@Test
	public void twentyIsXX() throws Exception{
		check("XX", 20);
	}
	
	@Test
	public void twentythreeIsXXIII() throws Exception{
		check("XXIII", 23);
	}
	
	@Test
	public void twentysixIsXXVI() throws Exception{
		check("XXVI", 26);
	}
	
	@Test
	public void fortyIsXL() throws Exception{
		check("XL", 40);
	}
	
	@Test
	public void fortyfourIsXLIV() throws Exception{
		check("XLIV", 44);
	}
	
	@Test
	public void fiftyIsL() throws Exception{
		check("L", 50);
	}
	
	@Test
	public void ninetyIsXC() throws Exception{
		check("XC", 90);
	}
	
	@Test
	public void oneHundredIsC() throws Exception{
		check("C", 100);
	}
	
	@Test
	public void fourHundredIsCD() throws Exception{
		check("CD", 400);
	}
	
	@Test
	public void fiveHundredIsD() throws Exception{
		check("D", 500);
	}
	
	@Test
	public void nineHundredIsCM() throws Exception{
		check("CM", 900);
	}
	
	@Test
	public void oneThousandIsM() throws Exception{
		check("M", 1000);
	}
	
	@Test
	public void sixtyNineIsLXIX() throws Exception{
		check("LXIX", 69);
	}
	
	@Test
	public void oneHundreadFiftyFiveIsLXIX() throws Exception{
		check("CLV", 155);
	}
	
	@Test
	public void twoThousandFourHundredFourteenIsM() throws Exception{
		check("MMCDXIV", 2414);
	}
	
}


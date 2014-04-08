/**
 * 
 */
package kreutzer.test;

import static org.junit.Assert.*;
import kreutzer.chiper.MonoAlphabeticCipher;
import kreutzer.chiper.SubstitutionCipher;

import org.junit.Test;

/**
 * @author sarahkreutzer
 *
 */
public class Testklasse {

	/**
	 * @param args
	 */
	@Test
	public void test1() {
		SubstitutionCipher subchipher = new SubstitutionCipher("DEFGHIJKLMNOPQRSTUVWXYZABCDEFG");
		String rueckgabe ="";
		rueckgabe = subchipher.encrypt("Hallo S");
		assertTrue(rueckgabe.equals("kdoor v"));//ist im prinzip eine if anweisung ,nur testet es richtig.
	}

	@Test
	public void test2() {
		SubstitutionCipher subchipher = new SubstitutionCipher("DEFGHIJKLMNOPQRSTUVWXYZABCDEFG");
		String rueckgabe ="";
		rueckgabe = subchipher.decrypt("kdoor v");
		assertTrue(rueckgabe.equals("hallo s"));
	}
		
	
	@Test
	public void test3(){
		SubstitutionCipher sb = new SubstitutionCipher("DEFGHIJKLMNOPQRSTUVWXYZABCDEFG");
		assertTrue(sb.getSecretAlphabet().equals("defghijklmnopqrstuvwxyzabcdefg"));
		}
		
	
	@Test
	public void test4(){
		SubstitutionCipher sb = new SubstitutionCipher("DEFGHIJKLMNOPQRSTUVWXYZABCDEFG");
		sb.setSecretAlphabet("DEFGHIJKLMNOPQRSTUVWXYZABCDEFG");
		assertTrue(sb.getSecretAlphabet().equals("defghijklmnopqrstuvwxyzabcdefg"));
	}
		


}



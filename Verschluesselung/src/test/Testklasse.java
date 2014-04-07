/**
 * 
 */
package test;

import kreutzer.SubstitutionCipher;

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
		if(!rueckgabe.equals("kdoor v")){
			System.out.print(rueckgabe);
			throw new RuntimeException("Test1 nicht funktionieren");
		}
	}

	@Test
	public void test2() {
		SubstitutionCipher subchipher = new SubstitutionCipher("DEFGHIJKLMNOPQRSTUVWXYZABCDEFG");
		String rueckgabe ="";
		rueckgabe = subchipher.decrypt("kdoor v");
		if(!rueckgabe.equals("hallo s")){
			System.out.print(rueckgabe);
			throw new RuntimeException("Test1 nicht funktionieren");
		}
	}
}

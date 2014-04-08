/**
 * 
 */
package kreutzer.chiper;

/**
 * @author sarahkreutzer
 *
 */
public class SubstitutionCipher extends MonoAlphabeticCipher{
	public SubstitutionCipher(String secretAlphabet){
		setSecretAlphabet(secretAlphabet);
	}
	
	public void setSecretAlphabet(String secretAlphabet){
		super.setSecretAlphabet(secretAlphabet);//super, da ich nicht die eigene Methode nochmal aufrufen will.l.
	}

}

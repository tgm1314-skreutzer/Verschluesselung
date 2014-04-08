/**
 * 
 */
package kreutzer.chiper;

/**
 * @author sarahkreutzer
 *
 */
public class MonoAlphabeticCipher implements Cipher {
	private String secretAlphabet;
	
	public MonoAlphabeticCipher(){
		secretAlphabet = "abcdefghijklmnopqrstuvwxyzŠšŸ§";
	}
	
	public String getSecretAlphabet(){
		return secretAlphabet;
	}
	
	protected void setSecretAlphabet(String secretAlphabet) throws IllegalArgumentException{
		secretAlphabet = secretAlphabet.toLowerCase();
		if(secretAlphabet.length() != 30){
			throw new IllegalArgumentException("Fehler");
		}
		this.secretAlphabet = secretAlphabet;
	}
	
	/**
	*Verschluesselt den Text
	*/
	@Override
	public String encrypt(String text){
		String alphabet = "abcdefghijklmnopqrstuvwxyzŠšŸ§";
		text = text.toLowerCase();
		String verschluesselung = "";
		for(int i = 0;i< text.length();i++){
			String textbuch = text.charAt(i) + "";
			for(int j = 0;j<alphabet.length();j++){
				String alphbuch = alphabet.charAt(j) + "";
				if(textbuch.equals(alphbuch)){
					verschluesselung += secretAlphabet.charAt(j); 
					j=alphabet.length()+1;
				}else if(j>=alphabet.length()-1){
					verschluesselung += text.charAt(i);	
				}
			}
			
		}
		return verschluesselung;
	}
	
	/**
	*Entschluesselt den Text
	*/
	@Override
	public String decrypt(String text) {
		String alphabet = "abcdefghijklmnopqrstuvwxyzŠšŸ§";
		text = text.toLowerCase();
		String entschluesselung = "";
		for(int i = 0;i< text.length();i++){
			String textbuch = text.charAt(i) + "";
			for(int j = 0;j<alphabet.length();j++){
				String secbuch = secretAlphabet.charAt(j) + "";
				if(textbuch.equals(secbuch)){
					entschluesselung += alphabet.charAt(j); 
					j=secretAlphabet.length()+1;
				}else if(j>=secretAlphabet.length()-1){
					entschluesselung += text.charAt(i);	
				}
			}
			
		}
		return entschluesselung;
	}

}
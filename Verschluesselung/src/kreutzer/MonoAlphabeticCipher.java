/**
 * 
 */
package kreutzer;

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
	
	protected void setSecretAlphabet(){
		this.secretAlphabet = secretAlphabet;
	}
	
	/**
	*Verschluesselt den Text
	*/
	@Override
	public String encrypt(String text){
		String verschluesselung = "";
		for(int i = 0;i<= text.length();i++){
			String textbuch = text.charAt(i) + "";
			for(int j = 0;j<=secretAlphabet.length();j++){
				String alphbuch = secretAlphabet.charAt(j) + "";
				if(textbuch.equals(alphbuch)){
					verschluesselung += alphbuch; 
					j=secretAlphabet.length()+1;
				}else if(j>=secretAlphabet.length()){
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
		return text;
	}

}
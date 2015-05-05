/**
 * 
 */
package org.cuatrovientos.hoygan;

import java.util.Random;

/**
 * Translates correct,formal text to HOYGAN
 * @author Pello Altadill
 *
 */
public class HoyganConversor {
	
	public HoyganConversor() {
	}

	/**
	 * converts text
	 * @param text2Convert
	 * @return
	 */
	public String convert (String text2Convert) {
		String result = text2Convert;
		
		result = toUpper(result);
		result = replaceChars(result);
		result = alwaysAddH(result);
		result = removeDots(result);
		result = addHoyganPrefix(result);
		result = addExclamation(result);
		result = addRandomThanks(result);
		
		return  result;
	}

	/**
	 * adds some random thanks
	 * @param originalText
	 * @return
	 */
	private String addRandomThanks(String originalText) {
		String [] randomThank = {"DE ANTEBRASSO","DE ANTEPECHO","DE ANTEQUERA"};
		Random random = new Random();
		int randomIndex = random.nextInt(randomThank.length);
		String result = originalText;
		
		result = result + "\nGRASIAS ";
		result = result + randomThank[randomIndex];
		return result;
	}

	/**
	 * removes dots from phrase
	 * @param originalText
	 * @return
	 */
	private String removeDots(String originalText) {
		String result = "";

		result = originalText.replace(".",",");
		result = result.replace(","," ");
		result = result.replace(";",",");
		
		return result;
	}

	/**
	 * adds h in every word starting with a vowel
	 * @param result
	 * @return
	 */
	private String alwaysAddH(String originalText) {
		String result = "";

		result = originalText.replace(" A"," HA");
		result = result.replace(" E"," HE");
		result = result.replace(" I"," HI");
		result = result.replace(" O"," HO");
		result = result.replace(" U"," HU");
		result = result.replace(" Y"," HY");
		
		return result;
	}

	/**
	 * adds exclamation signs at the end
	 * @param originalText
	 * @return
	 */
	private String addExclamation(String originalText) {
		return originalText + "!!!!!";
	}

	/**
	 * char replacement
	 * @param originalText
	 * @return
	 */
	private String replaceChars(String originalText) {
		String [] original =    {"CI","CE","CA","CO","CU","H","MB","MP","J","G","B","V","*","QU","Z","Y","W"};
		String [] replacement = {"SI","SE","KA","KO","KU","" ,"NB","NP","H","J","*","B","V","K","S","LL","GÜ"};
		String replaced = originalText;
		
		for (int i = 0; i < replacement.length;i++) {
			replaced = replaced.replace(original[i],replacement[i]);
		}		
		return replaced;
	}

	/**
	 * adds HOYGAN prefix to text
	 * @param text2Convert
	 * @return
	 */
	private String addHoyganPrefix(String text2Convert) {
		return "HOYGAN " + text2Convert;
	}

	/**
	 * change text to uppercase
	 * @param text2Convert
	 * @return
	 */
	private String toUpper(String text2Convert) {
		return text2Convert.toUpperCase();
	}

	
	
}

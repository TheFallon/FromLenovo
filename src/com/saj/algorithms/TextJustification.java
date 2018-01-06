package com.saj.algorithms;

import java.util.Arrays;

/**
 * Given an array of words and a length l, format the text such that 
 * each line has exactly l characters and is fully justified on both 
 * the left and the right. Words should be packed in a greedy approach; 
 * that is, pack as many words as possible in each line. Add extra spaces 
 * when necessary so that each line has exactly l characters.
 *
 * Extra spaces between words should be distributed as evenly as possible.
 * If the number of spaces on a line does not divide evenly between words, 
 * the empty slots on the left will be assigned more spaces than the slots 
 * on the right. For the last line of text and lines with one word only, 
 * the words should be left justified with no extra space inserted between them.
 *
 * Example:
 *
 * For words = ["This", "is", "an", "example", "of", "text", "justification."]
 * and l = 16, the output should be
 *
 * textJustification(words, l) = ["This    is    an",
 *                                "example  of text",
 *                                "justification.  "]
 * @author Lenovo
 *
 */
public class TextJustification {
	public static void main(String[] args) {
		String[] words = {"This", "is", "an", "example", "of", "text", "justification"};
		int l = 16;
		
		String[] justifiedWords = textJustification(words, l);
		
		for(int i = 0; i < justifiedWords.length; i++) {
			System.out.println(justifiedWords[i]);
		}
		
	}

	public static String[] textJustification(String[] words, int l) {
		float index = 0;
		for(int i = 0; i < words.length; i++) {
			index += words[i].length();
		}
		index = index / l;
		String[] justifiedWords = new String[(int) Math.ceil(index)];
		
		for(int i = 0, k = 0; k < words.length; i++){
			StringBuilder sb = new StringBuilder(l);
			for(int j = words[k].length() + 1; j < l; j++) {
				j += words[k].length();
				sb.append(words[k] + " ");
				k++;
				System.out.println(j);
			}
			justifiedWords[i] = sb.toString();
			
		}
		 
		 return justifiedWords;
	}
}

package day3;

import java.io.IOException;

import javax.activation.MailcapCommandMap;
import javax.swing.JOptionPane;

import sun.applet.Main;

public class StephenHawking {

	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {
	
	
	// 2. ask the user for a sentence
	
	// 3. call the speak method below and send it the sentence
	
	// 4. repeat steps 2 and 3 a lot of times
	for (int i = 0; i < 10; i++) {
	
		String answer = JOptionPane.showInputDialog("Tell me what you want to say.");
		speak(answer);
	} {
		
	}
	}
	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

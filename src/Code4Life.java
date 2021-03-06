
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args) {

		String heep = JOptionPane.showInputDialog("How many hours did you spend coding this week?");
		int quick = Integer.parseInt(heep);
		//
		// Ask the user how many hours they spent coding this week.
		if (quick < 2) {
			JOptionPane.showMessageDialog(null, "Stop watching youtube and code instead!!");
		}
		// 1. If it's 3 or more, tell them they're a Code Ninja.
		if (quick >= 3) {
			JOptionPane.showMessageDialog(null, "You're a code ninja!!");

		}
		// 2. If it's less than 2, tell them to stop watching YouTube and write code
		// instead.

		// 3. If it's more than 5, play the Batman theme song.
		if (quick > 5) {
			playBatmanTheme();
		}
	}

	private static void playBatmanTheme() {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Code4Life.class.getResource("batman.wav")));
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
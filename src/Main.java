// package com.chessgame;

import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

import com.chessgame.Frame.Frame;

public class Main {
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Frame();
			}
		});
	}

	void setVisible(boolean b) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}

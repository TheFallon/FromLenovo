package com.saj.fontTestingApp;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FontPropertiesFrame extends SampleTextFrame {

	public static void main(String[] args) {
		FontPropertiesFrame fpf = new FontPropertiesFrame();
		fpf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fpf.setVisible(true);
	}
	
	public FontPropertiesFrame() {
		super();
		FontPropertiesPanel fontPanel = (FontPropertiesPanel)propertiesPanel;
		displayArea.setFont(fontPanel.getSelectedFont());
		fontPanel.setFontListener(this);
	}
	
	protected void createComponents() {
		propertiesPanel = new FontPropertiesPanel();
		super.createComponents();
	}
}

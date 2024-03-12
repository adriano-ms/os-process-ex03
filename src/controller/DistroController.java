package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class DistroController {
	
	public DistroController() {
		super();
	}
	
	private String os() {
		return System.getProperty("os.name");
	}
	
	public void showDistro() throws IOException {
		boolean isLinux = os().contains("Linux");
		String output;
		if(isLinux) {
			output = execCommand("cat /etc/os-release").readLine().replace("PRETTY_NAME=\"", "").replace("\"", "");
		} else {
			output = "This system is not a Linux OS";
		}
		
		JOptionPane.showMessageDialog(null, output, "Linux Distro", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private BufferedReader execCommand(String command) throws IOException {
		return new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(command).getInputStream()));
	}

}

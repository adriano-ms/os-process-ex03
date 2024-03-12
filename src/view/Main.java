package view;

import java.io.IOException;

import controller.DistroController;

public class Main {

	public static void main(String[] args) throws IOException {
		
		DistroController distroController = new DistroController();

		distroController.showDistro();
	}

}

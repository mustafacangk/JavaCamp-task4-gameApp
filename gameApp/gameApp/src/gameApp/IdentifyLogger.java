package gameApp;

public class IdentifyLogger implements Logger {
	
	public void log(String message) {
		System.out.println(message + " Tc Kimlik Numarasi Dogrulandi..." );
	}

}
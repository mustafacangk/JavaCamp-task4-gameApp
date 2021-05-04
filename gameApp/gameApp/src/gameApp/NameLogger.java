package gameApp;

public class NameLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println(message  +  "  isim dogrulandi");
		
	}

}
package gameApp;



public class PlayerManager {
	
	Logger[] loggers;
    public PlayerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	

	public void permission(Logger[] loggers,String message) {
    	
    	Utils.RunLoggers(loggers, message);
    	
    }
	
	public void signUp(String message) {
		
		System.out.println("Giris Islemi Basarili...");
		System.out.println("Hosgeldiniz.. " + message);
		
		
	}
	
	public void updateInformation(String message) {
		System.out.println("Bilgileriniz Guncellendi.. " + message);
		
	}
	 
	public void deleteAccount(String message) {
		System.out.println("Hesabiniz Silindi ... " + message);
		
	}



	
    
    
}
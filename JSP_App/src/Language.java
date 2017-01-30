
public class Language {

	public String translate(String lang) {
		String result = "";
		switch(lang){
			case "de": result = "Hallo, freund!"; break;
			case "ua": result = "Привіт, друже!"; break;
			case "it": result = "Ciao, amico!"; break;
			case "sp": result = "Hola, amigo!"; break;
			case "sw": result = "Hej, vän!"; break;
			case "en": default: result = "Hello, friend!";
		}
		return result;
	}
	
}

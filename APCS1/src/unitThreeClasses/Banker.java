package unitThreeClasses;

public class Banker {

	public String name;
	private String read;

	public Banker(String name) {
		this.name = name;
	}

	public BankAccount[] readFile() {
		return BankAccountBanker.read(name);
	}
	
	public String greeting() {
		return "Hello! " + name;
	}
	


}

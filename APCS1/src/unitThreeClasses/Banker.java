package unitThreeClasses;

public class Banker {

	private String name, read;

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

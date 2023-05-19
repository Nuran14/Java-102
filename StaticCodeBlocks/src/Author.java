
public class Author {
	String name;
	String surname;

	public Author(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String showInfo() {
		return (name + " " + surname);
	}

}

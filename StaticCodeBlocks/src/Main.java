
public class Main {

	public static void main(String[] args) {
		AuthorSystem a = new AuthorSystem();

		Author[] authors = a.getAuthors();

		for (Author x : authors) {
			System.out.println(x.showInfo());
		}

	}

}

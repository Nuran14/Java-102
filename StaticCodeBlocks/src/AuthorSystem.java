
public class AuthorSystem {
	private static Author[] authors;

	static {
		authors = new Author[5];
		authors[0] = new Author("Reşat Nuri", "Güntekin");
		authors[1] = new Author("Necip Fazıl", "Kısakürek");
		authors[2] = new Author("Yakup Kadri", "Karaosmanoğlu");
		authors[3] = new Author("Halit Ziya", "Uşaklıgil");
		authors[4] = new Author("Yahya Kemal", "Beyatlı");
	}

	public static Author[] getAuthors() {
		return AuthorSystem.authors;
	}

}
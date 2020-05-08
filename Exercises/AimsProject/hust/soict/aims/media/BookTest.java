package hust.soict.aims.media;

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("Love");
		book.setCategory("Romance");
		book.setCost(120);
		book.addAuthor("Minh");
		book.addAuthor("Ha");
		String content = "Sap sinh nhat cau roi. Tuan sau di an khong?";
		book.processContent(content);
		book.toString();
	}
}

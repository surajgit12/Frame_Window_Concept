package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class RemoveReadReplaceAdd {

	public static void main(String[] args) {

		ArrayList<Book> b1 = new ArrayList<Book>();
		b1.add(new Book(111, "java", "john"));
		b1.add(new Book(222, "selenium", "cena"));
		b1.add(new Book(333, "cpp", "rock"));

		// Remove the 222 object

		ListIterator<Book> itr = b1.listIterator();
		itr.add(new Book(888, "html", "lusa")); // add

		while (itr.hasNext()) {

			Book b = itr.next();

			if (b.bid == 333)
				itr.remove(); // remove

			if (b.bid == 222)
				itr.set(new Book(555, "kk", "bbb")); // replace

		}
		for (Book bb : b1) {

			System.out.println(bb.bid + " " + bb.bname + " " + bb.bauthor);
		}
	}

}

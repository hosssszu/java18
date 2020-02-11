package homework02;

/**
 * Create a small application that mimics a library catalog.
 * It needs to be able to add books, delete books and list books.
 * Books are of two kinds: novels and art albums.
 * They both have names and number of pages.
 * Novels have type (like mystery, sf, etc.) while albums have paper quality.
 *
 * @author Loránd
 */

public class MainLibrary {

    public static void main(String[] args) {

        //create an object for the Novel class
        Novel n1 = new Novel();
        n1.setName("X");
        n1.setPages(184);
        n1.setType("mystery");

        //create an object for the Novel class
        Novel n2 = new Novel();
        n2.setName("Y");
        n2.setPages(204);
        n2.setType("sf");

        //create an object for the Art class
        Art a1 = new Art();
        a1.setName("Z");
        a1.setPages(326);
        a1.setPaperQuality("bun");

        //create an object for the Art class
        Art a2 = new Art();
        a2.setName("W");
        a2.setPages(225);
        a2.setPaperQuality("foarte bun");

        //create an object for the Library class
        Library library = new Library("librarie");

        Book[] books = new Book[1];

        //Calling the add method from the Library class
        books = library.add(n1, books);
        books = library.add(n2, books);
        books = library.add(a1, books);
        books = library.add(a2, books);

        //Calling the list method from the Library class
        library.list(books);

        //Calling the delete method from the Library class
        int removeIndex = 3;
        library.delete(books, removeIndex);
        System.out.println("\nSe sterge elementul cu indexul: " + removeIndex + ".\n");

        //Calling the list method from the Library class
        library.list(books);

    }
}
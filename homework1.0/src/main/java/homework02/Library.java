package homework02;

import java.util.Arrays;

public class Library {

    private Book[] books;

    //constructor
    public Library(String numeLibrarie) {
        Book[] books = new Book[1];
    }

    // this method is to add books in the array
    public Book[] add(Book booksToAdd, Book[] arrayToAddBooks) {
        Book[] newArray = Arrays.copyOf(arrayToAddBooks, arrayToAddBooks.length + 1);
        newArray[arrayToAddBooks.length - 1] = booksToAdd;
        return newArray;
    }

    // this method is to delete books in the array
    public void delete(Book[] library, int removeIndex) {
        for (int i = removeIndex; i < library.length - 1; i++) {
            library[i] = library[i + 1];
        }
        Book[] newArray = Arrays.copyOf(library, library.length - 1);
    }

    // this method is to list books in the array
    public void list(Book[] lib) {
        int i = 1;
        for (Book books : lib) {

            if (books != null) {

                System.out.print(i + ". Numele cartii este " + books.getName() + " avand un numar de pagini de " +
                        books.getPages() + ". ");
            }
            i++;
            if (books instanceof Novel) {
                ((Novel) books).types();
            }

            if (books instanceof Art) {
                ((Art) books).qualitys();
            }
        }
    }
}

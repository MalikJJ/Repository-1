package _8_2_try_catch;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(1, "Abay zholy", "Mukhtar Auezov");
        Book book2 = new Book(2, "Abay zholy second volume", "Mukhtar Auezov");
        Book book3 = new Book(3, "Abay zholy third volume", "Mukhtar Auezov");
        Book book4 = null;
        Book book5 = new Book(5, "Abay zholy fourth volume", "Mukhtar Auezov");
        Book book6 = new Book(6, "Abay zholy fifth volume", "Mukhtar Auezov");
        Book book7 = new Book(7, "Abay zholy sixth volume", "Mukhtar Auezov");

        Book[] listOfBooks = {book1, book2, book3, book4, book5, book6, book7};

        Library library1 = new Library("National library", "Almaty");

        for (int i = 0; i < listOfBooks.length; i++) {
            library1.addBook(listOfBooks[i]);
        }

        System.out.println();
        library1.printBooks();
    }
}

//==============================================================


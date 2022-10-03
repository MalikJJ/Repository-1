package _8_2_try_catch;

public class Library {
    private String name;
    private String city;
    private Book books[] = new Book[5];
    private int index = 0;

    public Library() {
    }
    public Library(String name, String city) {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addBook(Book book) {
        try {
            books[index] = book;
            System.out.println("Book added");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The library is full");
        }
        index++;
    }

    public void printBooks() {
        for (int i = 0; i < books.length; i++) {
            try {
                System.out.println((i + 1) + ". " + books[i].getData());
            } catch (NullPointerException e) {
                System.out.println((i + 1) + ". " + "The book is empty");
            }
        }
    }
}

//==============================================================


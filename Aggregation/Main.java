public class Main {
    public static void main(String[] args){

        Book book1 = new Book("Harry Potter", 592);
        Book book2 = new Book("Percy Jackson", 467);
        Book book3 = new Book("Lord of the Rings", 501);

        Book[] books = {book1, book2, book3};
        Library library = new Library("NYC Public Library", 1992, books);

        // for(Book book : books) {
        //     System.out.println(book.displayInfo());
        // }

        library.displayInfo();
    }
}
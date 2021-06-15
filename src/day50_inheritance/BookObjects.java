package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "intro to java";
        book.author = "savich";
        book.type = "programming";
        book.price = 85.0;

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        Audiobook audiobook = new Audiobook();
        audiobook.author = "Unmesh";
        audiobook.length= 60;
        audiobook.narrator = "Irina";
        audiobook.price = 44.99;
        audiobook.title = "selenium cookbook";
        audiobook.type = "automation";
        audiobook.listen();

        Ebook Ebook = new Ebook();
        Ebook.title = "intro to java";
        Ebook.author = "savich";
        Ebook.type = "programming";
        Ebook.price = 85.0;
        Ebook.size = 2;
        Ebook.pages = 1000;
        Ebook.readBook();


    }
}

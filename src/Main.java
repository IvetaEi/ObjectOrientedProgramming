import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Throne of Glass");
        book1.setPages(300);
        book1.setReleaseYear(2011);

        Book book2 = new Book();
        book2.setTitle("Caraval");
        book2.setPages(250);
        book2.setReleaseYear(2016);

        Book book3 = new Book();
        book3.setTitle("A Court of Thorns and Roses");
        book3.setPages(350);
        book3.setReleaseYear(2015);

        Book book4 = new Book("The Ballad of Never After",200,2020);
        Book book5 = new Book("Iron Flame",400,2023);
        Book book6 = new Book("Kingdom of Ash",500,2018);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);


        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle() + " " + books.get(i).getPages() + " " + books.get(i).getReleaseYear());}
        }




        Plant plant1 = new Plant();
        plant1.setName("Aloe Vera");







}


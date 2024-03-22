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
            System.out.println(books.get(i).getTitle() + " " + books.get(i).getPages() + " " + books.get(i).getReleaseYear());
        }

        System.out.println();
        System.out.println();
        System.out.println();

        Plant plant1 = new Plant();
        plant1.setName("Aloe vera");
        plant1.setLatinNameName("Aloe vera");
        plant1.setIsItAnnual(false);
        plant1.setContinentOnWhereItGrows("Mostly Africa");
        plant1.setHeight(1);
        plant1.setIsItEdible("Yes");

        Plant plant2 = new Plant();
        plant2.setName("Carrot");
        plant2.setLatinNameName("Daucus carota");
        plant2.setIsItAnnual(true);
        plant2.setContinentOnWhereItGrows("Most continents");
        plant2.setHeight(0.3);
        plant2.setIsItEdible("Yes");

        Plant plant3 = new Plant("Poison ivy","Toxidendron radicans",false,"Asia",1.2,"No");
        Plant plant4 = new Plant("Rose","Rosa",false,"Most continents",1.8,"No");

        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(plant1);
        plants.add(plant2);
        plants.add(plant3);
        plants.add(plant4);

        for (int x = 0; x < plants.size(); x++) {
            System.out.println(plants.get(x).getName() + " " +  plants.get(x).getLatinName() + " " + plants.get(x).getIsItAnnual() + " " + plants.get(x).getContinentOnWhereItGrows() + " " + plants.get(x).getHeight() + " m. " + plants.get(x).getIsItEdible());


        }

    }
}



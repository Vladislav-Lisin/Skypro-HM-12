public class Main {
    public static void main(String[] args) {

        Author levTolstoi = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", levTolstoi, 1869);

        System.out.println(warAndPeace.getYear());
        System.out.println(warAndPeace.getTitle());
        System.out.println(warAndPeace.getAuthor().getName() + " " + warAndPeace.getAuthor().getSurname());


        System.out.println();


        Author dostoevsk = new Author("Фёдор", "Достоевский");

        System.out.println(dostoevsk.getName() + " " + dostoevsk.getSurname());

        Book threeLoads = new Book("Преступление и наказание", dostoevsk, 1866);
        threeLoads.setYear(1967);
        System.out.println(threeLoads.getYear());
        System.out.println(threeLoads.getTitle());
        System.out.println(threeLoads.getAuthor().getName() + " " + threeLoads.getAuthor().getSurname());

        threeLoads.setYear(1966);
        System.out.println(threeLoads.getYear());
    }
}
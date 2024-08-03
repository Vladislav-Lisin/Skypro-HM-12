public class Main {
    public static void main(String[] args) {

        Author levTolstoi = new Author();
        levTolstoi.setName("Лев");
        levTolstoi.setSurname("Толстой");
        levTolstoi.setFullname("Лев Николаевич Толстой");
        System.out.println(levTolstoi.getName() + " " + levTolstoi.getSurname());
        System.out.println(levTolstoi.getFullname());


        System.out.println();


        Book warAndPeace = new Book();
        warAndPeace.setYear(1867);
        warAndPeace.setAuthor("Лев Толстой");
        warAndPeace.setTitle("Война и мир");
        System.out.println(warAndPeace.getYear());
        System.out.println(warAndPeace.getTitle());
        System.out.println(warAndPeace.getAuthor());


        System.out.println();


        Author mari = new Author();
        mari.setName("Мария (Пауль)");
        mari.setSurname("Ремарк");
        mari.setFullname("Эрих Мария Ремарк");
        System.out.println(mari.getName() + " " + mari.getSurname());
        System.out.println(mari.getFullname());

        Book threeLoads = new Book();
        threeLoads.setYear(1935);
        threeLoads.setAuthor("Эрих Мария Ремарк");
        threeLoads.setTitle("Три товарища");
        System.out.println(threeLoads.getYear());
        System.out.println(threeLoads.getTitle());
        System.out.println(threeLoads.getAuthor());

        threeLoads.setYear(1936);
        System.out.println(threeLoads.getYear());
    }
}
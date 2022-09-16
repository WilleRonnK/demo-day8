public class Main {
    public static void main(String[] args) {
        String sayHello = "Hej och godmorgon";
        System.out.println(sayHello);

        Animal horse1 = new Animal(4, "Oskar");
        Animal horse2 = new Animal(3);
        Animal horse3 =new Animal(5, "åke", "häst");
        Animal horse4 =new Animal("Pär");

        System.out.println(horse1.getAge());
        System.out.println(horse2.getAge());
        System.out.println(horse3.getType());
        System.out.println(horse4.getName());

        System.out.println("Ångrade mig");
    }
}

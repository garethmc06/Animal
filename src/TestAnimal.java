public class TestAnimal {
    public static void main(String[] args) {
        Lion lion1 = new Lion(5, "Simba", "Meat", 15);
        Lion lion2 = new Lion(2, "Nala", "Meat", 12);
        Lion lion3 = new Lion();
        lion2.setAge(5);
        System.out.println(lion1.toString());
        System.out.println(lion2.toString());
        System.out.println(lion3.toString());
        System.out.println("Number of Lions: " + Lion.numberOfLions);
    }
}

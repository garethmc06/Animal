public class Lion extends Animal {
    int age;
    String name;
    public static int numberOfLions = 0;

    public Lion(int newAge, String newName, String food, int lifeSpan) {
        super(food, lifeSpan);
        this.age = newAge;
        this.name = newName;
        numberOfLions();
    }

    public Lion() {
        this.age = 0;
        this.name = "";
        this.lifeSpan = 0;
        this.food = "";
        numberOfLions();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void numberOfLions(){
        numberOfLions++;
    }


    public String toString() {
        if (age > 3) {
            return "Name: " + name + ", Age: " + age + ", Food: " + food + ", Life Span: " + lifeSpan + ", Mane: Yes";
        } else {
            return "Name: " + name + ", Age: " + age + ", Food: " + food + ", Life Span: " + lifeSpan + ", Mane: No";
        }

    }
}
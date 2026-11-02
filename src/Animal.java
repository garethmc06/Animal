public class Animal{
    String food;
    int lifeSpan;

    public Animal(){
        this.food = "";
        this.lifeSpan = 0;
    }
    public Animal(String newFood, int newLifeSpan){
        this.food = newFood;
        this.lifeSpan = newLifeSpan;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
    public String toString(){
        return "Food: " + food + ", Life Span: " + lifeSpan;
    }

    public static void main(String[] args){
        Animal animal1 = new Animal("Grass", 10);
        Animal animal2 = new Animal("Meat", 15);
        Animal animal3 = new Animal();
        Animal animal4 = new Animal("Fruits", 8);
        System.out.println(animal1.toString());
        System.out.println(animal2.toString());
        System.out.println(animal3.toString());
        System.out.println(animal4.toString());

    }

}

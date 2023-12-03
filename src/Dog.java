public class Dog{
    private String name;
    private int age;
    private String breed;
    private double weight;
    private static int count = 0;

    public Dog(){
        count++;
    }

    public Dog(String name, int age, String breed, double weight){
        count++;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
    }

    //Setters and Getters for name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //Setters and Getters for age
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    //Setters and Getters for breed
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    //Setters and Getters for Weight
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    //gets the amount of dogs
    public static int dogCount(){
        return count;
    }
    //gets the weight from LBS to KG
    public double weightKG(){
        return weight * 0.45359237;
    }
    //toString for all of dogs info.
    public String toString(){
        return "Dogs Name: " + name + ", Age: " + age + ", Breed: " + breed + ", Weight in LBS: " + weight;
    }
}
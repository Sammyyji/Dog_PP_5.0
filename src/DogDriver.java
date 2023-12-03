public class DogDriver {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Piper", 3, "Australian Shepherd", 45);
        Dog dog3 = new Dog("Browny", 4, "Great Dane", 90);

        System.out.println("Fangs breed and age: " + dog1.getBreed() + ", " + dog1.getAge());
        System.out.println("Pipers weight: " + dog2.getWeight() + " LBS");
        System.out.println("My Dog: " + dog3.toString());
        System.out.println("I have " + Dog.dogCount() + " dogs.");

    }
}

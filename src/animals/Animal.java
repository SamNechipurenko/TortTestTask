package animals;

public abstract class Animal {
    public abstract void animalSays();

    public static void sound(String name){
        try {
            // check if class with animal name exists
            // if exists - create an instance of the class
            Animal animal =  (Animal) Class.forName( "animals." + name).newInstance();
            // listen to the animal
            animal.animalSays();
        } catch(Exception e) {
            System.out.println("Animal with name " + name + " not found");
        }
    }
}

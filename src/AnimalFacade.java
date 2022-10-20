public class AnimalFacade {
    private Animal cat;
    private Animal dog;

    public AnimalFacade(){
        this.cat = new Cat("Bengal", "Nala", 3);
        this.dog = new Dog("Pit Bull", "Max", 5);
    }

    public void cloneDog(){
        Dog anotherDog = (Dog) this.dog.copy();
        System.out.println("Dog cloned:");
        anotherDog.printData();
    }

    public void cloneCat(){
        Cat anotherCat = (Cat) this.cat.copy();
        System.out.println("Cat cloned:");
        anotherCat.printData();
    }

    public void printDataDog(){
        System.out.println("Original Dog:");
        this.dog.printData();
    }

    public void printDataCat(){
        System.out.println("Original Cat:");
        this.cat.printData();
    }

    public void dogSpeaks(){
        System.out.println("Dog Speaks:");
        this.dog.speak();
    }

    public void catSpeaks(){
        System.out.println("Cat speaks:");
        this.cat.speak();
    }
}

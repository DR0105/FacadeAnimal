public class Main {
    public static void main(String[] args) {
    AnimalFacade animalFacade = new AnimalFacade();
    animalFacade.printDataDog();
    animalFacade.printDataCat();
    animalFacade.dogSpeaks();
    animalFacade.catSpeaks();
    animalFacade.cloneDog();
    animalFacade.cloneCat();
    }
}
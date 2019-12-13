public class Main {

    public static void main(String[] args){

//        Dimensions dimensions = new Dimensions(20, 20, 5);
//        Case theCase = new Case("220B", "Dell", "240" , dimensions );
//
//        Monitor theMonitor = new Monitor("model", "model", 200, new Resolution(2540, 1440));
//        Motherboard theMotherbord = new Motherboard("BJ-200" , "Asus", 4, 6, "v2.2.3.4");
//
//        PC thePC = new PC (theCase, theMonitor, theMotherbord);
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");

//        Things theThings = new Things("prvi", "drugi", "treci");
//
//        Garage theGarage = new Garage("garage", 1,2);
//
//        House theHouse = new House(theThings, theGarage);
//        theHouse.getTheThings().nekaMetoda("jedna tabela", "jedan krevet", "zute");

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("Souht");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);
        Bedroom theBedroom = new Bedroom ("My", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        theBedroom.makeBed();
        theBedroom.getLamp().isLight();


    }
}

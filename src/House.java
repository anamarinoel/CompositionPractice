public class House {
   private Things theThings;
   private Garage tehGarage;

    public House(Things theThings, Garage tehGarage) {
        this.theThings = theThings;
        this.tehGarage = tehGarage;
    }

    public Things getTheThings() {
        return theThings;
    }

    public Garage getTehGarage() {
        return tehGarage;
    }
}

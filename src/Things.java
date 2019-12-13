public class Things {

    private String nesto;
    private String opetNesto;
    private String nesto2;

    public Things(String nesto, String opetNesto, String nesto2) {
        this.nesto = nesto;
        this.opetNesto = opetNesto;
        this.nesto2 = nesto2;
    }

    public void nekaMetoda(String table, String bad, String color) {
        System.out.println("U sobi se nalaze " + table + " i " + bad + " " + color + " boje!" );
    }
}

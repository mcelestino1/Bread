public class SourdoughBread extends Bread{

    private double sdStarter;


    public SourdoughBread(){
        this.sdStarter = 0.00;
    }
    public SourdoughBread(double flour, double water, double salt, double bakingPowder,
                                 double yeast, String breadName, String state, double sdStarter){
        super(flour, water, salt, 0, bakingPowder, yeast, breadName, state, "");
        this.sdStarter = sdStarter;


    }

    public void recipe(){
        System.out.println("A recipe of Sourdough Bread:\n" +
                "1. Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter.\n" +
                "2. Make the dough\n" +
                "3. Bulk Rise\n" +
                "4. Stretch and fold the dough\n" +
                "5. Cut and shape the dough\n" +
                "6. Second rise\n" +
                "6. Preheat the oven to 450°F towards the tail end of the second rise.\n" +
                "7. Spray the loaf with luke warm water.\n" +
                "8. Bake the bread at 400°F for 20 minutes, until deep golden brown.\n" +
                "9. Remove the bread from the oven.\n" +
                "10.Let the bread cool until good to eat.");

    }
    public double getSdStarter() {
        return sdStarter;
    }

    public void setSdStarter(double sdStarter) {
        this.sdStarter = sdStarter;
    }

    @Override
    public String toString() {
        return "This SourdoughBread used " + sdStarter + "cup(s) of Sourdough starter";
    }
}

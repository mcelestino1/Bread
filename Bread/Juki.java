public class Juki extends Bread{
    private int number;
    public Juki(){
        this.number = 12;
    }
    public Juki(double flour, double water, double salt, double bakingPowder,
                          double yeast, String breadName, String state, int number){
        super(flour, water, salt, 0, bakingPowder, yeast, breadName, state, "");
        this.number = number;


    }

    public void recipe(){
        System.out.println("A recipe of Juki:\n" +
                "1. Mix flour, water, salt, baking powder, yeast, sugar\n" +
                "2. Make the dough\n" +
                "3. Bulk Rise\n" +
                "4. Stretch and fold the dough\n" +
                "5. Cut and shape the dough\n" +
                "6. Second rise\n" +
                "6. Preheat the oven to 450°F towards the tail end of the second rise.\n" +
                "7. Spray the loaf with luke warm water.\n" +
                "8. Bake the bread at 400°F for 17 minutes, until light golden brown.\n" +
                "9. Remove the bread from the oven.\n" +
                "10.Let the bread cool until good to eat.");

    }
    public int getNumber() {
        return number;
    }

    public void number(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "You have made " + number + " Juki rolls";
    }
}


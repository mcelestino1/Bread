public class Pastry extends Bread{
    private String color;
    public Pastry(){
        this.color = "Pink";
    }
    public Pastry(double flour, double water, double salt, double bakingPowder,
                          double yeast, String breadName, String state, double color){
        super(flour, water, salt, 4.0, bakingPowder, yeast, breadName, state, "");
        this.color = "color";


    }

    public void recipe(){
        System.out.println("A recipe of Pastry:\n" +
                "1. Mix flour, water, salt, baking powder, yeast, food color of choice\n" +
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
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Your Pastry's color is "+ color;
    }
}


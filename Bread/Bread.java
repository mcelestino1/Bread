public class Bread {
    private double flour;
    private double water;
    private double salt;
    private double sugar;
    private double bakingPowder;
    private double yeast;
    private String breadName;
    private String state;
    private String recipe;

    public Bread(){
        this.flour = 5.00;
        this.water = 2.00;
        this.salt = 1.02;
        this.sugar = 6.00;
        this.bakingPowder = 1.05;
        this.yeast = 2.01;
        this.state = "not baked";
        this.breadName = "Vitumbuwa";
        this.recipe = "Just Wing it!";

    }

    public Bread(double flour, double water, double salt, double sugar, double bakingPowder,
                 double yeast, String breadName, String state, String recipe) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.state = state;
        this.recipe = recipe;
    }


    public double getFlour() {
        return flour;
    }

    public void setFlour(double flour) {
        this.flour = flour;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getBakingPowder() {
        return bakingPowder;
    }

    public void setBakingPowder(double bakingPowder) {
        this.bakingPowder = bakingPowder;
    }

    public double getYeast() {
        return yeast;
    }

    public void setYeast(double yeast) {
        this.yeast = yeast;
    }

    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    @Override
    public String toString() {
        return "For Bread{\nflour = " + flour + "\nwater = " + water + "\nsalt = " + salt + "\nsugar = " + sugar + "\nbakingPowder = " + bakingPowder +
                "\nyeast = " + yeast + "\nbreadName = " + breadName  + "\nstate = " + state + "\nrecipe = " + recipe +"\n}";
    }

    public String bake(){
        if (state.equalsIgnoreCase("not baked") ){
            state = "baked";
        }
        return state;
    }

    public String getIngredients(){
        return "Ingredients of " + breadName + " are:\n" + flour + " cups of flour\n" + water + " cups of Water\n" + salt +  " tsps of salt\n" +
                 yeast + " tsp of yeast";
    }
}


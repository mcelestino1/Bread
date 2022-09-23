public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread();
        SourdoughBread sdBread = new SourdoughBread(5.6, 3.5, 3.2, 4.53, 4.3,
                "SourDoughBread", "Not baked", 1.0);
        Pastry pastry = new Pastry();
        Juki juki = new Juki(3.0,3.0,3.0,3.0,3.0,"Juki Special", "Not Baked", 5);

        sdBread.recipe();
        System.out.println("Status: " + sdBread.bake());
        System.out.println(sdBread.toString());
        System.out.println();

        pastry.recipe();
        System.out.println("Status: " + pastry.bake());
        System.out.println((pastry.toString()));
        System.out.println();

        juki.recipe();
        System.out.println("Status: " + juki.bake());
        System.out.println(juki.toString());







    }
}

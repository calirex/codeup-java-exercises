public class Product {
    private String name;
    private int costInCents;

    // CONSTRUCTORS //
    public Product() {

    }

    public Product(String name, int costInCents) {
        this.name = name;
        this.costInCents = costInCents;

    }

    public Product(String name) {
        this.name = name;
    }

    public Product(int costInCents) {
        this.name = "Name is Unassigned";
        this.costInCents = costInCents;
    }

// GETTERS AND SETTERS //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;

    }


    // VIEWPORT //
    public static void main(String[] args) {
        Product[] product = new Product[4];
        product[0] = new Product("Nintendo", 100);
        product[1] = new Product("Game Cube", 200);
        product[2] = new Product("Sega Genesis", 300);
        product[3] = new Product("Atari", 400);


    }
}

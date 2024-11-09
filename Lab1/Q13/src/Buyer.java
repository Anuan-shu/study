public class Buyer {
    private String name;
    private String id;

    public Buyer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void buy(String... things) {
        System.out.print(id + ":" + name + " " + "购买");
        for (String thing : things) {
            System.out.print(thing + " ");
        }
        System.out.println();
    }
}


public class Cook {
    private String name;
    private String id;

    public Cook(String name, String id) {
        this.name = name;
        this.id = id;
    }

    void cook() {
        System.out.println(id + ":" + name + " " + "烹饪");
    }

    void cook(Cook with) {
        System.out.println(id + ":" + name + "和" + with.id + ":" + with.name + " " + "烹饪");
    }
}

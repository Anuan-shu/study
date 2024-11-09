import java.util.HashMap;
import java.util.Map;

public class Card {
    private String size;
    private String color;

    public Card() {
    }

    public Card(String size, String color) {
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return size + color;
    }

    public int getNum() {
        int[] nums = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "小王", "大王"};
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i].equals(size)) {
                return nums[i];
            }
        }
        return 0;
    }
}

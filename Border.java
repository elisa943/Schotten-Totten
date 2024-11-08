import java.util.ArrayList;

public class Border {
    public static final int NUM_BORDER_CARDS = 9;
    private int[] border;

    public Border() {
        border = new int[NUM_BORDER_CARDS];
        for (int i = 0; i < NUM_BORDER_CARDS; i++) {
            border[i] = 0;
        }
    }

    public int getBorder(int index) {
        return border[index];
    }

    public void setBorder(int value, int index) {
        border[index] = value;
    }

    public int getBorderSize(int value) {
        int count = 0;
        for (int i = 0; i < NUM_BORDER_CARDS; i++) {
            if (border[i] == value) {
                count++;
            }
        }
        return count;
    }
}
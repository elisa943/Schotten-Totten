public class Card {
    private int number; 
    private Color color; 
    public static final int MAX_NUMBER = 9;
    
    public Card(int number, Color color) {
        this.number = number;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public Color getColor() {
        return color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Card copy(Card card) {
        if (card == null) {
            return null; 
        }
        return new Card(card.getNumber(), card.getColor());
    }
}
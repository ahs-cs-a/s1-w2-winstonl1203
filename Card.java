public class Card {
    private int suit;
    private int rank;

    public Card(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }

    public Card(){
        this(3,13);
    }
    public void setSuit(int s){
        this.suit = s;
    }
    public void setRank(int r){
        this.rank = r;
    }
    public int getSuit(){
        return suit;
    }
    public int getRank(){
        return rank;
    }
}

public class Card
{
   private String rank;
   private String suit;
   private int pointValue;
   
   public Card(String rank, String suit, int pointValue)
   {
      this.rank = rank;
      this.suit = suit;
      this.pointValue = pointValue;
   }
   
   public String getRank()
   {
      return rank;
   }
   
   public String getSuit()
   {
      return suit;
   }
   
   public int getPointValue()
   {
      return pointValue;
   }
   
   public static boolean cardCompare(Card card1, Card card2)
   {
      if(card1.rank == card2.rank && card1.suit == card2.suit && card1.pointValue == card2.pointValue)
      {
         return true;
      }
      return false;
   }
   
   public String toString()
   {
      return rank + " of " + suit + " (point value: " + pointValue + ")";
   }
}
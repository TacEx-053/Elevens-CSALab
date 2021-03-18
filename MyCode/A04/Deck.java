import java.util.List;
import java.util.ArrayList;

public class Deck
{
   private List<Card> deck;
   private int size;

   public Deck(String[] ranks, String[] suits, int[] pointValues)
   {
      deck = new ArrayList<Card>();

      for(int i = 0; i < ranks.length; i++)
      {
         for(String suit : suits)
         {
            deck.add(new Card(ranks[i], suit, pointValues[i]));
         }
      }
   }

   public Card deal()
   {
      if(isEmpty())
      {
         return null;
      }

      size--;
      Card card = deck.get(size);

      return card;
   }

   public boolean isEmpty()
   {
      return size == 0;
   }

   public int getSize()
   {
      return size;
   }

   public String toString()
   {
      String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + deck.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = deck.size() - 1; k >= size; k--) {
			rtn = rtn + deck.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - deck.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
   }
}
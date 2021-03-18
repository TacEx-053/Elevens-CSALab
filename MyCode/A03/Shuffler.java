import java.lang.Math;
import java.util.Random;

public class Shuffler {
	private static final int SHUFFLE_COUNT = 1;

	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			int[] shuffled = perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < shuffled.length; k++) {
				System.out.print(" " + shuffled[k]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static int[] perfectShuffle(int[] values)
	{
		int count = 0;
		int halfDeck = (values.length / 2);

		int[] firstHalf = new int[halfDeck];
		int[] secondHalf = new int[halfDeck];
		int[] shuffled = new int[values.length];

		for(;count < halfDeck;)
		{
			firstHalf[count] = values[count];
			secondHalf[count] = values[count + halfDeck];
			count++;
		}

		int j = 0;
		for(int i = 0; i < halfDeck; i++)
		{
			shuffled[j] = firstHalf[i];
			shuffled[j + 1] = secondHalf[i];
			j += 2;
		}
		
		return shuffled;
	}

	public static void selectionShuffle(int[] values)
	{
		for(int i = values.length - 1 ; i > 0; i--)
		{
			int pos = (int) (Math.random() * (i + 1));
			int temp = values[pos];
			values[pos] = values[i];
			values[i] = temp;
		}
	}
}

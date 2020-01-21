import java.util.Random;
public class Dice
{
		private int[] numbers=new int[6];
		private Random r;
		Dice(int Seed)
		{
		    r=new Random(Seed);
		}
		public int roll()
		{
			int choice=r.nextInt(6);
			numbers[choice]++;
			return choice+1;
		}
		public void reset()
		{
			for(int i=0;i<numbers.length;i++)
				numbers[i]=0;
		}
		public void printStats()
		{
			for(int i=0;i<numbers.length;i++)
				System.out.println((i+1)+": "+numbers[i]);
		}
}
		

		
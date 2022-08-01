import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		int sum1 = 0, sum2 = 0;
		float g1 = 0, g2 = 0;

		Scanner s = new Scanner(System.in);
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();

			if (i % 2 != 0) {
				sum1 += arr[i];
				g1 = (float) sum1 / 3;
			} else {
				sum2 += arr[i];
				g2 = (float) sum2 / 3;
			}

		}
		System.out.printf("(%.1f", g2);
		System.out.printf(", %.1f)\n", g1);
		
		s.close();
	}
	

}

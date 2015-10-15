import java.util.*;
public class Scores {

	public static void main(String[] args) {
		String[] names = new String[10];
		int[][] testScores = new int[10][5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("Enter the name of a student: ");
			names[i] = sc.next();
			System.out.println("Enter 5 test scores for the student: ");
			for(int j=0;j<5;j++) {
				testScores[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<10;i++) {
			System.out.print(names[i] + " ");
			for(int j=0;j<5;j++)
				System.out.print(testScores[i][j] + " ");
			System.out.println();
		}
		sc.close();
	}

}

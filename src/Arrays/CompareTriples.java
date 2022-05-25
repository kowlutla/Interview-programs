package Arrays;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class CompareTriples {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int alice[] = new int[n];
		int bob[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter element: ");
			alice[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Second array: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Enter element: ");
			bob[i] = Integer.parseInt(br.readLine());
		}
		int Bob = 0;
		int Alice = 0;
		for (int i = 0; i < n; i++) {
			if (alice[i] > bob[i]) {
				Alice++;
			}
			if (alice[i] < bob[i]) {
				Bob++;
			}
		}
		System.out.println(Alice + " " + Bob);
	br.close();
	}

}

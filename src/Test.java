import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of Array : ");
		int n = Integer.parseInt(sc.nextLine());
		int a[] = new int[n];
		int temp[] = new int[n];
		int j = 0;
		System.out.println("Element: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}
		temp[j++] = a[n - 1];
		for (int i = 0; i < j; i++) {
			a[i] = temp[i];

		}
		for (int i = 0; i < j; i++) {
			System.out.println(a[i]);
		}

	}

}

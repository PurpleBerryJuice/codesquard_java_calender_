package calender;

import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {

		Example calender = new Example();
		Scanner scanner = new Scanner(System.in);
		int month;
		calender.PrintOfCalender();
		System.out.println("");
		System.out.println("");
		calender.PrintOfMaxdays(3);
		calender.HowManyPrint(3);
		while (true) {
			System.out.printf("���� �Է��ϼ��� :");
			month = scanner.nextInt();
			if (month == -1)
				break;
			else if (month == 0) {
				System.out.println("�Է��� ���� �������� �ʽ��ϴ� �ٸ� ���� �ٽ� �Է��� �ּ���");
				System.out.println("���� �Է��ϼ���:");
				month = scanner.nextInt();
			}
			calender.PrintOfMaxdays(month);

		}
		System.out.println("===== ���α׷��� ����˴ϴ� ======");
		scanner.close();
	}

}

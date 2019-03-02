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
			System.out.printf("월을 입력하세요 :");
			month = scanner.nextInt();
			if (month == -1)
				break;
			else if (month == 0) {
				System.out.println("입력한 달은 존재하지 않습니다 다른 달을 다시 입력해 주세요");
				System.out.println("월을 입력하세요:");
				month = scanner.nextInt();
			}
			calender.PrintOfMaxdays(month);

		}
		System.out.println("===== 프로그램이 종료됩니다 ======");
		scanner.close();
	}

}

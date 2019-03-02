package calender;

import java.util.Scanner;

public class Example {

	private final int[] DaysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int parseDay(String week)
	{
		if(week.equals("SD"))
		{
			return 0;
		}
		else if(week.equals("MD"))
		{
			return 1;
		}
		else if(week.equals("TD"))
		{
			return 2;
		}
		else if(week.equals("WD"))
		{
			return 3;
		}
		else if(week.equals("TRD"))
		{
			return 4;
		}
		else if(week.equals("FRD"))
		{
			return 5;
		}
		else if(week.equals("STD"))
		{
			return 6;
		}
		else
			return 0;
	}
	public Example() {
		System.out.println("====== Welcome to MyCalender ======");
	}
	public void Sub_PrintOfCalender(int year , int month , int weekday)
	{
		int i;
		int j = 7-weekday;
		System.out.println("<"+year+">");
		System.out.println(month +"월");
		System.out.println("일 월 화 수 목 금 토");
		for(i=0;i<weekday ; i++)
		{
			System.out.printf("   ");
		}
		for(i=1 ; i < this.DaysOfMonth[month-1]+1 ; i++)
		{
			if(i%7 ==j+1)
				System.out.println("");
			if(i>=10)
			{
				System.out.printf("%d ",i);
			}
			else
			System.out.printf("%d  ",i);
		}
	}
	public void PrintOfCalender() {
		Scanner scanner = new Scanner(System.in);
		int year, month, weekday;
		System.out.println("========원하는 달력을 출력해드립니다==========");
		while (true) {
			
			System.out.println("년도를 입력해주세요.");
			System.out.printf("YEAR >");
			year = scanner.nextInt();
			if(year ==-1)
				break;
			System.out.println("달을 입력해주세요.");
			System.out.printf("MONTH >");
			month = scanner.nextInt();
			System.out.println("시작 요일을 입력해주세요.");
			System.out.printf("WEEKDAY >");
			String stn_weekday =scanner.next();
			weekday = parseDay(stn_weekday);
			
			Sub_PrintOfCalender(year, month, weekday);
			
			
			
		}

	}

	public void PrintOfMaxdays(int month) {
		System.out.printf("%d 달 의 최대일은 = %d\n", month, this.DaysOfMonth[month - 1]);

	}

	public void HowManyPrint(int number) {

		int i;
		int[] days = new int[number];
		Scanner scanner = new Scanner(System.in);
		for (i = 0; i < number; i++) {
			days[i] = scanner.nextInt();
		}
		for (i = 0; i < number; i++) {
			System.out.printf("%d 달 의 최대일은 = %d\n", days[i], this.DaysOfMonth[(days[i]) - 1]);
		}
	}
}

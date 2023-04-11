package 타자연습기_정민경;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		System.out.println("==========");
		System.out.println("[타자 연습]");
		System.out.println("1.시작");
		System.out.println("2.종료");
		System.out.println("==========");
		System.out.print("메뉴 입력 => ");
		
		inputScan();
	}
	
	public static void inputScan() {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if (n == 2) {
			System.out.println("프로그램 종료");
			return;
		}
		
		else if (n == 1) {
			game();
		}
		
		else {
			System.out.println("잘못 입력하셨습니다. 확인후 다시 입력하세요");
			return;
		}
	}
	
	public static void game() {
		System.out.println();
		System.out.println("전체 단어 리스트");
		System.out.println("======================");
		System.out.println("JAVA, java , CJ, cj, LOVE");
		System.out.println("======================");
		System.out.println();
		
		String[] list = {"JAVA", "java", "CJ", "cj", "LOVE"};
		
		int idx, cnt = 0;
		String input, tmp;
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		
		long startTime = System.currentTimeMillis();
		for(int i = 5; i > 0; i--) {
			System.out.println("남은 단어수 : " + i);
			System.out.println();
			
			idx = r.nextInt(i);
			System.out.println("제공단어:" + list[idx]);
			System.out.print("타이핑 입력 => ");
			input = scan.next();
			if(input.equals(list[idx])) {
				System.out.println("띵똥!");
				System.out.println();
			}
			else {
				System.out.println("땡!");
				System.out.println();
				cnt++;
			}
			
			tmp = list[idx];
			list[idx] = list[i - 1];
			list[i - 1] =tmp;
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("---------------");
		System.out.printf("성공률 : %.1f%%\n", (5 - cnt) / 5.0 * 100);
		System.out.printf("시간 : %.1f초\n", (float)(endTime - startTime) / 1000);
		System.out.println("---------------");
	}
	
}

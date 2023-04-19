package dao;

import java.util.List;
import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {

		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1. 전체 목록");
			System.out.println("2. 부서저장");
			System.out.println("0. 종료");
			System.out.println("--------------------------");
			
			String num = scan.nextLine();
			if("1".equals(num)) {
				DeptService service = new DeptServiceImpl();
				List<DeptDTO> list = service.findAll();
				System.out.println("부서번호 \t 부서명 \t 부서위치");
				System.out.println("--------------------------");
				for (DeptDTO dto : list) {
					System.out.println(dto);
				}
			}else if("2".equals(num)) {
				
			}else {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			
		} // end while

	} // end main

} //  end class

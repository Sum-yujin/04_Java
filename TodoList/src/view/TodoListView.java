package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListView {
	
	private TodoListService service = null;
	private BufferedReader br = null;
	
	public TodoListView() {
		
		try {
			
			service = new TodoListServiceImpl();
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
		} catch (Exception e) {
			System.out.println("*** 프로그램 실행 중 오류 발생 ***");
			e.printStackTrace();
			System.exit(0); // 프로그램 종료
		}
	}
	
	
	
	// -------------------------------------------------------------------------------------------
	// [메인 메뉴]
	
	public void mainMenu(){
		
		int input = 0;
		do {
			
			try {
				
				input = selectMenu();
				
				switch(input) {
				case 1: break;
				case 2: break;
				case 3: break;
				case 4: break;
				case 5: break;
				case 6: break;
				
				case 0: System.out.println(" 프로그램 종료"); break;
				default : System.out.println("### 메뉴에 작성된 번호만 입력 해주세요 ###");
				}
				
				System.out.println("=====================================");
				
			} catch(NumberFormatException e) {
				System.out.println("\n### 숫자만 입력 해주세요 ###\n");
				input = -1; // 첫 반복에서 종료되지 않게 값 변경
			
			} catch(IOException e) {
				System.out.println("\n### 입출력 관련 예외 발생 ###\n");
				e.printStackTrace(); // 예외 추적
			
			} catch(Exception e) { // 나머지 예외 처리
				e.printStackTrace();
			}
			
			
		}while ( input != 0);
	}



	private int selectMenu() throws NumberFormatException, IOException {

		System.out.println("===== Todo List =====");
		
		System.out.println("1. Todo List Full View");
		System.out.println("2. Todo Detail View");
		System.out.println("3. Todo Add");
		System.out.println("4. Todo Complete");
		System.out.println("5. Todo Update");
		System.out.println("6. Todo Delete");
		System.out.println("0. Todo List Full View");
		
		System.out.print("select menu number >>>");
		int input = Integer.parseInt(br.readLine());
		
		return input;
	}
	
	
	
}

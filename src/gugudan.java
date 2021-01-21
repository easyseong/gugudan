import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("number : " + number);
        
        if (number<2 || number>9) {
        	System.out.println("잘못된 값입니다");
        } else {
        	for(int i=1 ; i<10 ; i++) {
            	System.out.println(number+"*"+i+"="+(number*i));
            }
        }
        
	
	
	
	}

}

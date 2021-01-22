import java.util.Scanner;

public class gugudan {
	public static void calculate(int num) {
		int[] result = new int[9];
		if (num<2 || num>9) {
        	System.out.println("잘못된 값입니다");
        } else {
        	for(int i=0 ; i<9 ; i++) {
            	result[i] = num *(i+1);
        		
            }
        	for (int i=0 ; i<9 ; i++) {
        		System.out.println(num+"*"+(i+1)+"="+(result[i]));
        	}
        }
        
	}

	public static void main(String[] args) {
		
		System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("number : " + number);
        calculate(number);
        
        
	
	
	
	}

}

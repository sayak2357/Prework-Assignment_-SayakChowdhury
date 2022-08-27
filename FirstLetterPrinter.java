import java.util.Scanner;
class FirstLetterPrinter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(firstLetterPrinter(input));
	}
	static String firstLetterPrinter(String input){
		String op = "";
		int n = input.length();
		boolean flag = true;
		for(int i=0;i<n;i++){
			if(flag){
				op += input.charAt(i);
				flag = false;
			}
			if(input.charAt(i) == ' '){
				flag = true;
			}
		}
		return op;
	}
}
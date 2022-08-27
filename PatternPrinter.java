import java.util.Scanner;
class PatternPrinter {
 public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int n = in .nextInt();
     patternPrinter(n);
 }
 static void patternPrinter(int n) {
    for(int i = n; i>=1; i--){
        printLine(n,i);
        System.out.println();
    }
 }
 static void printLine(int num, int line){
    for(int it = num; it>=1; it--){
        for(int i=0;i<line;i++){
            System.out.print(it);
        }
    }
 }
}
import java.util.Scanner;

public class Review01 {
    
	public static void main(String[] args) {
		int price = 0;
		double taxRate = 0.1;
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print(" 販売価格を入力してください。:");
		price = stdIn.nextInt();
		
		int taxResult = tax(price,taxRate);
		int totalResult = price + taxResult;
		
		System.out.println(price + "円の商品の税込価格は" + totalResult + "円（消費税は"+ taxResult + "円）です。");
		
		stdIn.close();
	}

	public static int tax(int price , double taxRate) {
		System.out.println("debug: "+(int)(price * taxRate));
		return (int)(price * taxRate) ;
	}
}
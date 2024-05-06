import java.util.Scanner;

public class Review01 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ//		
		int price = 100;
		int tax = 1;
		int result = taxincluded(price,tax);
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("商品価格：");
		price = stdIn.nextInt();
		System.out.println("消費税額：");
		tax = stdIn.nextInt();
		
		result = (int) (price + tax);
		System.out.println(price + "円の商品の税込価格は" + result + "円（消費税は"+ tax + "円）です。");
		
		stdIn.close();
	}

	public static int taxincluded(int price,int tax) {
		int result = (int) (price + tax);
        return result;
	}

}

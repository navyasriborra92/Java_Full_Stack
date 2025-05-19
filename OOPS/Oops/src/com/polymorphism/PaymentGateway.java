package com.polymorphism;

public class PaymentGateway {
	public static void main(String[] args) {
		PaymentGateway pg = new PaymentGateway();
		pg.paymentGateway(222.34);
		pg.paymentGateway(222.34, 1234234534L);
		pg.paymentGateway(222.34, 123124);
		pg.paymentGateway(222.34, 1234554L,"hbgfrger");
		pg.paymentGateway(222.34, "jagbeirug@uhfidf");	

		int[][] arr = new int[2][];
		arr[0] =new int[3];
		arr[1] = new int[2];
		System.out.println(arr[1].length);
		
		int[] arra = {0,1,2,3};
		int[] carr = arra.clone();
		carr[1] = 20;
		System.out.println(arra[1]);
		
	}
	
	void paymentGateway(double amount) {
		double price = amount;
		System.out.println("Payment processed using COD");
	}
	
	void paymentGateway(double amount, Long cardNumber) {
		Long a = cardNumber;
		double price = amount;
		System.out.println("Payment processed using card");
	}
	void paymentGateway(double amount, int upiId) {
		double price = amount;
		int Id = upiId;
		System.out.println("Payment processed using UPI");
	}
	
	void paymentGateway(double amount, Long accountNo, String ifscCode) {
		double price = amount;
		Long accNo = accountNo;
		System.out.println("Payment processed using netBanking");
	}
	
	void paymentGateway(double amount, String walletId) {
		double price = amount;
		String Id = walletId;
		System.out.println("Payment processed using wallet");
	}

}

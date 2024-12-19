package LLD.OberserverDesignPattern3.Observer;

import LLD.OberserverDesignPattern3.Obervable.StockObservable;

public class MobileObserver implements NotifyObserver {

	private String userName;
	private StockObservable stockObservable;

	public MobileObserver(String username, StockObservable stockObservable) {
		this.userName = username;
		this.stockObservable = stockObservable;
	}

	@Override
	public void update() {
		sendSms("john", "Product is back in stock");
	}

	private void sendSms(String user, String mes) {
		System.out.println("Hello " + user + ", update->" + mes);
	}

}

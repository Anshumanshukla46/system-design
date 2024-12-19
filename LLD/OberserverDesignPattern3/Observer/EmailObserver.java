package LLD.OberserverDesignPattern3.Observer;

import LLD.OberserverDesignPattern3.Obervable.StockObservable;

public class EmailObserver implements NotifyObserver {

	private StockObservable stockObservable;
	private String email;

	public EmailObserver(String email, StockObservable stockObservable) {
		this.email = email;
		this.stockObservable = stockObservable;
	}

	@Override
	public void update() {
		sendMail("john.doe@gmail.com", "Product is in the stock now");
	}

	private void sendMail(String email, String mes) {
		System.out.println("Hello " + email + ", update->" + mes);
	}

}

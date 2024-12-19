package LLD.OberserverDesignPattern3;

import LLD.OberserverDesignPattern3.Obervable.PhoneObservableImpl;
import LLD.OberserverDesignPattern3.Obervable.StockObservable;
import LLD.OberserverDesignPattern3.Observer.EmailObserver;
import LLD.OberserverDesignPattern3.Observer.MobileObserver;

public class Main {
	public static void main(String[] xyz) {
		StockObservable stockObservable = new PhoneObservableImpl();

		MobileObserver mobileObserver = new MobileObserver("John", stockObservable);
		EmailObserver emailObserver1 = new EmailObserver("John.doe@gmail.com", stockObservable);
		EmailObserver emailObserver2 = new EmailObserver("John.doe@gmail.com", stockObservable);

		stockObservable.add(emailObserver1);
		stockObservable.add(emailObserver2);
		stockObservable.add(mobileObserver);
		
		
		stockObservable.setdata(12);
	}
}

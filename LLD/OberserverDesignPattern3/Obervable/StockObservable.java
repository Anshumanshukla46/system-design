package LLD.OberserverDesignPattern3.Obervable;

import LLD.OberserverDesignPattern3.Observer.NotifyObserver;

public interface StockObservable {

	void add(NotifyObserver notify);

	void remove(NotifyObserver notify);

	void notifyCustomer();

	void setdata(int data);

	int getData();
}

package LLD.OberserverDesignPattern3.Obervable;

import java.util.ArrayList;
import java.util.List;

import LLD.OberserverDesignPattern3.Observer.NotifyObserver;

public class PhoneObservableImpl implements StockObservable {
	private int stockCount = 0;
	private List<NotifyObserver> notifyObserverList=new ArrayList<>();

	@Override
	public void add(NotifyObserver notify) {
		notifyObserverList.add(notify);

	}

	@Override
	public void remove(NotifyObserver notify) {
		notifyObserverList.remove(notify);

	}

	@Override
	public void notifyCustomer() {
		for (NotifyObserver observer : notifyObserverList) {
			observer.update();
		}
	}

	@Override
	public void setdata(int data) {
		if (this.stockCount == 0 && data > 0) {
			notifyCustomer();
		}
		this.stockCount = data;

	}

	@Override
	public int getData() {
		return this.stockCount;
	}

}

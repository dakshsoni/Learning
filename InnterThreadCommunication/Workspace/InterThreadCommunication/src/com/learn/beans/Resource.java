package com.learn.beans;

public class Resource {

	private boolean hasData;
	private int count;

	public boolean isHasData() {
		return hasData;
	}

	public void setHasData(boolean hasData) {
		this.hasData = hasData;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public synchronized void produceDaata(int data) {

		while (hasData) {

			try {

				wait();

			} catch (InterruptedException e) {

				System.out.println(e.getLocalizedMessage());
			}

		}

		count = data;
		System.out.println(String.format("Data %d produced by producer : " + Thread.currentThread().getName(), data));
		hasData = true;
		notify();

	}

	public synchronized void consumeDaata() {

		while (!hasData) {

			try {

				wait();

			} catch (InterruptedException e) {

				System.out.println(e.getLocalizedMessage());
			}

		}

		System.out.println(String.format("Data %d consumed by consumer : " +Thread.currentThread().getName(), count));;
		hasData = false;
		notify();

	}

}

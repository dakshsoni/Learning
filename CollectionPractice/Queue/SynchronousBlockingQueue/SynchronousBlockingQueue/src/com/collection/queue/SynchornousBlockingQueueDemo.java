package com.collection.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchornousBlockingQueueDemo {

	public static void main(String[] args) {

		BlockingQueue<String> blockingQueue = new SynchronousQueue<>();

		Thread producer = new Thread(() -> {

			for (int i = 0; i < 20; i++) {

				Producer p = new Producer(blockingQueue);
				try {
					Thread.sleep(1000);
					p.produceMessage(String.valueOf(i));
				
				} catch (InterruptedException e) {
					
					Thread.currentThread().interrupt();
					
					System.out.println(e.getMessage());
				}
			}

		});
		Thread consumer = new Thread(() -> {

			for (int i = 0; i < 20; i++) {

				Consumer c = new Consumer(blockingQueue);
				try {
					Thread.sleep(1000);
					c.consumeData();
				
				} catch (InterruptedException e) {
					
					Thread.currentThread().interrupt();
					
					System.out.println(e.getMessage());
				}
			}

		});
		
		producer.start();
		consumer.start();

	}

}

class Producer {

	private BlockingQueue<String> blockingQueue;

	public Producer(BlockingQueue<String> blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}

	public void produceMessage(String msg) throws InterruptedException {

		System.out.println("Producer Producing data : " + msg);
		blockingQueue.put(msg);
	}

}

class Consumer {

	private BlockingQueue<String> blockingQueue;

	public Consumer(BlockingQueue<String> blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}

	public void consumeData() throws InterruptedException {

		System.out.println("Consumer Consume data : " + blockingQueue.take());

	}

}

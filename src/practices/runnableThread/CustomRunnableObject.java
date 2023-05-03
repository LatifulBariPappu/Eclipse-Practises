package runnableThread;

public class CustomRunnableObject implements Runnable {
	
	private String name;
	private int counter;
	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			counter++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				break;
			}
			
		}
		
	}
	public CustomRunnableObject(String name, int counter) {
		super();
		this.name = name;
		this.counter = counter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}

}

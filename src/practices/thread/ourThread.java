package thread;

public class ourThread extends Thread{
	
	public String threadName;
	private int counter;
	public int startingPoint;
	public int adder;
	public int timeDifference;
	private boolean threadAliveFlag;
	public ourThread dependentThread;
	
	public ourThread(String threadName,int startingPoint,int adder, int timeDifference, boolean threadAliveFlag,ourThread dependentThread) {
		super();
		this.threadName=threadName;
		this.startingPoint=startingPoint;
		this.adder = adder;
		this.timeDifference = timeDifference;
		this.threadAliveFlag = threadAliveFlag;
		this.dependentThread=dependentThread;
	}
	//----------run() method---------------

	@Override
	public void run() {
		counter=startingPoint;
		if(dependentThread!=null) {
		try {
			dependentThread.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
			}
		}
		
		while (threadAliveFlag) {
			counter+=adder;
			try {
				sleep(timeDifference);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	//----------counter Getter & Setter -------------

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	public void stopThread() {
		threadAliveFlag=false;
	}

	
	
}

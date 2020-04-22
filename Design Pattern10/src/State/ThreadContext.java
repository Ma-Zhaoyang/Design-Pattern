package State;

public class ThreadContext {
	private ThreadState threadState;
	
	public ThreadContext() {
		threadState = new NewState();
	}
	
	public ThreadState getThreadState() {
		return threadState;
	}

	public void setThreadState(ThreadState threadState) {
		this.threadState = threadState;
	}
	public void start() {
		((NewState)threadState).start(this);
	}
	public void getCpu() {
		((RunnableState)threadState).getCpu(this);
	}
	public void suspend() {
		((RunnableState)threadState).suspend(this);
	}
	public void stop() {
		((RunnableState)threadState).stop(this);
	}
	public void resuem() {
		((RunnableState)threadState).resume(this);
	}
}

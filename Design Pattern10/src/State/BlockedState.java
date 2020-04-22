package State;

public class BlockedState extends ThreadState{

	public BlockedState() {
		// TODO Auto-generated constructor stub
		state = StateSet.BLOCKED;
		System.out.println("阻塞线程");
	}
	public void resume(ThreadContext tc) {
		// TODO Auto-generated method stub
		System.out.println("调用了resume方法");
		if (state == StateSet.BLOCKED) {
			tc.setThreadState(new RunnableState());
		}else
			System.out.println("当前线程不是新建线程");
	}
	
}

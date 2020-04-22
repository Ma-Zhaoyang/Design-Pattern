package State;

public class RunningState extends ThreadState{

	public RunningState() {
		// TODO Auto-generated constructor stub
	    state = StateSet.RUNNING;
	    System.out.println("运行状态");
	}
	public void suspend(ThreadContext tc) {
		// TODO Auto-generated method stub
		System.out.println("调用suspend方法");
		if (state == StateSet.RANNABLE) {
			tc.setThreadState(new BlockedState());
		}else
			System.out.println("当前状态不是运行状态");
	}
	public void stop(ThreadContext tc) {
		// TODO Auto-generated method stub

		System.out.println("调用stop方法");
		if (state = StateSet.RUNNING) {
			tc.setThreadState(new DeadState());
		}else
			System.out.println("当前状态不是运行状态");
	}
}

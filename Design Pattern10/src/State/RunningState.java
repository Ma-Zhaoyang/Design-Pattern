package State;

public class RunningState extends ThreadState{

	public RunningState() {
		// TODO Auto-generated constructor stub
	    state = StateSet.RUNNING;
	    System.out.println("����״̬");
	}
	public void suspend(ThreadContext tc) {
		// TODO Auto-generated method stub
		System.out.println("����suspend����");
		if (state == StateSet.RANNABLE) {
			tc.setThreadState(new BlockedState());
		}else
			System.out.println("��ǰ״̬��������״̬");
	}
	public void stop(ThreadContext tc) {
		// TODO Auto-generated method stub

		System.out.println("����stop����");
		if (state = StateSet.RUNNING) {
			tc.setThreadState(new DeadState());
		}else
			System.out.println("��ǰ״̬��������״̬");
	}
}

package State;

public class RunnableState extends ThreadState {

	public RunnableState() {
		// TODO Auto-generated constructor stub
		state = StateSet.RANNABLE;
		System.out.println("����״̬");
	}

	public void getCpu(ThreadContext tc) {
		// TODO Auto-generated method stub
		System.out.println("��ȡCPUʱ��");
		if (state == StateSet.RANNABLE) {
			tc.setThreadState(new RunningState());
		}else
			System.out.println("��ǰ״̬���Ǿ���״̬");
	}
}

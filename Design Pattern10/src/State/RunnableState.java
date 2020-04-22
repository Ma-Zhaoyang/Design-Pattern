package State;

public class RunnableState extends ThreadState {

	public RunnableState() {
		// TODO Auto-generated constructor stub
		state = StateSet.RANNABLE;
		System.out.println("就绪状态");
	}

	public void getCpu(ThreadContext tc) {
		// TODO Auto-generated method stub
		System.out.println("获取CPU时间");
		if (state == StateSet.RANNABLE) {
			tc.setThreadState(new RunningState());
		}else
			System.out.println("当前状态不是就绪状态");
	}
}

package State;

public class BlockedState extends ThreadState{

	public BlockedState() {
		// TODO Auto-generated constructor stub
		state = StateSet.BLOCKED;
		System.out.println("�����߳�");
	}
	public void resume(ThreadContext tc) {
		// TODO Auto-generated method stub
		System.out.println("������resume����");
		if (state == StateSet.BLOCKED) {
			tc.setThreadState(new RunnableState());
		}else
			System.out.println("��ǰ�̲߳����½��߳�");
	}
	
}

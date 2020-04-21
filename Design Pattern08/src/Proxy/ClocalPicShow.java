package Proxy;

public class ClocalPicShow implements IShowPic, Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		pic.ShowPic(picname);
		System.out.println("图片载入成功");
	}

	private IShowPic pic;
	private String picname;
	@Override
	public void ShowPic(String picname) {
		// TODO Auto-generated method stub
		pic = new CRemoPic();
		this.picname = picname;
		System.out.println("准备载入图片 " + picname);
		Thread th = new Thread(this);
		th.start();
	}

}

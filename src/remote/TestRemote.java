package remote;


public class TestRemote {
	private int button;
	public void channelInput() {
		System.out.print("채널을 선택해주세요 : ");
		System.out.println("1번 mbc 2번 kbs 3번 sbs");
		switch(button) {
		case 1 : System.out.println("1번 mbc 채널로 이동합니다"); break;
		case 2 : System.out.println("2번 kbs 채널로 이동합니다"); break;
		case 3 : System.out.println("3번 sbs 채널로 이동합니다"); break;
		}
		
	}
	public int getButton() {
		return button;
	}
	public void setButton(int button) {
		this.button = button;
	}
	

}

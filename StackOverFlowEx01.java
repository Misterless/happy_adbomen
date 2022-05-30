
class Lion{
	private int 배상태 = 0;
	
	public int get배상태() {
		return 배상태;
	}


	public void eat() {
		
		int happy = 0;
		배상태++;
		happy = happy+10 ;
		System.out.println("기쁨 :  "+ happy +" 배상태 :  " + 배상태);
		if (배상태 >=100){
			return;
		} else {
		
		eat();
	}
}

public class StackOverFlowEx01 {
	
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.eat();
		
	}

}
}



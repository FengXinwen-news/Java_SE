class WhileDemo{
	public static void main(String[] args){
		int days=0;
		double money=0.0;
		while(true){
			days++;
			money +=2.5;
			if(days%5==0){
				money -=6.0;
			}
			if(money>=100){
				break;
			}
		}
		System.out.println("������"+days+"�죬�浽��100Ԫ");
	}
}
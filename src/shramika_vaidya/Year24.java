package shramika_vaidya;

class Year24{
	void printMonthInfo(int index){
		if(index >= 1 && index <= 3){
			System.out.println("Quarter1");
			if(index==1){
				System.out.println("current month is Jaunary");
			}
		    else if(index==2){
				System.out.println("current month is Febuary");
			}
			else if(index==3){
				System.out.println("current month is March");
			}
		}
		else if(index>=4 && index<=6){
			System.out.println("Quarter2");
			if(index==4){
				System.out.println("current month is April");
			}
			else if(index==5){
				System.out.println("current month is May");
			}
			else if(index == 6){
				System.out.println("current month is June");
			}
		}
		else if(index>=7 && index<=9){
			System.out.println("Quarter3");
			if(index==7){
				System.out.println("current month is July");
			}
			else if(index==8){
				System.out.println("current month is August");
			}
			else if(index==9){
				System.out.println("current month is September");
			}
		}
		else if(index>=10 && index<=12){
			System.out.println("Quarter4");
			if(index==10){
				System.out.println("current month is Octomber");
			}
			else if (index==11){
				System.out.println("current month is Novmber");
			}
			else if(index == 12){
				System.out.println("current month is December");
			}
		}
		else{
			System.out.println("invalid index");
		}
	}
	
	public static void main(String[] args){
		Year24 year24 = new Year24();
		year24.printMonthInfo(1);
		year24.printMonthInfo(6);
		year24.printMonthInfo(9);
		year24.printMonthInfo(12);
		year24.printMonthInfo(3);
		year24.printMonthInfo(7);
		year24.printMonthInfo(17);
	}
}
	
		
		
		
		
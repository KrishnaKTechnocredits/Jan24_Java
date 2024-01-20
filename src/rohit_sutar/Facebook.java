package rohit_sutar;

class Facebook{
	
	static int like = 0;
	
	void increseLike(){
		like = like + 1;
	}
	
	void showLikes(){
		System.out.println(like);
	}
	
	public static void main(String args[]){
		Facebook f1 = new Facebook();
		Facebook f2 = new Facebook();
		Facebook f3 = new Facebook();
		Facebook f4 = new Facebook();
		
		f1.increseLike();
		f2.increseLike();
		f3.increseLike();
		f4.increseLike();
		f4.increseLike();
		
		f1.showLikes();
		
		
		
		
	}
}
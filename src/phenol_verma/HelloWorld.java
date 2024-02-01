package phenol_verma;
class HelloWorld {

    void replaceStr(){
        String str = "aaiakhansha";
        for(int i=0; i<str.length(); i++ ){
        	char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                str = str.replace(String.valueOf(ch),"");
                i = -1;
			}
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.replaceStr();
    }
}
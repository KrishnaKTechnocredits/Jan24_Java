package atisha;

//print all the character from given string having frequency 1 using indexOf & lastIndexOf
class Assignment23 
{
	
    public static void main(String[] args) {
        String str = "technocredits";
        for (int i = 0; i < str.length(); i++) {
            char newChar = str.charAt(i);
            if (str.indexOf(newChar) == str.lastIndexOf(newChar)) {
                System.out.println(newChar);
            }
        }
    }


}


package rohini_deshmane;

class StudentInfo {
    int rno = 10;
    String name = "Rohini";

    void display() {
        System.out.println(rno);
        System.out.println(name);
    }

    public static void main(String[] args) {
        StudentInfo s = new StudentInfo();
        s.display();
    }
}
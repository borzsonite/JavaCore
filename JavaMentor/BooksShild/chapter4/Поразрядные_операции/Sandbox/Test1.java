package JavaMentor.BooksShild.chapter4.Поразрядные_операции.Sandbox;

public class Test1 {
    public static void main(String[] args) {
        int num = 0b00001101;
        int var1 = 5;
        int var2 = 35;
        boolean done = true;
        if(done) {
            // some code
        }
        for(int i =0; i<10; i++) {
            System.out.println(Integer.toBinaryString(num)+"-->" + num);
            num = num <<1;
        }
        System.out.println(Integer.toBinaryString(~var1));
        System.out.println(var2>>1);
        if(!done) System.out.println(true);

    }
}

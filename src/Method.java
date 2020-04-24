import static java.lang.System.*;
public class Method {
    public static void main(String[] args){
        int num = 3;
        if (evenNum(num)){
            out.print("偶数");
        }else{
            out.print("奇数");
        }
        //out.print(evenNum(num));
    }

    public static boolean evenNum(int num){ 
        //if Number is even Number, return True
        return (num%2 != 0);

    }
}
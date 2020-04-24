import static java.lang.System.*;
public class Method {
    public static void main(String[] args){
        int num = 3;
        if (evenNum(num)){
            out.println("偶数");
        }else{
            out.println("奇数");
        }
        //out.print(evenNum(num));
        out.print(hour(12));
    }

    public static boolean evenNum(int num){ 
        //if Number is even Number, return True
        return (num%2 == 0);

    }
    public static String hour(int num){ 
        //if Number is even Number, return True
       if (num >24){
           return "Error";
       } else if(num/12 == 0){
           return "午前";
       }else {
           return "午後";
        }
    }    
}
import static java.lang.System.*;
public class Fukushu {
    public static void main(String[] args){
        int[] tensu={80,60,90,50,70};
        int sum=0;
        int cnt=0;
        for(int i:tensu){
            out.println(i);
            sum+=i;
            if (i >=70){
                cnt++;
            }
        }
        out.printf("sum:%d, Num of over 70:%d\n",sum,cnt);
    }
}
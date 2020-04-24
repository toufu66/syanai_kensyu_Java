import static java.lang.System.*;
import java.util.Scanner;

public class Gengo{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] gengos={"昭和","平成","令和"};
        out.println("元号を入力");
        int i = 0;
        for (String gi:gengos){
            out.printf("%s : %d\n",gi,i++);
        }
        int g=scan.nextInt() - 1;
        out.println("年を入力　（ただし、元年は1で）");
        int y=scan.nextInt();
        out.print(getGengoName(gengos,g)+ y +"年は");
        out.println("西暦"+getSeireki(g, y)+"年");
        scan.close();        
    }

    public static int getSeireki(int g,int y){
        if (g == 0){
            return (y + 1925); 
        }
        if(g == 1){
            return (y + 1988); 

        }else {
            return (y + 2018);
        }    
    }

    public static String getGengoName(String[] gengos,int i){
        
        return gengos[i];
    }

}
package seiseki;

public class Main {
    public static void main(String[] args){
    St st1 = new St();
    st1.name = "安倍晋三";
    st1.koku = 100;
    st1.mt = 100;
    st1.sya = 500;
    st1.show();
    System.out.println(st1.sum());
    System.out.println(st1.ave());
    }

}
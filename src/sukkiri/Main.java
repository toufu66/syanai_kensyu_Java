package sukkiri;



public class Main {
    public static void main(String[] args) {
        //System.out.println("aaaaaaaaaaaaa");
        Syohin s = new Syohin();
        s.name = "りんご";
        s.price = 100;
        s.tax = 10;
        s.show();
        s.showTax();
        Urigage u = new Urigage();
        u.syohin = s;
        u.abc();

    }

}
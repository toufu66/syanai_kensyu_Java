package sales;

public class Sales {
    private String name;
    private int money;
    public Sales(String name,int money){
        this.name = name;
        this.money = money;
    }
    public int getSouryou(){
        if (this.money >=3000){
            return 0;
        }
        return 500;
    }

    public int getTotal(){
        return getSouryou() + this.money;
    }

    public String getName(){
        return this.name;
    }
    public int getKingaku(){
        return this.money;
    }
    public String toString(){//名前 金額 送料 を文字列として返す

        return (this.name + " " + this.money + " 円 "+ "送料 "+getSouryou()+ " 円");        
    }

}
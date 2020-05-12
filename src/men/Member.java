package men;

public class Member {
    String name;
    String tel;
    public Member(String n,String t){
        this.name = n;
        this.tel = t;        
    }

    public void ms(){
        System.out.println(this.name + this.tel);
    }
}
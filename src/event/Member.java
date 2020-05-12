package event;

public class Member {
    private String name;
    private int age; 
    public Member(String n,int a){
        this.name = n;
        this.age = a;
    }

    public void setMem(String n,int a){
        this.name = n;
        this.age = a;
    }
    public void showMem(){
        System.out.println(this.name + " "+ this.age + "歳");
        
    }
}
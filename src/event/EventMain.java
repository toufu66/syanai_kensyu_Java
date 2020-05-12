package event;

public class EventMain {
    public static void main(String[] a){
        Event e = new Event("下北沢野球大会");
        e.add(new Member("野獣",24));
        e.add(new Member("ひで",12));
        e.add(new Member("KBTIT", 30));
        e.show();
    }
    
    
}
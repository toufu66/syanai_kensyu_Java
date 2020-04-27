package obj;
import  static java.lang.System.*;
public class Circle {
    int hankei;
    void menseki(){
        out.println(this.hankei*this.hankei*Math.PI);
    }
    void circumference(){
        out.println(2*this.hankei*Math.PI);        
    }
}
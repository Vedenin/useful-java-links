Contribution Guidelines

You can add any examples for any libraries. Template is [this](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/9.9-template). 
You can see [json sections](https://github.com/Vedenin/useful-java-links/tree/master/helloworlds/3.8-json) for examples. 
Ideally, if you examples can be build using only maven, and running using only Idea Community or Eclipse.    

Thank you for any your suggestions!
 
 import java.lang.*;
public class Calulator {
    double i;
    double x;
    void p(){
        x = Math.sqrt(i);
    }
}
class Demonstration_81{
    public static void main(String[] args){
        Calulator a = new Calulator();
        a.i = 20.0;
        a.p();
        System.out.println("Square root of"+a.i+" is "+a.x);

    }
}


package Invertebrata;

public class KakiTiga extends Animal {
    int legs;
    String jointType;
    
    KakiTiga(String n, int l, String jT){
        name = n;
        legs = l;
        jointType = jT;
    }
    
    public void display(){
        System.out.printf("%-12s%-12b%-18s\n", name, legs, jointType);
    }
}

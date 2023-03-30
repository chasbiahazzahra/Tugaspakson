
package Invertebrata;

public class TidakMelata extends Animal {
    boolean likeWorm;
    String bodyShape;
    
    TidakMelata(String n, boolean lW, String bS){
        name = n;
        likeWorm = lW;
        bodyShape = bS;
    }
    
    public void display(){
        System.out.printf("%-12s%-12b%-18s\n", name, likeWorm, bodyShape);
    }
}

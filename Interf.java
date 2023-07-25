interface  Animal{
    void walk();
}
class Horse implements Animal{
    public void walk(){
    System.out.println("Walks on 4 legs");
    }
}




public class Interf {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();
        
    }
    
}

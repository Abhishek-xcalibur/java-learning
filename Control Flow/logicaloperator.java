public class logicaloperator{
    public static void main(String[] args){
        int height = 190;
        int weight = 80;
        if(height >180 && weight > 70){
            System.out.println("You are tall and heavy!");
        }
        else if(height > 180 || weight > 70){
            System.out.println("You are either tall or heavy!");
        }
        else{
            System.out.println("You are neither tall nor heavy!");
        }
    }
}
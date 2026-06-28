public class elseif{
    public static void main(String[] args){
        boolean isCatOwner = false;
        boolean isDogOwner = true;

        if (isCatOwner){
            System.out.println("You are a cat owner!");
        }
        else if (isDogOwner){
            System.out.println("You are a dog owner!");
        }
        else{
            System.out.println("You are not a cat or dog owner!");
        }
    }
}
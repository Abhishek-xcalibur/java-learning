public class nested {
    public static void main(String[] args){
        /* A nested loop is a loop inside another loop. The "inner loop"
        will be executed one time for each iteration of the "outer loop".
        */
       for(int i=1;i<=3;i++){
        for(int j=1;j<=3;j++){
            System.out.println("The value of i is :"+i+" and the value of j is :"+j);
        }
       }
    }
}
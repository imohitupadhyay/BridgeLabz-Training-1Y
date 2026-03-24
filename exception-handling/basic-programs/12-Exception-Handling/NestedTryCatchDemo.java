class NestedTryCatchDemo {
    public static void main(String[] args){

        int[] a = {10,20,30};
        int i = 5;
        int d = 0;

        try{
            try{
                int val = a[i];
                try{
                    System.out.println(val/d);
                } catch(ArithmeticException e){
                    System.out.println("Cannot divide by zero!");
                }
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid array index!");
            }
        } catch(Exception e){
            System.out.println("Error");
        }
    }
}

class MultipleCatchDemo {
    public static void main(String[] args){
        int[] a = {10,20,30};

        try{
            int i = 5;
            System.out.println("Value: " + a[i]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        } catch(NullPointerException e){
            System.out.println("Array is not initialized!");
        }
    }
}

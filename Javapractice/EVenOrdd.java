public class EVenOrdd {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5};

        for(int i = 0; i < array.length; i ++)
        {
            if(array[i] % 2 == 0)
            {
                System.out.println("EVen " + array[i]);
            }
            else
            {
                System.out.println("Odd " + array[i]);
            }
        }
    }   
}

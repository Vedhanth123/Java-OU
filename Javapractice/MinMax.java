public class MinMax {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++)
        {
            // checking for min
            if(min > array[i])
            {
                min = array[i];
            }
            // checking for max
            if(max < array[i])
            {
                max = array[i];
            }

        }

        System.out.println(min, max);
    }
}
 DOne!!!!!!!!!

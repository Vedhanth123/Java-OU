public class Bubblesort {
    
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        int counter = 0;
        for(int i = 0; i < 5; i ++)
        {
            for(int j = 0; j < 4; j ++)
            {
                if(array[j] < array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                    counter ++;
                }
            }
        }
        for(int i = 0; i < 5; i ++)
        {
            System.out.println(array[i]);
        }
        System.out.println(counter);
    }
}

public class Array {
    public static void main(String[] args) {
        
        int[] D1 = {1,2,3,4,5};

        int[][] D2 = {{1,2,3,4},{5,6,7,8}};

        for(int i = 0; i < D1.length; i ++)
        {
            System.out.println(D1[i]);
        }

        System.out.println("------------------------------------");
        for (int[] i : D2) {
            for (int j : i) {
                System.out.println(j);
            }
        }
    }
}

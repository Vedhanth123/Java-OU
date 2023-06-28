public class Armstrong
{   
    public static void main(String[] args)
    {
        int number = 153;
        int backup = number;
        int answer = 0;
        int part = 0;


        while(number != 0)
        {
            part = number % 10;
            answer = answer + part * part * part;
            number = number / 10;
        }

        if(answer == backup)
        {
            System.out.println("armstrong");
        }
        else
        {
            System.out.println("Not an armstrong");
        }
    }
}
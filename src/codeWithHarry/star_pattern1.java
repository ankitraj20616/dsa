public class star_pattern1
{
    public static void main(String[] args)
    {
        int i,j;
        System.out.println("\033c");
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=9;j++)
            {
                if(((5-i)<j)&&(j<(5+i)))
                   System.out.print("*");
                else
                  System.out.print(" ");   
            }
            System.out.print("\n");
        }
    }   
}

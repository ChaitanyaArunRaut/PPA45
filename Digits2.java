import java.util.*;

/**
 * Digits2
 */
class Digit
{
    int iNo;

    public Digit(int A)
    {
        iNo = A;
    }

    public void Display()
    {
        int iDigit = 0; 
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            System.out.print(iDigit);
            iNo = iNo / 10;
        }
    }

    public int CountDigit()
    {
        int iDigit = 0, iCount = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            iCount++;
        }
        return iCount;
    }
}

public class Digits2 
{
    public static void main(String Arg[])
    {
        int iVlaue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System. in);

        System.out.println("Enter Number :");
        iVlaue = sobj.nextInt();

        Digit dobj = new Digit(iVlaue);

        dobj.Display();

        iRet = dobj.CountDigit();
        System.out.println("Count of Numbers is :"+iRet);


    }
    

}
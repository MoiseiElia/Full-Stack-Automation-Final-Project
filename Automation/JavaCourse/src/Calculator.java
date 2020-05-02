import com.sun.org.apache.xpath.internal.objects.XString;

public class Calculator
{
    public static void main (String[] args)
    {
        String[] array = {"3","*","2"};
        calc(array);
    }
    public static void calc(String[] arr)
    {
       double first = Double.parseDouble(arr[0]);
        double third = Double.parseDouble(arr[2]);
        if (arr[1] == "/")
        {
            System.out.println(first / third);
        }
       else if (arr[1] == "+")
        {
            System.out.println(first + third);
        }

      else if (arr[1] == "-")
    {
        System.out.println(first - third);
    }
       else if (arr[1] == "*")
    {
        System.out.println(first * third);
    }
    }
}

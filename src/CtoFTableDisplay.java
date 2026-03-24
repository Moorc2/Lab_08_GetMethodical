public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("-------\t\t----------");

        for (int c = -100; c <= 100; c++)
        {
            System.out.printf("%-10.1f\t%-10.1f%n", (double) c, CtoF(c));
        }
    }

    public static double CtoF(double celsius)
    {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
}
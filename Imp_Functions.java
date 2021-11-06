//package Main;

public interface Imp_Functions
{
    default public long string_to_int(String str)
    {
        return Long.parseLong(str);
    }
    default public String int_to_string(long temp)
    {
        return Long.toString(temp);
    }
    default public double string_to_double(String str)
    {
        return Double.parseDouble(str);
    }
    default public String double_to_string(double temp)
    {
        return Double.toString(temp);
    }
    default public boolean compare_string(String s1, String s2)
    {
        return s1.equals(s2);
    }
}

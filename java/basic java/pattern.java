import java.util.*;
public class patternq{
public static void main(String args[])
{
pattern(n:5);
{
static void pattern(int n){
for (int row=1;row<=n;row++)
{
for(int col=n;col<=row;col--)
{
System.out.print("* ");
}
System.out.println();
}
}
}
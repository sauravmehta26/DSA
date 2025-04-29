import java.util.*;
public class Patterns{

public static void main(String args[]){
    star(5);
}
static void star(int n){
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
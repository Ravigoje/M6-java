class LogicalOpExample
{
public static void main(String[]args)
{


System.out.println(true&&true||true&&true||true&&false);
System.out.println(false&&false||true&&true||false&&false);
System.out.println(true&&false||true&&false||true&&true);
System.out.println(false&&false||false&&false||true&&false);

//1 way
//boolean value1= true;
//boolean value2= false;

//2 way
//boolean value3 =value1 && value2;
//System.out.println(value3);

}

}
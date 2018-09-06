package inner;

class outer{

    static int a;
    public  static void show()
    {

    }
       static class Inner
       {
           public void display()
           {
            System.out.println( "indisplay");

       }

    }
            }

public class InnerDemo
{

    public static void main(String[] args)
    {

     outer obj =new outer();
     obj.show();

 outer.Inner obj1 = new outer.Inner();
obj1.display();




    }
}

 class wide  {
    void show()
    {
        System.out.println("1");
    }
    
}
class Xyz extends wide
{
  void show()
  {
    System.out.println("2");
  }
}
class Test
{
    public static void main(String[]args)
    {
        wide t=new wide();
        t.show();
        Xyz x=new Xyz();
        x.show();
    }
}

package Unit10.BasicOO;
class Rect
{
    private int width;   // 屬性       
    private int length; 
      
    public void setWidth(int wd)
    {
        width=wd;
    }
    
    public void setLength(int len)
    {
        length=len;
    }
    
    public int area()         // 定義方法area(), 用來計算面積
    {
        return width * length;
    }
   
    public int perimeter()    // 定義方法perimeter(), 用來計算周長
    {
        return (width + length) * 2;
    }
}

class Ex01_Rectangle
{
    public static void main(String args[])
    {
        Rect r = new Rect();
 
        r.setWidth(10);    
        r.setLength(5);    
      
        System.out.println("面積=" + r.area());
        System.out.println("周長=" + r.perimeter());
    }
}
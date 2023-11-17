import org.w3c.dom.html.HTMLAppletElement;

class This1
{
    int r; 
    void setValue(int r)
    {
        this.r=r;         
    }
    void show()
    {
        System.out.println(r);
    }

}
class This 
{
public static void main(String args[])
    { 
        System.out.println("Using of this Keyword");     
        This1 t = new This1();
        t.setValue(20);
        t.show();
    }
}
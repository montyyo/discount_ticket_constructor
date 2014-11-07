

public class temperatura
{
   private int temp;
   private int t;
   
    /**
     * Constructor for objects of class temperatura
     */
    public temperatura()
    {
        // initialise instance variables
        temp = 0;
    }
    public void temperatura(int temp)
    
    {
     t = temp;  
    }
    
    public void sampleMethod()
    {
        if (t > 20)
            {
             System.out.println("me voy a correr");
            }
        else if (t < 10)
          {
           System.out.println("me voy a caminar");
          }
        
        else 
        {
         System.out.println("me voy a la piscina");
        }
    }
}



package activationpack;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class ActivationPack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int code;
        int choice = 0;
        
        
        
        System.out.println("Enter YOLO activation code : ");
        code = keyboard.nextInt();
        //beginning of the program pack activation
        if(code == 154)
        {
            System.out.println("Options"+"\n"+"5.YOLO Voice"+"\n"+"6.YOLO internet");
        
       
            System.out.println("Choose your needed package : ");
           
           
            choice = keyboard.nextInt();
            
           if(choice == 5)
            {
                System.out.println("Voice activation Options"+"\n"+"1. 220 secodes and 30 sms  for 100 Frw"+"\n"+"2.440 secondes and 90 sms for 200 Frw.");
              
                
             System.out.println("Enter your needed voice activation");
             choice = keyboard.nextInt();
             if(choice==1)
             {
                 System.out.println("Your activation of 220 secondes + 30sms has been successful"); 
             }
              else if(choice==2)
            {
                System.out.println("Your activation of 440 secodes + 90 sms has been successful");
            }
             
             else{
                 System.out.println("Your choicec must be either 1 or 2");
            }
             
            }
           
            

                     
         
        //end of voice pack aAactivation
        
          if(choice==6)
                 
             {
             
                 
                System.out.println("Internet activation Options"+"\n"+"1. 100 Frw = 120MB"+"\n"+"2. 200 Frw 240MB.");
              
                
             System.out.println("Enter your needed voice activation");
             choice = keyboard.nextInt();
             if(choice==1)
             {
                 System.out.println("Your activation of 120MB  has been successful"); 
             }
              else if(choice==2)
            {
                System.out.println("Your activation of 240MB has been successful");
            }
             
             else{
                 System.out.println("Your choicec must be either 1 or 2");
            } 
                 
             }
             
        }
        else{
            System.out.println("Error of YOLO. The correct Yolo code is 154 not *154# or 1222...");
        }
    }   

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackusinglinkedlist;
import java.util.Scanner;
/**
 *
 * @author stuti
 */
public class Stackusinglinkedlist 
{
    
    public static void main(String[]  args)
    {
        Node top = new Node();
        top = null;
        Scanner input = new Scanner(System.in);
        
        while(true)
        {
            
            System.out.print("Do you want to 1. push,2. pop,3. to display and 4. to exit?\n");
            int i = input.nextInt();
            if (i == 4)
            {
                break;
            }
            switch(i)
            {
                case 1:
                    top = push(top);
                    break;
                 
                case 2:
                    top = pop(top);
                    break;
                    
                case 3:
                    display(top);
                    break;
                    
                default:
                    System.out.print("Invalid entry\n");
                    break;
                
            }
        }
    }
    
    public static Node push(Node top)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter data for new Node in Stack");
        int data = input.nextInt();
        Node s = new Node(data);
        if (top == null)
        {
           s.link = null;
        }
        
        else
        {
            s.link = top;
        }
        
        top = s;
        return(top);
    }
    
    public static Node pop(Node top)
    {
        if (top == null)
        {
            System.out.print("Stack empty");
            return(null);
        }
        else
        {
            //Node temp = top;
            top = top.link;
            // how to delete temp;
            return top;
        }
    }
    
    public static void display(Node top)
    {
        Node s = top;
        System.out.print("The stack is....\n");
        while(s != null)
        {
            System.out.print(s.data +"-->");
            s = s.link;
        }
        System.out.print("null\n");
    }
   
}
      


import javax.swing.*;

import java.security.PublicKey;
import java.util.Scanner;
public class MainClass {

   
    static Scanner sc = new Scanner(System.in);
    int i, j;
     static JFrame f = new JFrame();
     
    public void add() {
    
        i = Integer.parseInt( JOptionPane.showInputDialog(f,"Enter 1st Number"));
        j=Integer.parseInt( JOptionPane.showInputDialog(f,"Enter 2ndNumber"));
        JOptionPane.showMessageDialog(null,(i+j),"Result is", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);   
    }

    public void sub() {
        i = Integer.parseInt( JOptionPane.showInputDialog(f,"Enter 1st Number"));
        j=Integer.parseInt( JOptionPane.showInputDialog(f,"Enter 2ndNumber"));
        JOptionPane.showMessageDialog(null,(i-j),"Result is", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public void div() {
        i = Integer.parseInt( JOptionPane.showInputDialog(f,"Enter 1st Number"));
        j=Integer.parseInt( JOptionPane.showInputDialog(f,"Enter 2ndNumber"));
        JOptionPane.showMessageDialog(null,(i/j),"Result is", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public void multi() {
        i = Integer.parseInt( JOptionPane.showInputDialog(f,"Enter 1st Number"));
        j=Integer.parseInt( JOptionPane.showInputDialog(f,"Enter 2ndNumber"));
        JOptionPane.showMessageDialog(null,(i*j),"Result is", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public static void main(String[] args) {
        int input;
        MainClass fn =new MainClass();
        input=Integer.parseInt( JOptionPane.showInputDialog(f,"\n Enter Your Choice \n 1--> For Addition \n 2 --> For Subtraction \n 3 --> For Division \n 4 --> Multiplication \n note : Enter Your Choice by Using Numbers btween 1 to 4 \n"));
        switch (input) {
            case 1:
                fn.add();
                break;
            case 2:
                fn.sub();
                break;
            case 3:
                fn.div();
                break;
            case 4: 
                fn.multi();
                break;
            default:
            JOptionPane.showMessageDialog(null,"Wrong Choise","Alert", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
            
                
        }
    }
}

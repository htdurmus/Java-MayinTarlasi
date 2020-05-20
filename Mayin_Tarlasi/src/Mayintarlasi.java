
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Mayintarlasi {
    JFrame frame;
    Random rnd = new Random();   
    
    int puan=0;
    public Mayintarlasi(){        
        
        frame = new JFrame("Mayın Tarlası");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(10, 10));
                
        for(int i=1;i<=10;i++)
            {
                for(int j=1;j<=10;j++)
                {   
                   int random=rnd.nextInt(2); //random sayı atama
                   final int sutun = i;
                   final int satir = j;
                   final JButton btn_ij = new JButton(Integer.toString(random));

                   btn_ij.setFont(new Font("Times New Roman", Font.PLAIN, 12));
                   btn_ij.setBounds(i*45, j*33, 45, 33);
                   btn_ij.setBackground(Color.green);
                   btn_ij.setForeground(Color.green);
                   
                   frame.add(btn_ij);
                   btn_ij.setVisible(true);                   
                   
                   if(random==1){
                        btn_ij.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent arg0) {
                        btn_ij.setBackground(Color.red);
                        }
                        });                      
                    }
                   
                   else{
                       btn_ij.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent arg0) {
                        btn_ij.setBackground(Color.blue);
                        puan+=10;
                        System.out.println("Paun: "+puan);
                        }
                        });                      
                    }       
                }
            }    
        frame.setVisible(true);
    }
}
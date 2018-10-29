/*
 * Java Utveckling 18
 *  InlämningUppgift3 15 Puzzle Spel (15 Puzzle Game)
 */

package puzzle_game;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Farouk A
 */
public class Puzzle_game extends JFrame{

      JPanel jPanel = new JPanel();
      JPanel jPanel1= new JPanel();

      JButton buttons[]= new JButton[15];
      JLabel jLabel=new JLabel();
      JButton newGame=new JButton("New Game");
      //creating constructor
      Puzzle_game(){
           super("15 Game");
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(newGame,BorderLayout.SOUTH);
        jPanel1.add(jPanel,BorderLayout.CENTER);
        
        jLabel.setName("16");
        //register an action listener to the button
        newGame.addActionListener(this);
        
        jPanel.setLayout(new GridLayout(4,4));
        //create 15 buttons, add a name,actionCommand and actionListener than add to a panel
        for (int i=0;i<buttons.length;i++){
          buttons[i]=new JButton(i+1+"");
          buttons[i].setName(i+1+"");
          buttons[i].setActionCommand("ok");
          buttons[i].addActionListener(this);
          jPanel.add(buttons[i]);
        }
        jPanel.add(jLabel);
        add(jPanel1);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLocation(350,100);
        setVisible(true);
          
      }
    
   
    public static void main(String[] args) {
        
    }

}

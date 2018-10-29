/*
 * Java Utveckling 18
 *  InlämningUppgift3 15 Puzzle Spel (15 Puzzle Game)
 */

package puzzle_game;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Farouk A
 */
public class Puzzle_game extends JFrame implements ActionListener{
      //creating the two panels to hold the buttons
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
      /**
       * a method to mix randomly the 15 buttons and re-add them to Jpanel
       */
      public void mix(){
        ArrayList<Integer>randomArray=new ArrayList<>();
        int random;
        Random rand= new Random();
        for(int i=0;i<15;i++){
            do{
            random=rand.nextInt(15);
                }
            while(randomArray.contains(random));
            System.out.println(random);
            randomArray.add(random);
            jPanel.add(buttons[random]);
            }
      }
      /**
       * a method to check if the buttons are sorted in the right order
       * @return true or false
       */
      public Boolean gameCompleted(){
        for(int i=0;i<15;i++){
            //parsing the name of the button to int
            int n =Integer.parseInt(jPanel.getComponent(i).getName().trim());
            System.out.println("number of comp: "+jPanel.getComponent(i).getName());
            //checking if the difference between n and i (the component index) is equal to one or not
            if((n-i)!=1)
               return false;


            }
            return true;

      }

   
    public static void main(String[] args) {
        new Puzzle_game();
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }

}

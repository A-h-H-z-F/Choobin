package main;


import java.awt.Button;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;



public class Sakht3Dar3 extends DokmeHa{

    void off(boolean a){
        if(a==false){
            btn1.setVisible(false);
            btn2.setVisible(false);
            btn3.setVisible(false);
            btn4.setVisible(false);
            btn5.setVisible(false);
            btn6.setVisible(false);
            btn7.setVisible(false);
            btn8.setVisible(false);
            btn9.setVisible(false);
        } 
        if (a==true) {
            btn1.setVisible(true);
            btn2.setVisible(true);
            btn3.setVisible(true);
            btn4.setVisible(true);
            btn5.setVisible(true);
            btn6.setVisible(true);
            btn7.setVisible(true);
            btn8.setVisible(true);
            btn9.setVisible(true);
        }}
    public boolean b =true;
    
    
    public int elapsedTime = 0;
    public int seconds =0;
    public int minutes =0;
    public boolean started = false;
    public String seconds_string = String.format("%02d", seconds);
    public String minutes_string = String.format("%02d", minutes);
        
    
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            elapsedTime=elapsedTime+1000;
	    minutes = (elapsedTime/60000) % 60;
	    seconds = (elapsedTime/1000) % 60;
            seconds_string = String.format("%02d", seconds);
	    minutes_string = String.format("%02d", minutes);
	    timeLabel.setText(minutes_string+":"+seconds_string);
        }
    });
    void start() {
		timer.start();
	}
	
	void stop() {
		timer.stop();
	}
	
	void reset() {
		timer.stop();
		elapsedTime=0;
		seconds =0;
		minutes=0;
		seconds_string = String.format("%02d", seconds);
		minutes_string = String.format("%02d", minutes);
		timeLabel.setText(minutes_string+":"+seconds_string);
	}
    
    public JLabel timeLabel;
    
    
    public Sakht3Dar3(){
        
        btn9 =new JButton(" ");
        
         btn1.setFont(new Font("homa", Font.BOLD, 50));
         btn2.setFont(new Font("homa", Font.BOLD, 50));
         btn3.setFont(new Font("homa", Font.BOLD, 50));
         btn4.setFont(new Font("homa", Font.BOLD, 50));
         btn5.setFont(new Font("homa", Font.BOLD, 50));
         btn6.setFont(new Font("homa", Font.BOLD, 50));
         btn7.setFont(new Font("homa", Font.BOLD, 50));
         btn8.setFont(new Font("homa", Font.BOLD, 50));
         btn9.setFont(new Font("homa", Font.BOLD, 50));



        btn1.setBounds(87,100,95,95);
        btn2.setBounds(192,100,95,95);
        btn3.setBounds(297,100,95,95);
        btn4.setBounds(87,205,95,95);
        btn5.setBounds(192,205,95,95);
        btn6.setBounds(297,205,95,95);
        btn7.setBounds(87,310,95,95);
        btn8.setBounds(192,310,95,95);
        btn9.setBounds(297,310,95,95);
        
        add(btn9);
        
        
        
        
        timeLabel = new JLabel();
        timeLabel.setBounds(195,400,200,100);
        timeLabel.setForeground(Color.WHITE);
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,30));
        add(timeLabel);
                MacaneDorost();
                MakhfiKardaneDokmeha();

       btn1.addMouseListener(new MouseListener(){

            public void mousePressed(MouseEvent e){
                           btn1.setForeground(new Color(204, 204, 230));
                           btn1.setBackground(new Color(204, 204, 230));
}
            public void mouseClicked(MouseEvent e) {}public void mouseReleased(MouseEvent e) {}public void mouseEntered(MouseEvent e) {}public void mouseExited(MouseEvent e) {}
         
        });
        
        btn2.addMouseListener(new MouseListener(){

            public void mousePressed(MouseEvent e){
                           btn2.setForeground(new Color(204, 204, 230));
                           btn2.setBackground(new Color(204, 204, 230));
}
            public void mouseClicked(MouseEvent e) {}public void mouseReleased(MouseEvent e) {}public void mouseEntered(MouseEvent e) {}public void mouseExited(MouseEvent e) {}
         
        });
        btn3.addMouseListener(new MouseListener(){

            public void mousePressed(MouseEvent e){
                           btn3.setForeground(new Color(204, 204, 230));
                           btn3.setBackground(new Color(204, 204, 230));
}
            public void mouseClicked(MouseEvent e) {}public void mouseReleased(MouseEvent e) {}public void mouseEntered(MouseEvent e) {}public void mouseExited(MouseEvent e) {}
         
        });
        btn4.addMouseListener(new MouseListener(){

            public void mousePressed(MouseEvent e){
                           btn4.setForeground(new Color(204, 204, 230));
                           btn4.setBackground(new Color(204, 204, 230));
}
            public void mouseClicked(MouseEvent e) {}public void mouseReleased(MouseEvent e) {}public void mouseEntered(MouseEvent e) {}public void mouseExited(MouseEvent e) {}
         
        });
        btn5.addMouseListener(new MouseListener(){

            public void mousePressed(MouseEvent e){
                           btn5.setForeground(new Color(204, 204, 230));
                           btn5.setBackground(new Color(204, 204, 230));
}
            public void mouseClicked(MouseEvent e) {}public void mouseReleased(MouseEvent e) {}public void mouseEntered(MouseEvent e) {}public void mouseExited(MouseEvent e) {}
         
        });
        btn6.addMouseListener(new MouseListener(){

            public void mousePressed(MouseEvent e){
                           btn6.setForeground(new Color(204, 204, 230));
                           btn6.setBackground(new Color(204, 204, 230));
}
            public void mouseClicked(MouseEvent e) {}public void mouseReleased(MouseEvent e) {}public void mouseEntered(MouseEvent e) {}public void mouseExited(MouseEvent e) {}
         
        });
        btn7.addMouseListener(new MouseListener(){

            public void mousePressed(MouseEvent e){
                           btn7.setForeground(new Color(204, 204, 230));
                           btn7.setBackground(new Color(204, 204, 230));
}
            public void mouseClicked(MouseEvent e) {}public void mouseReleased(MouseEvent e) {}public void mouseEntered(MouseEvent e) {}public void mouseExited(MouseEvent e) {}
         
        });
        btn8.addMouseListener(new MouseListener(){

            public void mousePressed(MouseEvent e){
                           btn8.setForeground(new Color(204, 204, 230));
                           btn8.setBackground(new Color(204, 204, 230));
}
            public void mouseClicked(MouseEvent e) {}public void mouseReleased(MouseEvent e) {}public void mouseEntered(MouseEvent e) {}public void mouseExited(MouseEvent e) {}
         
        });
	    
	    
	    
        
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn1, btn4);
                move(btn1, btn2);
MakhfiKardaneDokmeha();
                MacaneDorost();
                        }
        });
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn2, btn3);
                move(btn2, btn5);
                move(btn2, btn1);
                MakhfiKardaneDokmeha();

                MacaneDorost();
                        }
        });
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn3, btn6);
                move(btn3, btn2);
                MakhfiKardaneDokmeha();

                MacaneDorost();
                        }
        });
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn4, btn5);
                move(btn4, btn1);
                move(btn4, btn7);
                MacaneDorost();
                MakhfiKardaneDokmeha();

                        }
        });
        btn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn5, btn2);
                move(btn5, btn4);
                move(btn5, btn6);
                move(btn5, btn8);
                MacaneDorost();
                MakhfiKardaneDokmeha();

                        }
        });
        btn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn6, btn3);
                move(btn6, btn5);
                move(btn6, btn9);
                MacaneDorost();
                MakhfiKardaneDokmeha();

                        }
        });
        btn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn7, btn8);
                move(btn7, btn4);
                MacaneDorost();
                MakhfiKardaneDokmeha();

                        }
        });
        btn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn8, btn9);
                move(btn8, btn7);
                move(btn8, btn5);
                MacaneDorost();
                MakhfiKardaneDokmeha();

                        }
        });
        btn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                move(btn9, btn6);
                move(btn9, btn8);
                MacaneDorost();
                MakhfiKardaneDokmeha();

                        }
        });
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a =JOptionPane.showConfirmDialog(null,"خواهش ميکنم خارج نشو!!");
   
                if (a ==0){
                    JOptionPane.showMessageDialog(null, "اي بابا!!");
                    new EASYpage2();
                    setVisible(false);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "اي ول!!");

                }
                        }
        });
                stop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b==true){
                    b=false;
                    off(b);
                            
                }
                else{
                    b=true;
                    off(b);
                }
               if (e.getSource()==stop && started == true){
                   started=false;
		   stop.setText("ادامه");
		   stop();
               }
               else if (e.getSource()==stop&& started == false) {
                    started=true;
                    stop.setText("توقف");
                    start();  
            }}
        });
        
        
        
        restart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JayeRandomDokme();
                MacaneDorost();
                MakhfiKardaneDokmeha();
                b=true;
                off(b);
                stop.setVisible(true);
                started=true;
		reset();
                start();
                restart.setText("از نو");
            }
        });


    }
    
    
    
    public void MakhfiKardaneDokmeha(){
    
                 System.out.println(btn8.getText());
                 System.out.println(btn1.getText());

    for (int i=0; i<2;i++){
         if ((btn1.getText()!="")&&(1==Integer.parseInt(btn1.getText()))){              
                    btn1.setForeground(new Color(110, 200, 74));
          }else {btn1.setForeground(new Color(250, 200, 0));}
     
         if((btn2.getText()!="")&&(2==Integer.parseInt(btn2.getText()))){
                    btn2.setForeground(new Color(110, 200, 74));
          }else{btn2.setForeground(new Color(250, 200, 0)); }
 
        if((btn3.getText()!="")&&(3==Integer.parseInt(btn3.getText()))){                   
                    btn3.setForeground(new Color(110, 200, 74));
         }else{btn3.setForeground(new Color(250, 200, 0));}
        
        if((btn4.getText()!="")&&(4==Integer.parseInt(btn4.getText()))){                   
                    btn4.setForeground(new Color(110, 200, 74));
         }else{btn4.setForeground(new Color(250, 200, 0));}
        
         if((btn5.getText()!="")&&(5==Integer.parseInt(btn5.getText()))){                   
                    btn5.setForeground(new Color(110, 200, 74));
         }else{btn5.setForeground(new Color(250, 200, 0));}
         
         if((btn6.getText()!="")&&(6==Integer.parseInt(btn6.getText()))){                   
                    btn6.setForeground(new Color(110, 200, 74));
         }else{btn6.setForeground(new Color(250, 200, 0));}
         
          if((btn7.getText()!="")&&(7==Integer.parseInt(btn7.getText()))){                   
                    btn7.setForeground(new Color(110, 200, 74));
         }else{btn7.setForeground(new Color(250, 200, 0));}
          
         if((btn8.getText()!="")&&(8==Integer.parseInt(btn8.getText()))){                 
                    btn8.setForeground(new Color(110, 200, 74));
         }else{btn8.setForeground(new Color(250, 200, 0));}
    }
    
    }
    
    
    
    
    
    
    public void JayeRandomDokme(){
          Random rand = new Random();

    ArrayList<String> list1=new ArrayList<>();   
    for (int i =1;i<9;i++){    
    list1.add(Integer.toString(i));
    }
            System.out.println(list1.toString());

    
    int Adad1 = rand.nextInt(8);
    String Number1 = list1.get(Adad1);
    list1.remove(Number1);

    int Adad2 = rand.nextInt(7);
    String Number2 = list1.get(Adad2);
    list1.remove(Number2);

    int Adad3 = rand.nextInt(6);
    String Number3 = list1.get(Adad3);
    list1.remove(Number3);

    int Adad4 = rand.nextInt(5);
    String Number4 = list1.get(Adad4);
    list1.remove(Number4);

    int Adad5 = rand.nextInt(4);
    String Number5 = list1.get(Adad5);
    list1.remove(Number5);

    int Adad6 = rand.nextInt(3);
    String Number6 = list1.get(Adad6);
    list1.remove(Number6);

    int Adad7 = rand.nextInt(2);
    String Number7 = list1.get(Adad7);
    list1.remove(Number7);

    int Adad8 = rand.nextInt(1);
    String Number8 = list1.get(Adad8);
    list1.remove(Number8);

    String Number9 = "";
    
        btn1.setText(Number1);
        btn2.setText(Number2);
        btn3.setText(Number3);    
        btn4.setText(Number4);
        btn5.setText(Number5);
        btn6.setText(Number6);         
        btn7.setText(Number7);
        btn8.setText(Number8);        
        btn9.setText(Number9);        

    }
    
    
    
    
    
    
    
        public void move(JButton button1,JButton button2){
        if (button2.getText() == "")
        {
            button2.setText(button1.getText());
            button1.setText("");
        }
}

    

    
    public void MacaneDorost(){

        for (int i=0; i<2;i++){
         if ((btn1.getText()!="")&&(1==Integer.parseInt(btn1.getText()))){              
                    btn1.setBackground(new Color(110, 200, 74));
          }else {btn1.setBackground(new Color(250, 200, 0));}
     
         if((btn2.getText()!="")&&(2==Integer.parseInt(btn2.getText()))){
                    btn2.setBackground(new Color(110, 200, 74));
          }else{btn2.setBackground(new Color(250, 200, 0)); }
 
        if((btn3.getText()!="")&&(3==Integer.parseInt(btn3.getText()))){                   
                    btn3.setBackground(new Color(110, 200, 74));
         }else{btn3.setBackground(new Color(250, 200, 0));}
        
        if((btn4.getText()!="")&&(4==Integer.parseInt(btn4.getText()))){                   
                    btn4.setBackground(new Color(110, 200, 74));
         }else{btn4.setBackground(new Color(250, 200, 0));}
        
         if((btn5.getText()!="")&&(5==Integer.parseInt(btn5.getText()))){                   
                    btn5.setBackground(new Color(110, 200, 74));
         }else{btn5.setBackground(new Color(250, 200, 0));}
         
         if((btn6.getText()!="")&&(6==Integer.parseInt(btn6.getText()))){                   
                    btn6.setBackground(new Color(110, 200, 74));
         }else{btn6.setBackground(new Color(250, 200, 0));}
         
          if((btn7.getText()!="")&&(7==Integer.parseInt(btn7.getText()))){                   
                    btn7.setBackground(new Color(110, 200, 74));
         }else{btn7.setBackground(new Color(250, 200, 0));}
          
         if((btn8.getText()!="")&&(8==Integer.parseInt(btn8.getText()))){                 
                    btn8.setBackground(new Color(110, 200, 74));
         }else{btn8.setBackground(new Color(250, 200, 0));}
    }
        
        
         btn9.setBackground(new Color(250, 200, 0));

    
     if (btn9.getText()==""&&btn8.getText()!=""&&btn1.getText()!=""&&btn2.getText()!=""&&btn3.getText()!=""&&btn4.getText()!=""&&btn5.getText()!=""&&btn6.getText()!=""&&btn7.getText()!=""&&1==Integer.parseInt(btn1.getText())&&2==Integer.parseInt(btn2.getText())&&3==Integer.parseInt(btn3.getText())&&4==Integer.parseInt(btn4.getText())&&5==Integer.parseInt(btn5.getText())&&6==Integer.parseInt(btn6.getText())&&7==Integer.parseInt(btn7.getText())&&8==Integer.parseInt(btn8.getText())){
        String ssss= JOptionPane.showInputDialog(null, "تو بردي  توخيلي خوبي  حالا اسمت رو بنويس:","نام",PLAIN_MESSAGE);

                System.out.println(ssss);
        } 
        
    }
    
}

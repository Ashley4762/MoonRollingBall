package Lib;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
    
public class RollingBall extends JPanel implements ActionListener {

    int x = 100;
    int y = 90;
    int start_angle = 0 ;
    int ball_siza = 80 ; 
    
    public RollingBall(){
        Timer t = new Timer(50, this);
        t.start();
  
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x,y,ball_siza,ball_siza);
        g.fillArc(x,y,ball_siza,ball_siza,start_angle,180);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        x -= 2 ; 
        start_angle+=4;
        if(x<=-ball_siza)x= getWidth();
        if(start_angle>=360)start_angle = 0 ;
        repaint();;
    }
    
    
 }


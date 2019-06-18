package text1;


import javax.swing.JFrame;  

/** 
* 生命游戏 
*  
*/  

public class LifeGame extends JFrame{  

  
private static final long serialVersionUID = -1660060555234651445L;  

LifeGame(){  
	TimeClass timeclass=new TimeClass();
    this.setSize(630,600);  
    this.setTitle("生命游戏[LifeGame]DEMO");  
    this.add(timeclass.wordmap);  
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    this.setLocationRelativeTo(null);  
    this.setResizable(false);  
}  
  
public static void main(String[] args){  
    LifeGame game = new LifeGame();  
    game.setVisible(true);  
}  

}
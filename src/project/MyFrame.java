package project;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

 
public class MyFrame extends JFrame {

    //생성자
    public MyFrame() {
    	
    	
        //타이틀 생성
        setTitle("Main");

        //버튼 생성
        JButton b1 = new JButton("START");
        JButton b2 = new JButton("EXIT");
        
        setSize(200,400); //크기 설정
        
        //컴포넌트 생성 및 추가
        this.add(b1);
        this.add(b2);
        

        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //닫은 후 프로그램 종료
        

        setLayout(null); //배치 관리자 설정
        // setLayout(null);을 해줌으로써 수동으로 크기 조절 가능
        b1.setBounds(45, 100, 100, 30);
        b2.setBounds(45, 150, 100, 30);
        
        setVisible(true);

        b1.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		new Tetris();
        		
        		
        	}
        });

        
        b2.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		System.exit(0);
        	}
        });
         }

    //실행창
    public static void main(String[] args) {
        new MyFrame();
    }

 
}
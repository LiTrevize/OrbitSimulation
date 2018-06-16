package universe;

import general.Accy;
import general.constant;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class Chart1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chart1 frame = new Chart1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Chart1() {
		setTitle("\u8F68\u9053\u7CFB\u7EDF\u6A21\u62DF\uFF08\u5730\u7403\uFF09");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u8F68\u9053\u534A\u5F84\uFF1A");
		label.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label.setForeground(Color.WHITE);
		label.setBounds(22, 434, 100, 30);
		contentPane.add(label);
		
		JLabel d = new JLabel("");
		d.setForeground(Color.WHITE);
		d.setFont(new Font("华文楷体", Font.PLAIN, 20));
		d.setBounds(132, 434, 120, 30);
		contentPane.add(d);
		
		JLabel lblAu = new JLabel("Au");
		lblAu.setForeground(Color.WHITE);
		lblAu.setFont(new Font("华文楷体", Font.PLAIN, 20));
		lblAu.setBounds(262, 434, 27, 30);
		contentPane.add(lblAu);
		
		JLabel label_1 = new JLabel("\u8868\u9762\u6E29\u5EA6\uFF1A");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_1.setBounds(22, 575, 100, 30);
		contentPane.add(label_1);
		
		JLabel T = new JLabel("");
		T.setForeground(Color.WHITE);
		T.setFont(new Font("华文楷体", Font.PLAIN, 20));
		T.setBounds(132, 575, 120, 30);
		contentPane.add(T);
		
		JLabel lblK = new JLabel("K");
		lblK.setForeground(Color.WHITE);
		lblK.setFont(new Font("华文楷体", Font.PLAIN, 20));
		lblK.setBounds(262, 575, 27, 30);
		contentPane.add(lblK);
		
		JLabel t = new JLabel("");
		t.setForeground(Color.WHITE);
		t.setFont(new Font("华文楷体", Font.PLAIN, 20));
		t.setBounds(299, 575, 58, 30);
		contentPane.add(t);
		
		JLabel label_2 = new JLabel("\u2103");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_2.setBounds(367, 575, 27, 30);
		contentPane.add(label_2);
		
		JLabel lblk = new JLabel("\u6052\u661F\u8D28\u91CF\uFF1A");
		lblk.setForeground(Color.WHITE);
		lblk.setFont(new Font("华文楷体", Font.PLAIN, 20));
		lblk.setBounds(41, 35, 100, 30);
		contentPane.add(lblk);
		
		JLabel label_3 = new JLabel("\u91CD\u529B\u52A0\u901F\u5EA6\uFF1A");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_3.setBounds(407, 75, 120, 30);
		contentPane.add(label_3);
		
		JLabel sg = new JLabel("");
		sg.setForeground(Color.WHITE);
		sg.setFont(new Font("华文楷体", Font.PLAIN, 20));
		sg.setBounds(517, 75, 105, 30);
		contentPane.add(sg);
		
		JLabel lblMs = new JLabel("m/s^2");
		lblMs.setForeground(Color.WHITE);
		lblMs.setFont(new Font("华文楷体", Font.PLAIN, 20));
		lblMs.setBounds(632, 75, 58, 30);
		contentPane.add(lblMs);
		
		JLabel label_4 = new JLabel("\u6052\u661F\u8868\u9762\u6E29\u5EA6\uFF1A5770K");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_4.setBounds(41, 75, 196, 30);
		contentPane.add(label_4);
		
		JLabel Sm = new JLabel("");
		Sm.setForeground(Color.WHITE);
		Sm.setFont(new Font("华文楷体", Font.PLAIN, 20));
		Sm.setBounds(148, 35, 105, 30);
		contentPane.add(Sm);
		
		JLabel lblEm = new JLabel("\u5730\u7403\u8D28\u91CF");
		lblEm.setForeground(Color.WHITE);
		lblEm.setFont(new Font("华文楷体", Font.PLAIN, 20));
		lblEm.setBounds(253, 35, 84, 30);
		contentPane.add(lblEm);
		
		JLabel label_5 = new JLabel("\u5730\u7403\u8D28\u91CF");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_5.setBounds(619, 35, 84, 30);
		contentPane.add(label_5);
		
		JLabel Pm = new JLabel("");
		Pm.setForeground(Color.WHITE);
		Pm.setFont(new Font("华文楷体", Font.PLAIN, 20));
		Pm.setBounds(517, 35, 102, 30);
		contentPane.add(Pm);
		
		JLabel label_7 = new JLabel("\u661F\u7403\u8D28\u91CF\uFF1A");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_7.setBounds(407, 35, 100, 30);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\u6700\u5927\u5DEE\u503C:");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_8.setBounds(22, 462, 84, 30);
		contentPane.add(label_8);
		
		JLabel delta = new JLabel("");
		delta.setForeground(Color.WHITE);
		delta.setFont(new Font("华文楷体", Font.PLAIN, 20));
		delta.setBounds(116, 462, 136, 30);
		contentPane.add(delta);
		
		JLabel lblKm = new JLabel("km");
		lblKm.setForeground(Color.WHITE);
		lblKm.setFont(new Font("华文楷体", Font.PLAIN, 20));
		lblKm.setBounds(262, 462, 27, 30);
		contentPane.add(lblKm);
		
		JLabel label_6 = new JLabel("\u6700\u5C0F\u76F8\u5BF9\u503C");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_6.setBounds(22, 489, 119, 30);
		contentPane.add(label_6);
		
		JLabel label_9 = new JLabel("\u6700\u5927\u76F8\u5BF9\u503C");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_9.setBounds(226, 489, 111, 30);
		contentPane.add(label_9);
		
		JLabel rmin = new JLabel("");
		rmin.setForeground(Color.WHITE);
		rmin.setFont(new Font("华文楷体", Font.PLAIN, 20));
		rmin.setBounds(126, 489, 100, 30);
		contentPane.add(rmin);
		
		JLabel rmax = new JLabel("");
		rmax.setForeground(Color.WHITE);
		rmax.setFont(new Font("华文楷体", Font.PLAIN, 20));
		rmax.setBounds(333, 489, 93, 30);
		contentPane.add(rmax);
		
		JLabel label_10 = new JLabel("\u6700\u5927\u5DEE\u503C:");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_10.setBounds(22, 606, 84, 30);
		contentPane.add(label_10);
		
		JLabel delta1 = new JLabel("");
		delta1.setForeground(Color.WHITE);
		delta1.setFont(new Font("华文楷体", Font.PLAIN, 20));
		delta1.setBounds(116, 606, 136, 30);
		contentPane.add(delta1);
		
		JLabel K = new JLabel("K");
		K.setForeground(Color.WHITE);
		K.setFont(new Font("华文楷体", Font.PLAIN, 20));
		K.setBounds(262, 606, 27, 30);
		contentPane.add(K);
		
		JLabel label_13 = new JLabel("\u6700\u5927\u76F8\u5BF9\u503C");
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_13.setBounds(232, 633, 105, 30);
		contentPane.add(label_13);
		
		JLabel Tmin = new JLabel("");
		Tmin.setForeground(Color.WHITE);
		Tmin.setFont(new Font("华文楷体", Font.PLAIN, 20));
		Tmin.setBounds(126, 633, 100, 30);
		contentPane.add(Tmin);
		
		JLabel label_15 = new JLabel("\u6700\u5C0F\u76F8\u5BF9\u503C");
		label_15.setForeground(Color.WHITE);
		label_15.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_15.setBounds(22, 633, 100, 30);
		contentPane.add(label_15);
		
		JLabel Tmax = new JLabel("");
		Tmax.setForeground(Color.WHITE);
		Tmax.setFont(new Font("华文楷体", Font.PLAIN, 20));
		Tmax.setBounds(333, 633, 93, 30);
		contentPane.add(Tmax);
		
		Astrobody a=new Astrobody(1);
		Astrobody b=new Astrobody(333445);
		a.R[2]=-constant.AU;a.v[1]=29.783;a.r=6400;a.getsurfaceg();
		b.surfaceT=6000;b.r=695500;
		Solsystem sol=new Solsystem();
		sol.body=new Astrobody[2];
		sol.body[0]=b;sol.body[1]=a;
		sol.getT(a);
		double T0=a.surfaceT;
		double rs[]=new double[2];double Ts[]=new double[2];		
		rs[0]=sol.getd(a);rs[1]=sol.getd(a);Ts[0]=a.surfaceT;Ts[1]=a.surfaceT;
		
		Thread play=new Thread(){
			public void run(){
				
				Graphics g=contentPane.getGraphics();
				g.setColor(Color.YELLOW);
				double k=1000000;
				double i=0;
				
				g.fillOval(500-10, 400-10, 20, 20);
				g.setColor(Color.white);
				g.fillOval(500-5+(int)(a.R[1]/k),(int)(400-5+a.R[2]/k) , 10, 10);
		while(true){
			
			g.setColor(Color.black);
			g.fillOval(500-5+(int)(a.R[1]/k),(int)(400-5+a.R[2]/k) , 10, 10);
			sol.orbit(10000);sol.getT(a);
			d.setText(Double.toString(sol.getd(a)));
			T.setText(Double.toString(a.surfaceT));
			t.setText(Double.toString(a.surfaceT-273.15));
			sg.setText(Double.toString(a.getsurfaceg()));;
			Sm.setText(Double.toString(b.m));
			Pm.setText(Double.toString(a.m));
			if(sol.getd(a)<=rs[0]){
				rs[0]=sol.getd(a);
			};if(sol.getd(a)>=rs[1]){
				rs[1]=sol.getd(a);
			}
			rmin.setText(Double.toString(rs[0]-constant.AU));rmax.setText(Double.toString(rs[1]-constant.AU));
			delta.setText(Double.toString(rs[1]-rs[0]));
			if(a.surfaceT<=Ts[0]){
				Ts[0]=a.surfaceT;
			};if(a.surfaceT>=Ts[1]){
				Ts[1]=a.surfaceT;
			}
			Tmin.setText(Double.toString(Ts[0]-T0));Tmax.setText(Double.toString(Ts[1]-T0));
			delta1.setText(Double.toString(Ts[1]-Ts[0]));
			//System.out.print(a.getsurfaceg());
			g.setColor(Color.white);
			g.fillOval(500-5+(int)(a.R[1]/k),(int)(400-5+a.R[2]/k) , 10, 10);
			g.fillOval((int)(100+i),(int)(550-(sol.getd(a)-constant.AU)/10000) , 2, 2);
			g.fillOval((int)(100+i),(int)(700-(a.surfaceT-T0)*50) , 2, 2);
			i=i+0.05;
			
			
			try {
				this.sleep(5);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		}
	};
		JButton btnStart = new JButton("Start");
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				play.start();
			}
		});
		btnStart.setBounds(865, 702, 93, 23);
		contentPane.add(btnStart);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.BLACK);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("华文楷体", Font.PLAIN, 16));
		textArea.setText("\u56FE\u50CF\u6570\u503C\u653E\u5927\u500D\u7387");
		textArea.setBounds(22, 517, 74, 46);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("0.0001X");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(32, 557, 64, 23);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea2 = new JTextArea();
		textArea2.setText("\u56FE\u50CF\u6570\u503C\u653E\u5927\u500D\u7387");
		textArea2.setLineWrap(true);
		textArea2.setForeground(Color.WHITE);
		textArea2.setFont(new Font("华文楷体", Font.PLAIN, 16));
		textArea2.setBackground(Color.BLACK);
		textArea2.setBounds(22, 660, 74, 46);
		contentPane.add(textArea2);
		
		JLabel lblx = new JLabel("50X");
		lblx.setHorizontalAlignment(SwingConstants.CENTER);
		lblx.setForeground(Color.WHITE);
		lblx.setFont(new Font("宋体", Font.PLAIN, 16));
		lblx.setBounds(32, 700, 64, 23);
		contentPane.add(lblx);
		
		JLabel label_11 = new JLabel("\u65F6\u95F4\u52A0\u901F\uFF1A");
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_11.setBounds(865, 645, 109, 30);
		contentPane.add(label_11);
		
		JLabel lblx_1 = new JLabel("2000000X");
		lblx_1.setForeground(Color.WHITE);
		lblx_1.setFont(new Font("华文楷体", Font.PLAIN, 20));
		lblx_1.setBounds(869, 672, 105, 30);
		contentPane.add(lblx_1);
		

		

		

		
		
		
		
		
		
		
		
		
		
		

	}
}

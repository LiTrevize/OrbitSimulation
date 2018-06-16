package universe;

import general.constant;
import general.vector;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Chart2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chart2 frame = new Chart2();
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
	public Chart2() {
		setTitle("\u8F68\u9053\u7CFB\u7EDF\u6A21\u62DF\uFF08\u53CC\u661F\uFF09");
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
		
		JLabel lblk_1 = new JLabel("\u6052\u661F\u8868\u9762\u6E29\u5EA6\uFF1A5800K");
		lblk_1.setForeground(Color.WHITE);
		lblk_1.setFont(new Font("华文楷体", Font.PLAIN, 20));
		lblk_1.setBounds(41, 97, 196, 30);
		contentPane.add(lblk_1);
		
		JLabel Sm = new JLabel("300000");
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
		rmax.setBounds(333, 489, 174, 30);
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
		
		JLabel label_13 = new JLabel("\u6700\u5927\u503C");
		label_13.setForeground(Color.WHITE);
		label_13.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_13.setBounds(232, 633, 64, 30);
		contentPane.add(label_13);
		
		JLabel Tmin = new JLabel("");
		Tmin.setForeground(Color.WHITE);
		Tmin.setFont(new Font("华文楷体", Font.PLAIN, 20));
		Tmin.setBounds(92, 633, 100, 30);
		contentPane.add(Tmin);
		
		JLabel label_15 = new JLabel("\u6700\u5C0F\u503C");
		label_15.setForeground(Color.WHITE);
		label_15.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_15.setBounds(22, 633, 74, 30);
		contentPane.add(label_15);
		
		JLabel Tmax = new JLabel("");
		Tmax.setForeground(Color.WHITE);
		Tmax.setFont(new Font("华文楷体", Font.PLAIN, 20));
		Tmax.setBounds(299, 633, 84, 30);
		contentPane.add(Tmax);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.BLACK);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("华文楷体", Font.PLAIN, 16));
		textArea.setText("\u56FE\u50CF\u6570\u503C\u653E\u5927\u500D\u7387");
		textArea.setBounds(22, 517, 74, 46);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("0.0000002X");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(32, 557, 90, 23);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea2 = new JTextArea();
		textArea2.setText("\u56FE\u50CF\u6570\u503C\u653E\u5927\u500D\u7387");
		textArea2.setLineWrap(true);
		textArea2.setForeground(Color.WHITE);
		textArea2.setFont(new Font("华文楷体", Font.PLAIN, 16));
		textArea2.setBackground(Color.BLACK);
		textArea2.setBounds(22, 660, 74, 46);
		contentPane.add(textArea2);
		
		JLabel lblx = new JLabel("1X");
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
		
		JLabel label_12 = new JLabel("\u2103");
		label_12.setForeground(Color.WHITE);
		label_12.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_12.setBounds(380, 633, 27, 30);
		contentPane.add(label_12);
		
		JLabel label_14 = new JLabel("\u2103");
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_14.setBounds(202, 633, 27, 30);
		contentPane.add(label_14);
		
		JLabel label_16 = new JLabel("\u6052\u661F\u8D28\u91CF\uFF1A");
		label_16.setForeground(Color.WHITE);
		label_16.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_16.setBounds(41, 63, 100, 30);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("250000");
		label_17.setForeground(Color.WHITE);
		label_17.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_17.setBounds(148, 63, 105, 30);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("\u5730\u7403\u8D28\u91CF");
		label_18.setForeground(Color.WHITE);
		label_18.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_18.setBounds(253, 63, 84, 30);
		contentPane.add(label_18);
		
		JLabel lblk_2 = new JLabel("\u6052\u661F\u8868\u9762\u6E29\u5EA6\uFF1A5500K");
		lblk_2.setForeground(Color.WHITE);
		lblk_2.setFont(new Font("华文楷体", Font.PLAIN, 20));
		lblk_2.setBounds(41, 123, 196, 30);
		contentPane.add(lblk_2);
		
		JLabel label_4 = new JLabel("\u65E5\u5FC3\u8DDD\uFF1A");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_4.setBounds(41, 150, 81, 30);
		contentPane.add(label_4);
		
		JLabel sd = new JLabel("0");
		sd.setForeground(Color.WHITE);
		sd.setFont(new Font("华文楷体", Font.PLAIN, 20));
		sd.setBounds(132, 150, 120, 30);
		contentPane.add(sd);
		
		JLabel label_19 = new JLabel("Au");
		label_19.setForeground(Color.WHITE);
		label_19.setFont(new Font("华文楷体", Font.PLAIN, 20));
		label_19.setBounds(262, 150, 27, 30);
		contentPane.add(label_19);
		
		Astrobody a=new Astrobody(2);
		Astrobody b=new Astrobody(300000);
		Astrobody c=new Astrobody(250000);
		a.R[2]=-2*constant.AU;a.v[1]=-30;a.r=8000;a.getsurfaceg();
		b.surfaceT=5800;b.r=660000;b.R[1]=-constant.AU*5/11;b.v[2]=c.m/15000;
		c.surfaceT=5500;c.r=630000;c.R[1]=constant.AU*6/11;c.v[2]=-b.m/15000;
		Solsystem sol=new Solsystem();
		sol.body=new Astrobody[3];
		sol.body[0]=b;sol.body[1]=c;sol.body[2]=a;
		sol.getT(a,2);
		double T0=a.surfaceT;
		double rs[]=new double[2];double Ts[]=new double[2];		
		rs[0]=sol.getd(a);rs[1]=sol.getd(a);Ts[0]=a.surfaceT;Ts[1]=a.surfaceT;
		
		Thread play=new Thread(){
			public void run(){
				
				Graphics g=contentPane.getGraphics();
				g.setColor(Color.YELLOW);
				double k=1500000;
				double i=0;
				
				g.fillOval(500-10+(int)(b.R[1]/k), 400-10+(int)(b.R[2]/k), 20, 20);
				g.fillOval(500-7+(int)(c.R[1]/k), 400-7+(int)(c.R[2]/k), 14, 14);
				g.setColor(Color.white);
				g.fillOval(500-5+(int)(a.R[1]/k),(int)(400-5+a.R[2]/k) , 10, 10);
				
				
		while(true){
			
			g.setColor(Color.black);
			g.fillOval(500-10+(int)(b.R[1]/k), 400-10+(int)(b.R[2]/k), 20, 20);
			g.fillOval(500-7+(int)(c.R[1]/k), 400-7+(int)(c.R[2]/k), 14, 14);
			if((a.R[1]/k<0)&&(a.R[2]/k>0)){
				
			}else{
				g.fillOval(500-5+(int)(a.R[1]/k),(int)(400-5+a.R[2]/k) , 10, 10);
			}
			sol.move(10000);sol.getT(a,2);
			sd.setText(Double.toString(vector.magnitude(vector.minus(b.R, c.R))));
			d.setText(Double.toString(sol.getd(a)));
			T.setText(Double.toString(a.surfaceT));
			t.setText(Double.toString(a.surfaceT-273.15));
			sg.setText(Double.toString(a.getsurfaceg()));;
			Sm.setText(Double.toString(b.m));
			Pm.setText(Double.toString(a.m));
			if(vector.magnitude(vector.minus(a.R, sol.barycenter()))<=rs[0]){
				rs[0]=vector.magnitude(vector.minus(a.R, sol.barycenter()));
			};if(vector.magnitude(vector.minus(a.R, sol.barycenter()))>=rs[1]){
				rs[1]=vector.magnitude(vector.minus(a.R, sol.barycenter()));
			}
			rmin.setText(Double.toString(rs[0]-2*constant.AU));rmax.setText(Double.toString(rs[1]-2*constant.AU));
			delta.setText(Double.toString(rs[1]-rs[0]));
			if(a.surfaceT<=Ts[0]){
				Ts[0]=a.surfaceT;
			};if(a.surfaceT>=Ts[1]){
				Ts[1]=a.surfaceT;
			}
			Tmin.setText(Double.toString(Ts[0]-273));Tmax.setText(Double.toString(Ts[1]-273));
			delta1.setText(Double.toString(Ts[1]-Ts[0]));
			//System.out.println(b.R[1]);
			g.setColor(Color.YELLOW);
			g.fillOval(500-10+(int)(b.R[1]/k), 400-10+(int)(b.R[2]/k), 20, 20);
			g.fillOval(500-7+(int)(c.R[1]/k), 400-7+(int)(c.R[2]/k), 14, 14);
			g.setColor(Color.white);
			g.fillOval((int)(100+i),(int)(550-(sol.getd(a)-2*constant.AU)/5000000) , 2, 2);
			g.fillOval((int)(100+i),(int)(700-(a.surfaceT-T0)*1) , 2, 2);
			if((a.R[1]/k<0)&&(a.R[2]/k>0)){
				
			}else{
			g.fillOval(500-5+(int)(a.R[1]/k),(int)(400-5+a.R[2]/k) , 10, 10);
			}
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
		
		
	}

}

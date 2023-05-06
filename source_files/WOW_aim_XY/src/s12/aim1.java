package s12;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
//import java.awt.Dimension;
import java.awt.TextField;

public class aim1 extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextField smoke_len_textbox;
	private TextField flight_time_textbox;
	private TextField angle_textbox;
	private double smoke_f;
	private double flight_time_f;
	//private double angle_f;
	
	//private Label test_txt;
	
	//constructor
	public aim1() {
		//close window
	    addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent windowEvent){
	           dispose();
	        }        
	    });
		//close window end

	    //UI setting
		Font font = new Font("Arial", Font.PLAIN, 21);//word size
		//Dimension d = new Dimension(200,70);
		
	    //window size & name setting
		setTitle("The name for the windows");
	    setSize(430,500);
		setLayout(null); // auto-> new FlowLayout()
		setVisible(true);
		
		//content
		//Calculate button
		Button x1 = new Button("Calculate");
		x1.setBounds(50, 250, 100, 30);
		add(x1);
		
		//Reset button
		Button x2 = new Button("Reset");
		x2.setBounds(150, 250, 100, 30);
		add(x2);
		
		Button x3 = new Button("CC");
		x3.setBounds(250,250,50,30);
		add(x3);
		
		//Row1 - flight time
		Label f_time_l = new Label("Please Enter Time of Flight");
		f_time_l.setFont(font);
		flight_time_textbox = new TextField(50);
		f_time_l.setBounds(50,50,2000,30);
		flight_time_textbox.setFont(font);
		flight_time_textbox.setBounds(50,100,200,32);
		add(f_time_l);
		add(flight_time_textbox);
		
		//Row2 - smoke length
		//Frame frame = new Frame("123");
		Label smoke_l = new Label("Please Enter Smoke Length:");
		smoke_len_textbox = new TextField(100);
		smoke_l.setFont(font);
		smoke_l.setBounds(50,150,2000,30);
		
		smoke_len_textbox.setFont(font);
		smoke_len_textbox.setBounds(50,200,200,32);
		add(smoke_l);
		add(smoke_len_textbox);
		
		//Row3 - angle
		Label angle_l = new Label("Please Enter Enemy Ship's Angle");
		angle_textbox = new TextField(50);
		angle_l.setBounds(100,300,200,20);
		angle_textbox.setBounds(100,350,200,20);
		//add(angle_l);
		//add(angle_textbox);
		
		//Row 4 - calculate output
		Label result = new Label("Advance amount (from the ship center):");
		result.setFont(font);
		result.setBounds(50,300,2000,30);
		add(result);
		Label ad_txt_1 = new Label("null");
		ad_txt_1.setFont(font);
		ad_txt_1.setBounds(50,350,2000,30);
		add(ad_txt_1);
		Label ad_txt_2 = new Label("null");
		ad_txt_2.setFont(font);
		ad_txt_2.setBounds(50,400,2000,30);
		add(ad_txt_2);
		//content end
		
		//acquire number
        x1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String smoke_txt = smoke_len_textbox.getText();
                String flight_time_txt = flight_time_textbox.getText();
                //String angle_txt = angle_textbox.getText();
                
                smoke_f = Double.parseDouble(smoke_txt);
                flight_time_f = Double.parseDouble(flight_time_txt);
                //angle_f = Double.parseDouble(angle_txt);
                
        		//calculation
        		double ad_dis = flight_time_f/3.6;
        		int digits = 1;
        		double ad_dis_r = Math.round(ad_dis * Math.pow(10, digits)) / Math.pow(10, digits);
        		double ad_dis_cell_r = Math.round((ad_dis*smoke_f) * Math.pow(10, digits)) / Math.pow(10, digits);
        		//test output
                ad_txt_1.setText(String.valueOf(ad_dis_r)+" time smoke length");
                ad_txt_2.setText(String.valueOf(ad_dis_cell_r)+" cells");
            }
        });
        
        //Reset button setting
        x2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
  
                //smoke_f = 0.0;
                flight_time_f = 0.0;
                //angle_f = 0.0;
                
        		//test output
                ad_txt_1.setText("Please Re-Enter");
                ad_txt_2.setText("Please Re-Enter");
        		//test_txt.setBounds(100,600,200,20);
        		//add(test_txt_reset);
            }
        });
        //Reset button setting end
        
        //clear button setting
        x3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //smoke_f = 0.0;
                flight_time_f = 0.0;
                //angle_f = 0.0;
                
                smoke_len_textbox.setText("");
            	flight_time_textbox.setText("");
            	angle_textbox.setText("");
                
        		//output
            	ad_txt_1.setText("Please Re-Enter");
            	ad_txt_2.setText("Please Re-Enter");
            }
        });
        //clear button setting end

	}
	
	//main program
    public static void main(String[] args) {
    	new aim1();
    }
}

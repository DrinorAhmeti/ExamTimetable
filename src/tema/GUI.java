package tema;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory; 
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class GUI implements ActionListener {
private static JButton btn;
private static JButton btn1;
private static JButton bt;
private static JTable table;
private static JTable table1;
private static JPanel panel;
private static JPanel panel1;
private static JFrame frame;
private static JScrollPane scroll_table;
private static JScrollPane scroll_table1;
static List<TableScore> score ;
static List<TableScore> tab;
static List<OrariLenda> zero;
static List<OrariLenda> finaltable;
public static String FileName;





    public static String getFileName() {
	return FileName;
}




public static void setFileName(String fileName) {
	FileName = fileName;
}




	public static void main(String[] args) {
    	 /*final JFrame frame = new JFrame("JTable Demo");
    	 OrariLenda o = new OrariLenda();
    	 List<OrariLenda> orari=o.OrariFillestarV1();
    	// List<Object> objectList = new ArrayList<Object>(orari);
    	 
    	 
         String[] columns = {"id", "lenda", "java", "dita",
                             "perioda", "semestri"};
         Object object[][] = new Object[100][100];
         Object[][] data = {
        		// { orari.get(0),1,1,1,1},
             {1, "CITYGROUP", 1, 1, 1, 1},
             {1, "CITYGROUP", 1, 1, 1, 1},
             {1, "CITYGROUP", 1, 1, 1, 1},
             
         };
         for(int i=0;i<orari.size();i++) {
        	 object[i][0] = orari.get(i).getId();
        	 object[i][1] = orari.get(i).getLenda();
        	 object[i][2] = orari.get(i).getJava();
        	 object[i][3] = orari.get(i).getDita();
        	 object[i][4] = orari.get(i).getPerioda();
        	 object[i][5] = orari.get(i).getSemestri();
        	 
        	// JTable table = new JTable(object, columns);
        	 
        	 
         }

         
      //   button.addActionListener(null);
       
         JLabel lblHeading = new JLabel("Stock Quotes");
         //lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,24));

         frame.getContentPane().setLayout(new BorderLayout());
         JTable table = new JTable(object, columns);
         JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        
        JButton button = new JButton("Beep me");
        frame.setVisible(true);
        frame.setSize(300, 200);
        frame.add(button);
        
         frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
         frame.getContentPane().add(scrollPane,BorderLayout.CENTER);

         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 200);
         frame.setVisible(true);*/
    	OrariLenda o = new OrariLenda();
    	alokimi a=new alokimi();
    	GUI g=new GUI();
		 List<OrariLenda> orariInicial=o.OrariPerfundumtar();
		 TableScore sc=new TableScore();
		  score =sc.WholeScoreTable(orariInicial);
		 tab=sc.ExtractfromTable(orariInicial);
		  zero= sc.MakeZero(orariInicial,tab);
		   finaltable = sc.finalTable(zero,orariInicial);
		   List<alokimi> ShperndarjaSalla =a.ALokimeNeSalla(finaltable);

    	 panel = new JPanel();
    	
    	 frame = new JFrame("Exam Timetable");
    	//frame.setSize(100,100);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    
    
    	frame.setVisible(true);
    	frame.add(panel);
    	
    	panel.setLayout(null);
    	
    	bt = new JButton("Upload");
    	bt.setBounds(10,20,100,30);
    	panel.add(bt);
    	 bt.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent ae) {
        		 table=new JTable();
        		 table1=new JTable();
        		 panel.add(table);
        		 panel.add(table1);
        		 scroll_table = new JScrollPane(table);            // add table to scroll panel
        	    	scroll_table.setBounds(130, 20, 1000, 600);
        	    	panel.add(scroll_table);
        	    	 scroll_table1 = new JScrollPane(table1);            // add table to scroll panel
        	    	 scroll_table1.setBounds(130, 20, 1000, 600);
         	    	panel.add(scroll_table1);
         	    	
         	    	
         	    	JFileChooser chooser = new JFileChooser();
         	    	chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
         	    	int returnVal = chooser.showOpenDialog(bt);
         	    	if(returnVal == JFileChooser.APPROVE_OPTION) {
         	    	   System.out.println("You chose to open this directory: " +
         	    	        chooser.getSelectedFile().getAbsolutePath());
         	    	   g.setFileName(chooser.getSelectedFile().getAbsolutePath());
         	    	   
         	    	
         	    	}
         	    	
         	    	
         	    // Open the save dialog
         	    	chooser.showSaveDialog(null);
        		
        	 }
        	 });
    	
    	btn = new JButton("Timetable");
    	btn.setBounds(10,200,100,30);
    	panel.add(btn);
    	
    	// Add action listener for Alpha.
    	 btn.addActionListener(new ActionListener() {
    	 public void actionPerformed(ActionEvent ae) {
    	
    		
	   	 List<OrariLenda> orari=finaltable;
    			String[] columns = { "Course","Teacher", "Week", "Day",
    	                "Period", "Semester"};
    	Object object[][] = new Object[110][110];
    	
    	for(int i=0;i<orari.size();i++) {
    	
    	object[i][0] = orari.get(i).getLenda();
    	object[i][1] = orari.get(i).getProfesori();
    	
    	//object[i][2] = orari.get(i).getProfesori();
    	object[i][2] = orari.get(i).getJava();
    	object[i][4] = orari.get(i).getPerioda();
    	object[i][5] = orari.get(i).getSemestri();
        
    	if(orari.get(i).getDita()==1) {
    		object[i][3] ="E Hene";
    	}else if(orari.get(i).getDita()==2) {
    		object[i][3] ="E Marte";
    	}else if(orari.get(i).getDita()==3) {
    		object[i][3] ="E Merkure";
    	}else if(orari.get(i).getDita()==4) {
    		object[i][3] ="E Enjte";
    	}else if(orari.get(i).getDita()==5) {
    		object[i][3] ="E Premte";
    	}

    	}
    	//   button.addActionListener(null);

    	//lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,24));


        
        panel.remove(table1);
        panel.remove(scroll_table1);
        panel.remove(table);
        panel.remove(scroll_table);
    	table = new JTable(object, columns);
    	table.setBounds(130,20,500,600);
    	table.setAutoCreateRowSorter(true);
    	table.getColumnModel().getColumn(0).setPreferredWidth(175);
    	table.getColumnModel().getColumn(1).setPreferredWidth(50);
    	table.getColumnModel().getColumn(2).setPreferredWidth(25);
    	table.getColumnModel().getColumn(3).setPreferredWidth(25);
    	table.getColumnModel().getColumn(4).setPreferredWidth(25);
    	table.getColumnModel().getColumn(5).setPreferredWidth(25);
    	
    	panel.add(table);

    	scroll_table = new JScrollPane(table);            // add table to scroll panel
    	scroll_table.setBounds(130, 20, 1000, 600);
    	scroll_table.setVisible(true);
    	panel.add(scroll_table);


    	table.setFillsViewportHeight(true);
    	 }
    	 });
    	
    	 JButton btn1 = new JButton("Rooms");
     	btn1.setBounds(10,260,100,30);
     	//btn.addActionListener(new GUI());
     	panel.add(btn1);
     	
     	 btn1.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent ae) {
        		 
        		
        		
        	   	 List<alokimi> orari=ShperndarjaSalla;
        			String[] columns = { "Course","Teacher", "Week", "Day",
        	                "Period","Room I","Room II","Room III","Room IV","Room V","Room VI",};
        	Object object[][] = new Object[110][110];
        	
        	for(int i=0;i<orari.size();i++) {
        	
        	object[i][0] = orari.get(i).getLenda();
        	object[i][1] = orari.get(i).getProfesori();
        	object[i][2] = orari.get(i).getJava();
        	//object[i][3] = orari.get(i).getDita();
        	object[i][4] = orari.get(i).getPerioda();
        	
        	
        	
        	//object[i][5] = orari.get(i).getSalla1();
        	//object[i][6] = orari.get(i).getSalla2();
        	//object[i][7] = orari.get(i).getSalla3();
        	//object[i][8] = orari.get(i).getSalla4();
        	//object[i][9] = orari.get(i).getSalla5();
        	//object[i][10] = orari.get(i).getSalla6();	
        	
        	
            
        	if(orari.get(i).getDita()==1) {
        		object[i][3] ="E Hene";
        	}else if(orari.get(i).getDita()==2) {
        		object[i][3] ="E Marte";
        	}else if(orari.get(i).getDita()==3) {
        		object[i][3] ="E Merkure";
        	}else if(orari.get(i).getDita()==4) {
        		object[i][3] ="E Enjte";
        	}else if(orari.get(i).getDita()==5) {
        		object[i][3] ="E Premte";
        	}
        	
        	if(orari.get(i).getSalla1()==404) {
        		object[i][5]="Kabinet";
        	}else 
        	
        	{
        		object[i][5] = orari.get(i).getSalla1();
        	}
        	
        	if(orari.get(i).getSalla2()==0) {
        		object[i][6]="";
        	}else 
        	
        	{
        		object[i][6] = orari.get(i).getSalla2();
        	}
        	
        	if(orari.get(i).getSalla3()==0) {
        		object[i][7]="";
        	}else 
        	
        	{
        		object[i][7] = orari.get(i).getSalla3();
        	}
        	
        	if(orari.get(i).getSalla4()==0) {
        		object[i][8]="";
        	}else 
        	
        	{
        		object[i][8] = orari.get(i).getSalla4();
        	}
        	
        	if(orari.get(i).getSalla5()==0) {
        		object[i][9]="";
        	}else 
        	
        	{
        		object[i][9] = orari.get(i).getSalla5();
        	}
        	if(orari.get(i).getSalla6()==0) {
        		object[i][10]="";
        	}else 
        	
        	{
        		object[i][10] = orari.get(i).getSalla6();
        	}

        	}
        	
        	//   button.addActionListener(null);

        	//lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,24));

        	

        	


        	 panel.remove(table1);
             panel.remove(scroll_table1);
             panel.remove(table);
             panel.remove(scroll_table);
        	
        	table1 = new JTable(object, columns);
        	table1.setBounds(130,20,1000,600);
        	table1.setAutoCreateRowSorter(true);
        	table1.getColumnModel().getColumn(0).setPreferredWidth(175);
        	table1.getColumnModel().getColumn(1).setPreferredWidth(110);
        	table1.getColumnModel().getColumn(2).setPreferredWidth(25);
        	table1.getColumnModel().getColumn(3).setPreferredWidth(60);
        	table1.getColumnModel().getColumn(4).setPreferredWidth(20);
        	table1.getColumnModel().getColumn(5).setPreferredWidth(20);
        	table1.getColumnModel().getColumn(6).setPreferredWidth(20);
        	table1.getColumnModel().getColumn(7).setPreferredWidth(20);
        	table1.getColumnModel().getColumn(8).setPreferredWidth(20);
        	table1.getColumnModel().getColumn(9).setPreferredWidth(20);
        	table1.getColumnModel().getColumn(10).setPreferredWidth(20);
        	panel.add(table1);

        	scroll_table1 = new JScrollPane(table1);            // add table to scroll panel
        	scroll_table1.setBounds(130, 20, 1000, 600);
        	scroll_table1.setVisible(true);
        	panel.add(scroll_table1);
 

        	table1.setFillsViewportHeight(true);
        	//table.setVisible(false);
        	 }
        	 });
     	
     	
    	

}
    	
    	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		



//frame.getContentPane().add(scrollPane,BorderLayout.CENTER);

		
	}

}
  
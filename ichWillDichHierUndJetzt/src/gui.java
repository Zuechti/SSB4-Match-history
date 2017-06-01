import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.image.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 08.01.2017
 * @author
 */

public class gui extends JFrame {
	// Anfang Attribute
	private JLabel jLabel1 = new JLabel();
	private JLabel jLabel2 = new JLabel();
	private JLabel jLabel3 = new JLabel();
	private JLabel jLabel4 = new JLabel();
	private JTextField search = new JTextField();
	private JButton goButton = new JButton();
	private JLabel jLabel5 = new JLabel();
	private JTextField average = new JTextField();
	private JLabel jLabel6 = new JLabel();
	private JLabel jLabel8 = new JLabel();
	private JLabel jLabel9 = new JLabel();
	private JTextField Sum = new JTextField();
	private JLabel jLabel10 = new JLabel();
	private JTextField result = new JTextField();
	private JTextField opponent = new JTextField();
	private JLabel jLabel11 = new JLabel();
	private JLabel jLabel12 = new JLabel();
	private JLabel jLabel13 = new JLabel();
	private JLabel jLabel14 = new JLabel();
	private JTextField lifesLeft = new JTextField();
	private JTextField pLeft = new JTextField();
	private JCheckBox wonCheck = new JCheckBox();
	private JLabel jLabel15 = new JLabel();
	private JTextField opponent1 = new JTextField();
	private JLabel jLabel7 = new JLabel();
	private JTextField lifesLeft1 = new JTextField();
	private JTextField pleft1 = new JTextField();
	private JLabel jLabel16 = new JLabel();
	private JLabel jLabel17 = new JLabel();
	private MatchHistory mH = new MatchHistory();
	private JButton create = new JButton();
	
	Challenger current;
	// Ende Attribute

	public gui() {
		// Frame-Initialisierung
		super();
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		int frameWidth = 494;
		int frameHeight = 260;
		setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		setTitle("SSB4 Match History");
		setIconImage(new ImageIcon("Icon.png").getImage());
		setResizable(false);
		Container cp = getContentPane();
		cp.setLayout(null);
		// Anfang Komponenten
		
		cp.setBackground(new Color(0x1a275b));
		//JMenubar
		JMenuBar mb=new JMenuBar();
		mb.setBackground(new Color(0x272727));
		mb.setForeground(new Color(0xFFFFFF));
		//JMenu file
		JMenu file= new JMenu("File");
		file.setForeground(new Color(0xC0c0c0));
		//JMenu file Items
		JMenuItem close= new JMenuItem("Close");
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				close_actionPerformed();
				
			}

			
		});
		file.add(close);
		
		//Ende JMenu file Items
		mb.add(file);
		//Ende JMenu file
		setJMenuBar(mb);
		//Ende JMenuBar
		average.setEditable(false);
		result.setEditable(false);
		Sum.setEditable(false);
		opponent.setEditable(false);
		lifesLeft.setEditable(false);
		pLeft.setEditable(false);
		jLabel1.setBounds(0, 0, 240, 25);
		jLabel1.setText("Your Challenger");
		jLabel1.setBackground(new Color(0x1E1E1E));
		jLabel1.setOpaque(true);
		jLabel1.setFont(new Font("@Fixedsys", Font.BOLD, 12));
		jLabel1.setForeground(new Color(0xC0C0C0));
		cp.add(jLabel1);
		jLabel2.setBounds(240, 0, 4, 345);
		jLabel2.setText("");
		jLabel2.setBackground(new Color(0xC0C0C0));
		jLabel2.setOpaque(true);
		cp.add(jLabel2);
		jLabel3.setBounds(244, 0, 251, 25);
		jLabel3.setText("New Game");

		jLabel3.setBackground(new Color(0x1E1E1E));
		jLabel3.setOpaque(true);
		jLabel3.setFont(new Font("@Fixedsys", Font.BOLD, 12));
		jLabel3.setForeground(new Color(0xC0C0C0));
		cp.add(jLabel3);
		jLabel4.setBounds(0, 25, 59, 24);
		jLabel4.setText("Search");
		jLabel4.setBackground(new Color(0x272727));
		jLabel4.setOpaque(true);
		jLabel4.setFont(new Font("@Fixedsys", Font.BOLD, 12));
		jLabel4.setForeground(new Color(0xC0C0C0));
		cp.add(jLabel4);
		search.setBounds(59, 25, 149, 24);
		search.setBackground(Color.GRAY);
		search.setFont(new Font("@Fixedsys", Font.PLAIN, 12));
		search.setForeground(Color.WHITE);
		search.setText("");
		cp.add(search);
		goButton.setBounds(208, 25, 32, 24);
		goButton.setText("Go!");
		goButton.setMargin(new Insets(2, 2, 2, 2));
		goButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				goButton_ActionPerformed(evt);
			}
		});
		goButton.setBackground(new Color(0xE1E1E1));
		cp.add(goButton);

		jLabel5.setBounds(0, 49, 59, 25);
		jLabel5.setText("Winrate");
		jLabel5.setBackground(new Color(0x272727));
		jLabel5.setOpaque(true);
		jLabel5.setToolTipText("");
		jLabel5.setForeground(new Color(0xC0C0C0));
		cp.add(jLabel5);
		average.setBounds(59, 48, 181, 25);
		average.setText("");
		average.setFont(new Font("@Fixedsys", Font.PLAIN, 12));
		average.setForeground(Color.WHITE);
		average.setBackground(Color.GRAY);
		cp.add(average);
		jLabel6.setBounds(0, 72, 59, 25);
		jLabel6.setText("Games");
		jLabel6.setBackground(new Color(0x272727));
		jLabel6.setOpaque(true);
		jLabel6.setForeground(new Color(0xC0C0C0));
		cp.add(jLabel6);
		jLabel8.setBounds(0, 96, 59, 17);
		jLabel8.setText("");

		jLabel8.setBackground(new Color(0x232323));
		jLabel8.setOpaque(true);
		cp.add(jLabel8);
		jLabel9.setBounds(0, 112, 59, 25);
		jLabel9.setText("Result");
		jLabel9.setBackground(new Color(0x272727));
		jLabel9.setOpaque(true);
		jLabel9.setForeground(new Color(0xC0C0C0));
		cp.add(jLabel9);
		Sum.setBounds(59, 72, 181, 25);
		Sum.setText("");
		Sum.setFont(new Font("@Fixedsys", Font.PLAIN, 12));
		Sum.setForeground(Color.WHITE);
		Sum.setBackground(Color.GRAY);
		cp.add(Sum);
		jLabel10.setBounds(59, 96, 181, 17);
		jLabel10.setText("");
		jLabel10.setForeground(new Color(0xC0C0C0));
		jLabel10.setBackground(new Color(0x1a275b));
		jLabel10.setOpaque(true);
		cp.add(jLabel10);
		result.setBounds(59, 112, 181, 25);
		result.setText("");
		result.setFont(new Font("@Fixedsys", Font.PLAIN, 12));
		result.setForeground(Color.WHITE);
		result.setBackground(Color.GRAY);
		cp.add(result);
		opponent.setBounds(59, 136, 181, 25);
		opponent.setText("");
		opponent.setFont(new Font("@Fixedsys", Font.PLAIN, 12));
		opponent.setForeground(Color.WHITE);
		opponent.setBackground(Color.GRAY);
		opponent.setToolTipText("Opponent");
		cp.add(opponent);
		jLabel11.setBounds(0, 136, 59, 25);
		jLabel11.setText("Opponent");
		jLabel11.setBackground(new Color(0x272727));
		jLabel11.setOpaque(true);
		jLabel11.setForeground(new Color(0xC0C0C0));
		cp.add(jLabel11);
		jLabel12.setBounds(0, 160, 59, 25);
		jLabel12.setText("Lifes Left");
		jLabel12.setBackground(new Color(0x272727));
		jLabel12.setOpaque(true);
		jLabel12.setForeground(new Color(0xC0C0C0));
		cp.add(jLabel12);
		jLabel13.setBounds(0, 184, 59, 25);
		jLabel13.setText("% Left");
		jLabel13.setBackground(new Color(0x272727));
		jLabel13.setOpaque(true);
		jLabel13.setForeground(new Color(0xC0C0C0));
		cp.add(jLabel13);
		jLabel14.setBounds(0, 208, 59, 89);
		jLabel14.setText("");
		jLabel14.setBackground(new Color(0x272727));
		jLabel14.setOpaque(true);
		jLabel14.setForeground(new Color(0xC0C0C0));
		cp.add(jLabel14);
		lifesLeft.setBounds(59, 160, 181, 25);
		lifesLeft.setText("");
		lifesLeft.setFont(new Font("@Fixedsys", Font.PLAIN, 12));
		lifesLeft.setForeground(Color.WHITE);
		lifesLeft.setBackground(Color.GRAY);
		cp.add(lifesLeft);
		pLeft.setBounds(59, 184, 181, 25);
		pLeft.setText("");
		pLeft.setFont(new Font("@Fixedsys", Font.PLAIN, 12));
		pLeft.setForeground(Color.WHITE);
		pLeft.setBackground(Color.GRAY);
		cp.add(pLeft);
		wonCheck.setBounds(244, 24, 59, 25);
		wonCheck.setText("Won?");
		wonCheck.setOpaque(true);
		wonCheck.setBackground(new Color(0x272727));
		wonCheck.setForeground(new Color(0xC0C0C0));
		cp.add(wonCheck);
		jLabel15.setBounds(244, 48, 59, 25);
		jLabel15.setText("Opponent");
		jLabel15.setBackground(new Color(0x272727));
		jLabel15.setOpaque(true);
		jLabel15.setForeground(new Color(0xC0C0C0));
		cp.add(jLabel15);
		opponent1.setBounds(303, 48, 181, 24);
		opponent1.setBackground(Color.GRAY);
		opponent1.setFont(new Font("@Fixedsys", Font.PLAIN, 12));
		cp.add(opponent1);
		jLabel7.setBounds(244, 72, 59, 25);
		jLabel7.setText("Lifes Left");
		jLabel7.setBackground(new Color(0x272727));
		jLabel7.setOpaque(true);
		jLabel7.setForeground(new Color(0xC0C0C0));
		cp.add(jLabel7);
		lifesLeft1.setBounds(303, 72, 181, 24);
		lifesLeft1.setBackground(Color.GRAY);
		lifesLeft1.setFont(new Font("@Fixedsys", Font.PLAIN, 12));
		cp.add(lifesLeft1);
		pleft1.setBounds(303, 96, 181, 24);
		pleft1.setBackground(Color.GRAY);
		pleft1.setFont(new Font("@Fixedsys", Font.PLAIN, 12));
		cp.add(pleft1);
		jLabel16.setBounds(244, 96, 59, 25);
		jLabel16.setText("% Left");
		jLabel16.setBackground(new Color(0x272727));
		jLabel16.setOpaque(true);
		jLabel16.setForeground(new Color(0xC0C0C0));
		cp.add(jLabel16);
		jLabel17.setBounds(244, 120, 59, 121);
		jLabel17.setText("");
		jLabel17.setBackground(new Color(0x272727));
		jLabel17.setOpaque(true);
		jLabel17.setForeground(new Color(0xC0C0C0));
		cp.add(jLabel17);
		create.setBounds(244 + 59, 120, 32, 25);
		create.setText("Go!");
		create.setMargin(new Insets(2, 2, 2, 2));
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				create_ActionPerformed(evt);
			}
		});
		cp.add(create);
		// Ende Komponenten

		setVisible(true);
	} // end of public gui

	// Anfang Methoden
	private void close_actionPerformed() {
		this.setVisible(false);
		this.dispose();
		
	}
	public static void main(String[] args) {
		new gui();
	} // end of main

	public void create_ActionPerformed(ActionEvent evt) {
		boolean won, hw = true;
		int ll=0, pl=0;

		won = this.wonCheck.isSelected();
		try{
			ll=Integer.parseInt(lifesLeft1.getText());
		}catch(NumberFormatException e){
			hw=false;
		}
		try{
			pl=Integer.parseInt(pleft1.getText());
		}catch(NumberFormatException e){
			hw=false;
		}
		if (hw) {
			current.newGame(won, ll, pl,
					opponent.getText());
		}
		update();
	}

	public void goButton_ActionPerformed(ActionEvent evt) {
		mH.searchOrAdd(search.getText());
		current = mH.getChars().search(new Challenger(search.getText()));
		update();
	} // end of goButton_ActionPerformed

	public void update() {
		if (current != null) {
			search.setText("" + current.getName());
			average.setText("" + current.getWinRate());
			Sum.setText("" + current.getGamesSum());
			if (current.getLast() != null) {
				opponent.setText(current.getLast().getOpponent());
				if (current.getLast().hasWon())
					result.setText("Victory");
				else
					result.setText("Loss");
				lifesLeft.setText("" + current.getLast().getLifes());
				pLeft.setText(current.getWinRate() + "%");
			}
		}
	}

	// Ende Methoden
} // end of class gui

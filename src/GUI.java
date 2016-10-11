import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI extends JFrame{
	
	JMenuItem createBook;
	JMenuItem saveBook;
	JMenuItem addBuddy;
	JMenuItem removeBuddy;
	
	AddressBook book;
	
	public GUI()
	{
		JTextArea t = new JTextArea();
		t.setEditable(false);
		JMenuBar jMenuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenu newItem = new JMenu("New");
		createBook = new JMenuItem("Book");
		saveBook = new JMenuItem("Save Book");
		newItem.add(createBook);
		fileMenu.add(newItem);
		fileMenu.add(saveBook);
		jMenuBar.add(fileMenu);
		
		JMenu buddyMenu = new JMenu("Contacts");
		addBuddy = new JMenuItem("Add Contact");
		removeBuddy = new JMenuItem("Remove Contact");
		buddyMenu.add(addBuddy);
		buddyMenu.add(removeBuddy);
		jMenuBar.add(buddyMenu);
		
		this.setJMenuBar(jMenuBar);
		this.add(t);
		this.setSize(500, 400);
		this.setLocation(700, 300);
	}
	
	public void refresh()
	{
		if(book == null)
		{
			saveBook.setEnabled(false);
			addBuddy.setEnabled(false);
			removeBuddy.setEnabled(false);
		}
		else
		{
			saveBook.setEnabled(true);
			addBuddy.setEnabled(true);
			removeBuddy.setEnabled(true);
		}
	}
	
	public void setUp()
	{
		refresh();
		createBook.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				book = new AddressBook();
				refresh();
			}
		});
		saveBook.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		addBuddy.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		removeBuddy.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
				
		this.setVisible(true);
	}
	
	
}

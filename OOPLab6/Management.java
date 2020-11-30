package OOPLab6;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
//import javax.xml.bind.JAXBException;

public class Management { 
	private JFrame frame;
	private JList list;
    private ProductList products;

  
   
    public void drawLabel() {
    	JFrame frame = new JFrame("Warehouse Management System");
        frame.setResizable(false);
        frame.setBounds(100, 100, 800, 600);
        frame.setLocation(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);

        JTabbedPane tabPane = new JTabbedPane();
        tabPane.setBounds(0, 0, 780, 600);
        frame.getContentPane().add(tabPane);

        JPanel Panel = new JPanel();
        tabPane.addTab("Storing Data", null, Panel, null);
        Panel.setLayout(null);

        JLabel ProductName = new JLabel("Product :");
        ProductName.setBounds(12, 13, 119, 23);
        Panel.add(ProductName);
        ProductName.setFont(new Font("Roman", Font.BOLD, 19));

        JLabel Amount = new JLabel("Amount :");
        Amount.setBounds(12, 80, 127, 32);
        Panel.add(Amount);
        Amount.setFont(new Font("Roman", Font.BOLD, 19));

        JLabel Description = new JLabel("Description :");
        Description.setBounds(12, 150, 200, 50);
        Panel.add(Description);
        Description.setFont(new Font("Roman", Font.BOLD, 19)); 
        
        JTextField textField_of_productName = new JTextField();
        textField_of_productName.setBounds(100, 10, 312, 30);
        Panel.add(textField_of_productName);
        textField_of_productName.setFont(new Font("Roman", Font.PLAIN, 15));
        textField_of_productName.setColumns(10); 
        
        JSpinner Field_of_amount = new JSpinner();
        Field_of_amount.setBounds(100, 85, 100, 30);
        Panel.add(Field_of_amount);
        Field_of_amount.setFont(new Font("Positive Number", Font.PLAIN, 15));
        Field_of_amount.setModel(new SpinnerNumberModel(0, 0, null, 1)); 
        
        JTextArea textField_of_descripition = new JTextArea();
        textField_of_descripition.setBounds(10, 200, 400, 150);
        Panel.add(textField_of_descripition);
        textField_of_descripition.setFont(new Font("Roman", Font.PLAIN, 15)); 
        
        JLabel ProductList = new JLabel("Product List");
        ProductList.setBounds(550, 20, 154, 38);
        Panel.add(ProductList);
        ProductList.setFont(new Font("Roman", Font.BOLD, 25));
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(475, 60, 300, 400);
        Panel.add(scrollPane); 

        
        JButton addButton = new JButton("Add");
        addButton.setBounds(100, 450, 97, 30);
        Panel.add(addButton);
        
        JButton removeButton = new JButton("Remove");
        removeButton.setBounds(250, 450, 97, 30);
        Panel.add(removeButton);

        JPanel searchPanel = new JPanel();
        tabPane.addTab("Searching Data", null, searchPanel, null);
        searchPanel.setLayout(null); 
        
        JLabel productName = new JLabel("Product:");
        productName.setBounds(12, 13, 119, 23);
        productName.setFont(new Font("Roman", Font.BOLD, 20));
        searchPanel.add(productName);

        JLabel amount = new JLabel("Amount:");
        amount.setFont(new Font("Roman", Font.BOLD, 20));
        amount.setBounds(12, 50, 127, 32);
        searchPanel.add(amount);

        JLabel description = new JLabel("Description:");
        description.setFont(new Font("Roman", Font.BOLD, 20));
        description.setBounds(12, 150, 200, 50);
        searchPanel.add(description); 
        
        JButton searchButton = new JButton("Search");
        searchButton.setBounds(300, 450, 105, 30);
        searchPanel.add(searchButton); 
        
        
        
       /* //Input product name and click SEARCH button to start searching.
         
        JTextField textField_searchProductName = new JTextField();
        textField_searchProductName.setFont(new Font("Roman", Font.PLAIN, 15));
        textField_searchProductName.setColumns(10);
        textField_searchProductName.setBounds(100, 10, 312, 30);
        searchPanel.add(textField_searchProductName); 
        
        JLabel searchAmountValue = new JLabel();
        searchAmountValue.setFont(new Font("Roman", Font.PLAIN, 19));
        searchAmountValue.setBounds(100, 85, 100, 30);
        searchPanel.add(searchAmountValue); 
        
        JLabel searchDescriptionValue = new JLabel();
        searchDescriptionValue.setVerticalAlignment(SwingConstants.TOP);
        searchDescriptionValue.setHorizontalAlignment(SwingConstants.LEFT);
        searchDescriptionValue.setFont(new Font("Roman", Font.PLAIN, 19));
        searchDescriptionValue.setBounds(10, 200, 400, 150);
        searchPanel.add(searchDescriptionValue);
        
        searchButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (Product product : products.getListProducts()) {
                    if (textField_searchProductName.getText().toUpperCase().equals(product.getProductName().toUpperCase())) 
                    {
                        searchAmountValue.setText(product.getAmount().toString());
                        searchDescriptionValue.setText("<html>" + product.getDescription() + "</html>");
                    }
                }
            }
        }); 
        
        /**
         * Input product name & amount, then click ADD button to add item.
         
        addButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (textField_of_productName.getText().length() > 0 && (Integer) Field_of_amount.getValue() > 0) {
                    boolean flag = true;
                    for (Product product : products.getListProducts()) {
                        if (textField_of_productName.getText().toUpperCase()
                                .equals(product.getProductName().toUpperCase())) {
                            product.increaseAmount((Integer) Field_of_amount.getValue());
                            product.setDescription(textField_of_descripition.getText());
                            flag = false;
                        }
                    }
                    if (flag == true) {
                        products.addProduct(textField_of_productName.getText(), (Integer) Field_of_amount.getValue(),
                        		textField_of_descripition.getText());
                    }

                    textField_of_productName.setText("");
                    Field_of_amount.setValue(0);
                    textField_of_descripition.setText("");
                    //loadWordsIntoTable();
                    try {
                        JSON_IO.saveJSONFile(products);
                    } catch (JAXBException ex) {
                        ex.printStackTrace();
                    }
                }

            }
        }); 
        /**
         * Input product name or choose item from JList, then click REMOVE
         * button to decrease item amount.
         
        removeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int select = list.getSelectedIndex();
                Product toDeleteProduct = null;
                if (textField_of_productName.getText().length() > 0) {
                    for (Product product : products.getListProducts()) {
                        if (textField_of_productName.getText().toUpperCase()
                                .equals(product.getProductName().toUpperCase())
                                && !product.decreaseAmountByOne()) {
                            toDeleteProduct = product;
                        }
                    }
                    products.getListProducts().remove(toDeleteProduct);
                    loadWordsIntoTable();
                } else if (list.getSelectedIndex() != -1) {
                    Product product = products.getListProducts().get(list.getSelectedIndex());
                    if (!product.decreaseAmountByOne()) {
                        products.getListProducts().remove(product);
                    }
                    loadWordsIntoTable();
                    list.setSelectedIndex(select);
                }

                try {
                    JSON_IO.saveJSONFile(products);
                } catch (JAXBException e1) {
                    e1.printStackTrace();
                }
            }
        });
        loadWordsIntoTable();
        
    }
   */
    }
}
        

            
    


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class OnlineBookstoreGUI extends JFrame {
    private DefaultListModel<String> availableBooksModel;
    private DefaultListModel<String> cartModel;
    private JList<String> availableBooksList;
    private JList<String> cartList;
    private JTextField bookTextField;
    private JButton addToCartButton;
    private JButton removeFromCartButton;
    private JButton checkoutButton;
    private JLabel errorMessageLabel;
    public OnlineBookstoreGUI() {
        // Set up the main frame
        setTitle("Online Bookstore");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        // Create the models for the available books and cart lists
        availableBooksModel = new DefaultListModel<>();
        cartModel = new DefaultListModel<>();
        // Create the available books list and add it to a scroll pane
        availableBooksList = new JList<>(availableBooksModel);
        JScrollPane availableBooksScrollPane = new JScrollPane(availableBooksList);
        availableBooksScrollPane.setPreferredSize(new Dimension(200, 200));
        // Create the cart list and add it to a scroll pane
        cartList = new JList<>(cartModel);
        JScrollPane cartScrollPane = new JScrollPane(cartList);
        cartScrollPane.setPreferredSize(new Dimension(200, 200));
        // Create the text field for user input
        bookTextField = new JTextField();
        bookTextField.setPreferredSize(new Dimension(200, 25));
        // Create the buttons
        addToCartButton = new JButton("Add to Cart");
        removeFromCartButton = new JButton("Remove from Cart");
        checkoutButton = new JButton("Checkout");
        // Create the error message label
        errorMessageLabel = new JLabel();
        errorMessageLabel.setForeground(Color.RED);
        // Add components to the main frame
        add(availableBooksScrollPane, BorderLayout.WEST);
        add(cartScrollPane, BorderLayout.EAST);
        add(bookTextField, BorderLayout.NORTH);
        add(addToCartButton, BorderLayout.CENTER);
        add(removeFromCartButton, BorderLayout.CENTER);
        add(checkoutButton, BorderLayout.CENTER);
        add(errorMessageLabel, BorderLayout.SOUTH);
        // Register event listeners for buttons
        addToCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedBook = availableBooksList.getSelectedValue();
                if (selectedBook != null) {
                    cartModel.addElement(selectedBook);
                    availableBooksModel.removeElement(selectedBook);
                }
            }
        });
        removeFromCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedBook = cartList.getSelectedValue();
                if (selectedBook != null) {
                    cartModel.removeElement(selectedBook);
                    availableBooksModel.addElement(selectedBook);
                }
            }   });
       checkoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cartModel.isEmpty()) {
                    errorMessageLabel.setText("Error: Cart is empty");
                } else {
                    // Perform checkout logic here
                    // ...
                    errorMessageLabel.setText("Checkout successful");
                }
            }
        });
        // Set up initial data
        availableBooksModel.addElement("Book 1");
        availableBooksModel.addElement("Book 2");
        availableBooksModel.addElement("Book 3");
        availableBooksModel.addElement("Book 4");
        // Pack and display the main frame
        pack();
        // setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OnlineBookstoreGUI();
            }
        });
    }
}

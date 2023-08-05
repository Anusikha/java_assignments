import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NumberConverter extends JFrame implements ActionListener {
  private JTextField decimalField, hexField, binaryField;
  
  public NumberConverter() {
    super("Number Converter");
    
    // create decimal label and text field
    JLabel decimalLabel = new JLabel("Decimal:");
    decimalField = new JTextField(10);
    decimalField.addActionListener(this);
    
    // create hex label and text field
    JLabel hexLabel = new JLabel("Hex:");
    hexField = new JTextField(10);
    hexField.addActionListener(this);
    
    // create binary label and text field
    JLabel binaryLabel = new JLabel("Binary:");
    binaryField = new JTextField(10);
    binaryField.addActionListener(this);
    
    // create panel and add components
    JPanel panel = new JPanel(new GridLayout(3, 2));
    panel.add(decimalLabel);
    panel.add(decimalField);
    panel.add(hexLabel);
    panel.add(hexField);
    panel.add(binaryLabel);
    panel.add(binaryField);
    
    // add panel to frame
    add(panel);
    
    // set frame properties
    setSize(300, 120);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  // method to convert decimal to hex and binary
  private void convertDecimal() {
    try {
      // get decimal value
      int decimal = Integer.parseInt(decimalField.getText());
      
      // convert to hex and binary
      String hex = Integer.toHexString(decimal);
      String binary = Integer.toBinaryString(decimal);
      
      // set text in other fields
      hexField.setText(hex);
      binaryField.setText(binary);
    } catch (NumberFormatException e) {
      // if input is not a valid number, clear other fields
      hexField.setText("");
      binaryField.setText("");
    }
  }
  
  // method to convert hex to decimal and binary
  private void convertHex() {
    try {
      // get hex value
      String hex = hexField.getText();
      
      // convert to decimal and binary
      int decimal = Integer.parseInt(hex, 16);
      String binary = Integer.toBinaryString(decimal);
      
      // set text in other fields
      decimalField.setText(Integer.toString(decimal));
      binaryField.setText(binary);
    } catch (NumberFormatException e) {
      // if input is not a valid hex number, clear other fields
      decimalField.setText("");
      binaryField.setText("");
    }
  }
  
  // method to convert binary to decimal and hex
  private void convertBinary() {
    try {
      // get binary value
      String binary = binaryField.getText();
      
      // convert to decimal and hex
      int decimal = Integer.parseInt(binary, 2);
      String hex = Integer.toHexString(decimal);
      
      // set text in other fields
      decimalField.setText(Integer.toString(decimal));
      hexField.setText(hex.toUpperCase());
    } catch (NumberFormatException e) {
      // if input is not a valid binary number, clear other fields
      decimalField.setText("");
      hexField.setText("");
    }
  }
  
  // event handling for text field
  public void actionPerformed(ActionEvent e) {
    // check which text field fired the event
    if (e.getSource() == decimalField) {
      convertDecimal();
    } else if (e.getSource() == hexField) {
      convertHex();
    } else if (e.getSource() == binaryField) {
      convertBinary();
    }
  }
  
  // main method to create instance
  public static void main(String[] args) {
    // Create and display the converter frame
    NumberConverter converter = new NumberConverter();
    converter.setVisible(true);
}
}
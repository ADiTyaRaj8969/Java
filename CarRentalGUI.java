import javax.swing.*;

public class CarRentalGUI extends JFrame {

    // Car list (replace with actual data fetching)
    String[] carList = {"Car 1", "Car 2", "Car 3"};

    public CarRentalGUI() {
        super("Car Rental System");

        
        JPanel customerPanel = new JPanel();
        JPanel carPanel = new JPanel();
        JPanel buttonPanel = new JPanel();

        
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        customerPanel.add(nameLabel);
        customerPanel.add(nameField);

        
        JComboBox carDropdown = new JComboBox(carList);
        carPanel.add(new JLabel("Select Car:"));
        carPanel.add(carDropdown);

        
        JButton rentButton = new JButton("Rent Car");
        JButton returnButton = new JButton("Return Car");
        buttonPanel.add(rentButton);
        buttonPanel.add(returnButton);

        
        add(customerPanel);
        add(carPanel);
        add(buttonPanel);

    
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new CarRentalGUI();
    }
}

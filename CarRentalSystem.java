import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Car {
    private String carId;
    private String brand;
    private String model;
    private double basePricePerDay;
    private boolean isAvailable;

    public Car(String carId, String brand, String model, double basePricePerDay) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = true;
    }

    public String getCarId() {
        return carId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double calculatePrice(int rentalDays) {
        return basePricePerDay * rentalDays;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rent() {
        isAvailable = false;
    }

    public void returnCar() {
        isAvailable = true;
    }
}

class Customer {
    private String customerId;
    private String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }
}

class Rental {
    private Car car;
    private Customer customer;
    private int days;
    private String rentalDate;

    public Rental(Car car, Customer customer, int days) {
        this.car = car;
        this.customer = customer;
        this.days = days;
        this.rentalDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }

    public String getRentalDate() {
        return rentalDate;
    }
}

public class CarRentalSystem extends JFrame {
    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;

    private JTextField nameTextField;
    private JComboBox<String> carComboBox;
    private JTextField rentalDaysTextField;
    private JTextArea outputTextArea;
    private JButton rentButton;
    private JButton returnButton;
    private JButton saveButton;
    private JButton loadButton;

    public CarRentalSystem() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();

        createView();

        setTitle("Car Rental System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setResizable(false);

        // Initialize cars (sample data)
        cars.add(new Car("C001", "Toyota", "Camry", 60.0));
        cars.add(new Car("C002", "Honda", "Accord", 70.0));
        cars.add(new Car("C003", "Mahindra", "Thar", 150.0));

        updateCarComboBox();
    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel nameLabel = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(nameLabel, gbc);

        nameTextField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(nameTextField, gbc);

        JLabel carLabel = new JLabel("Car:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(carLabel, gbc);

        carComboBox = new JComboBox<>();
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(carComboBox, gbc);

        JLabel rentalDaysLabel = new JLabel("Rental Days:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(rentalDaysLabel, gbc);

        rentalDaysTextField = new JTextField(5);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(rentalDaysTextField, gbc);

        rentButton = new JButton("Rent");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(rentButton, gbc);

        returnButton = new JButton("Return");
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(returnButton, gbc);

        saveButton = new JButton("Save");
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(saveButton, gbc);

        loadButton = new JButton("Load");
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(loadButton, gbc);

        outputTextArea = new JTextArea(15, 40);
        outputTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputTextArea);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        panel.add(scrollPane, gbc);

        rentButton.addActionListener(new RentButtonActionListener());
        returnButton.addActionListener(new ReturnButtonActionListener());
        saveButton.addActionListener(new SaveButtonActionListener());
        loadButton.addActionListener(new LoadButtonActionListener());
    }

    private void updateCarComboBox() {
        carComboBox.removeAllItems();
        for (Car car : cars) {
            if (car.isAvailable()) {
                carComboBox.addItem(car.getCarId() + " - " + car.getBrand() + " " + car.getModel());
            }
        }
    }

    private class RentButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = nameTextField.getText();
            String selectedCar = (String) carComboBox.getSelectedItem();
            String rentalDaysStr = rentalDaysTextField.getText();

            if (name.isEmpty() || selectedCar == null || rentalDaysStr.isEmpty()) {
                JOptionPane.showMessageDialog(CarRentalSystem.this, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                int rentalDays = Integer.parseInt(rentalDaysStr);
                String carId = selectedCar.split(" - ")[0];

                Customer newCustomer = new Customer("CUS" + (customers.size() + 1), name);
                customers.add(newCustomer);

                Car selectedCarObj = null;
                for (Car car : cars) {
                    if (car.getCarId().equals(carId) && car.isAvailable()) {
                        selectedCarObj = car;
                        break;
                    }
                }

                if (selectedCarObj != null) {
                    double totalPrice = selectedCarObj.calculatePrice(rentalDays);
                    outputTextArea.append(String.format("Rental Info: %s\nCar: %s %s\nDays: %d\nTotal Price: $%.2f\n\n",
                            newCustomer.getName(), selectedCarObj.getBrand(), selectedCarObj.getModel(), rentalDays, totalPrice));

                    selectedCarObj.rent();
                    rentals.add(new Rental(selectedCarObj, newCustomer, rentalDays));

                    nameTextField.setText("");
                    rentalDaysTextField.setText("");
                    updateCarComboBox();
                } else {
                    JOptionPane.showMessageDialog(CarRentalSystem.this, "Car not available", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(CarRentalSystem.this, "Please enter a valid number for rental days", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class ReturnButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String selectedCar = (String) carComboBox.getSelectedItem();
            if (selectedCar == null) {
                JOptionPane.showMessageDialog(CarRentalSystem.this, "No car selected", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String carId = selectedCar.split(" - ")[0];
            Car carToReturn = null;
            for (Car car : cars) {
                if (car.getCarId().equals(carId) && !car.isAvailable()) {
                    carToReturn = car;
                    break;
                }
            }

            if (carToReturn != null) {
                carToReturn.returnCar();
                Rental rentalToRemove = null;
                for (Rental rental : rentals) {
                    if (rental.getCar() == carToReturn) {
                        rentalToRemove = rental;
                        break;
                    }
                }
                if (rentalToRemove != null) {
                    rentals.remove(rentalToRemove);
                    outputTextArea.append(String.format("Car Returned: %s\n\n", carToReturn.getBrand() + " " + carToReturn.getModel()));
                    updateCarComboBox();
                } else {
                    JOptionPane.showMessageDialog(CarRentalSystem.this, "Rental info not found", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(CarRentalSystem.this, "Car not rented or invalid car ID", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class SaveButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(CarRentalSystem.this);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    for (Rental rental : rentals) {
                        writer.write(String.format("%s;%s;%s;%d;%s\n",
                                rental.getCustomer().getCustomerId(),
                                rental.getCustomer().getName(),
                                rental.getCar().getCarId(),
                                rental.getDays(),
                                rental.getRentalDate()));
                    }
                    JOptionPane.showMessageDialog(CarRentalSystem.this, "Data saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(CarRentalSystem.this, "Error saving data", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private class LoadButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(CarRentalSystem.this);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    rentals.clear();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        String[] parts = line.split(";");
                        if (parts.length == 5) {
                            Customer customer = new Customer(parts[0], parts[1]);
                            customers.add(customer);
                            Car car = null;
                            for (Car c : cars) {
                                if (c.getCarId().equals(parts[2])) {
                                    car = c;
                                    break;
                                }
                            }
                            if (car != null) {
                                car.rent();
                                rentals.add(new Rental(car, customer, Integer.parseInt(parts[3])));
                            }
                        }
                    }
                    outputTextArea.setText("");
                    for (Rental rental : rentals) {
                        outputTextArea.append(String.format("Rental Info: %s\nCar: %s %s\nDays: %d\nDate: %s\n\n",
                                rental.getCustomer().getName(),
                                rental.getCar().getBrand(),
                                rental.getCar().getModel(),
                                rental.getDays(),
                                rental.getRentalDate()));
                    }
                    updateCarComboBox();
                    JOptionPane.showMessageDialog(CarRentalSystem.this, "Data loaded successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(CarRentalSystem.this, "Error loading data", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CarRentalSystem().setVisible(true));
    }
}
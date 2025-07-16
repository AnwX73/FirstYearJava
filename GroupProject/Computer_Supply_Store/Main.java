
package Computer_Supply_Store;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static ArrayList<Products> products = new ArrayList<>();
    static ArrayList<Order> orderList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ProductsList(products);

        System.out.println("*** Welcome To " + Shop.SHOP_NAME + " ***");
        System.out.println("What would you like to do?");
        int choice = 0;

        do {
            try {
                Options();
                choice = input.nextInt();
                switch (choice) {

                    case 1://Add Product
                        System.out.println("1.Computer\n2.Monitor\n3.Printer");
                        System.out.print("Select Product Number: ");
                        int productNum = input.nextInt();
                        if (productNum < 1 || productNum > 3) {
                            System.out.println("Invalid Number!");
                            break;
                        }

                        System.out.print("Enter Product Name: ");
                        String name = input.next();
                        System.out.print("Enter Product ID: ");
                        int id = input.nextInt();
                        System.out.print("Enter Product Price: ");
                        double price = input.nextDouble();

                        if (productNum == 1) {
                            System.out.print("Enter Computer Color: ");
                            String color = input.next();
                            System.out.print("Enter screen Size: ");
                            double screenSize = input.nextDouble();
                            Products computer = new Computer(color, screenSize, name, id, price);
                            products.add(computer);

                        } else if (productNum == 2) {
                            System.out.print("Enter Monitor Size: ");
                            double monitorSize = input.nextDouble();
                            System.out.print("Enter Monitor Resolution: ");
                            String Mresolution = input.next();
                            System.out.print("Enter If Monitor Has HDMI (true/flase): ");
                            boolean hasHDMI = input.nextBoolean();
                            Products monitor = new Monitor(monitorSize, Mresolution, hasHDMI, name, id, price);
                            products.add(monitor);

                        } else if (productNum == 3) {
                            System.out.print("Enter If Printer Has Colors (true/flase): ");
                            boolean hasColors = input.nextBoolean();
                            System.out.print("Enter Printer Resolution: ");
                            String Presolution = input.next();
                            System.out.print("Enter If Printer Has Scanner (true/flase): ");
                            boolean hasScanner = input.nextBoolean();
                            Products printer = new Printer(hasColors, Presolution, hasScanner, name, id, price);
                            products.add(printer);
                        }
                        System.out.println("New product has been added successfully!");
                        break;

                    case 2:// Remove Product
                        System.out.print("Enter Product ID: ");
                        id = input.nextInt();
                        int index = -1;
                        for (int i = 0; i < products.size(); i++) {
                            if (products.get(i).getProductID() == id) {
                                index = i;
                                break;
                            }
                        }
                        if (index == -1) {
                            System.out.println("Product with ID " + id + " is not found!");
                            break;
                        }
                        products.remove(index);
                        System.out.println("Product with ID " + id + " has been remove successfully!");
                        break;

                    case 3://Show Products
                        System.out.println("*** Product List ***");
                        for (Products p : products) {
                            System.out.println(p);
                            System.out.printf("Price after TAX: " + p.productPrice() + " SAR\n");
                            System.out.println("-------------------------------------------------------");
                        }
                        break;

                    case 4://Show Computers
                        System.out.println("*** All Computers ***");
                        for (Products p : products) {
                            if (p instanceof Computer) {
                                System.out.println(p);
                                System.out.println("This is all the " + p.productCategory());
                                System.out.printf("Price after TAX: " + p.productPrice() + " SAR\n");
                                System.out.println("-------------------------------------------------------");
                            }
                        }
                        break;

                    case 5://Show Monitors
                        System.out.println("*** All Monitors ***");
                        for (Products p : products) {
                            if (p instanceof Monitor) {
                                System.out.println(p);
                                System.out.println("This is all the " + p.productCategory());
                                System.out.printf("Price after TAX: " + p.productPrice() + " SAR\n");
                                System.out.println("-------------------------------------------------------");
                            }
                        }
                        break;

                    case 6://Show Printers
                        System.out.println("*** All Printers ***");
                        for (Products p : products) {
                            if (p instanceof Printer) {
                                System.out.println(p);
                                System.out.println("This is all the " + p.productCategory());
                                System.out.printf("Price after TAX: " + p.productPrice() + " SAR\n");
                                System.out.println("-------------------------------------------------------");
                            }
                        }
                        break;
                    case 7://Make Order
                        int orderID = (int) (Math.random() * 1000) + 1;
                        System.out.print("How many items? ");
                        int size = input.nextInt();

                        if (size <= 0) {
                            System.out.println("Invalid number!");
                            break;
                        }

                        Products[] orderProducts = new Products[size];
                        System.out.println("Enter " + size + " product IDs:");
                        int count = 0;
                        while (count < size) {
                            System.out.printf("Enter product #" + (count + 1) + " ID: ");
                            id = input.nextInt();
                            //search for product
                            boolean isFound = false;
                            for (Products p : products) {
                                if (p.getProductID() == id) {
                                    orderProducts[count] = p;
                                    isFound = true;
                                    break;
                                }
                            }
                            if (!isFound) {
                                System.out.println("Invalid Product ID");
                            } else {
                                count++;
                            }
                        }

                        //Customer Info
                        System.out.print("Enter your name: ");
                        name = input.next();
                        System.out.print("Enter your ID: ");
                        String ID = input.next();
                        System.out.print("Enter your Email: ");
                        String Email = input.next();
                        System.out.print("Enter your age: ");
                        int age = input.nextInt();

                        Customer customer = new Customer(name, ID, Email, age);
                        Order order = new Order(orderID, customer, orderProducts);
                        orderList.add(order);

                        System.out.print("Confirm order? (Y/N): ");
                        char answer = input.next().charAt(0);
                        if (answer == 'y' || answer == 'Y') {
                            order.displayOrderDetails();
                            System.out.println("Your order number: " + Order.getOrderNumber());
                            System.out.println("*** Your order has been confirmed! ***");
                        } else {
                            orderList.clear();
                            System.out.println("Your order has been cancelled!");
                        }
                        break;

                    case 8://Show Order
                        if (!orderList.isEmpty()) {
                            for (Order o : orderList) {
                                o.displayOrderDetails();
                            }
                        } else {
                            System.out.println("No current order yet!");
                        }
                        break;

                    case 9://Cancel Order
                        if (!orderList.isEmpty()) {
                            System.out.print("Are you sure you want to cancel your order? (Y/N): ");
                            answer = input.next().charAt(0);
                            if (answer == 'y' || answer == 'Y') {
                                orderList.clear();
                                System.out.println("Your order has been cancelled!");
                            } else {
                                System.out.println("Your order is not cancelled!");
                            }
                        } else {
                            System.out.println("No current order yet!");
                        }
                        break;

                    case 10://GUI
                        GUI.main(null);
                        break;
                        
                    case 11://Save To File
                        TextFileWrite writer = new TextFileWrite();
                        writer.openFile();
                        for (Order o : orderList) {
                            writer.addData(o);
                        }
                        writer.closeFile();
                        System.out.println("Orders have been saved successfully!");
                        break;
                        
                    case 12://Read From File
                        TextFileRead reader = new TextFileRead();
                        reader.openFile();
                        reader.readData();
                        reader.closeFile();
                        System.out.println("Orders have been read successfully!");
                        break;    

                    case 13://Exit 
                        System.out.println("Thank you!");
                        break;

                    default:
                        System.out.println("Invalid Option!");
                }
            } catch (InputMismatchException ex) {
                System.err.println("Invalid Input!");
                input.nextLine();
            } catch (NullPointerException ex) {
                System.err.println(ex.getMessage());
            } catch (ClassCastException ex) {
                System.err.println(ex.getMessage());
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println(ex.getMessage());
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        } while (choice != 13);
    }

    public static void Options() {
        System.out.print("\n1. Add Product\n"
                + "2. Remove Product\n"
                + "3. Show Products\n"
                + "4. Show Computers\n"
                + "5. Show Monitors\n"
                + "6. Show Printers\n"
                + "7. Make Order\n"
                + "8. Show Order\n"
                + "9. Cancel Order\n"
                + "10. GUI\n"
                + "11. Save To File\n"
                + "12. Read From File\n"
                + "13. Exit\n"
                + ">> ");
    }

    public static void ProductsList(ArrayList<Products> list) {
        list.add(new Computer("Black", 12.5, "Computer1", 1, 12500.0));
        list.add(new Monitor(8.9, "4K", true, "Monitor1", 2, 5000.0));
        list.add(new Printer(true, "HD", true, "Printer1", 3, 1200.0));
    }

}

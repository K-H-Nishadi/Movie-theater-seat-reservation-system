import java.io.*;
import java.util.*;
import java.io.FileWriter;

public class Theatre {

    static int[] row_1 = new int[12];
    static int[] row_2 = new int[16];
    static int[] row_3 = new int[20];
    static Ticket ticket_obj;
    static int row_num,seat_num;
    static int cancel_row, cancel_seet;
    static double total = 0;

    public static void main(String[] args) {

        ArrayList<Ticket> ticket_array = new ArrayList<Ticket>();

        System.out.println("Welcome to the New Theatre");
        System.out.println("");
        System.out.println("");
        System.out.println("* Welcome *");

        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }

        System.out.println("");
        displayMenu();


        int number = 10;
        while (number != 0) {

            try {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter option: ");
                number = input.nextInt();

                switch (number) {
                    case 1:
                        buy_ticket(ticket_array);
                        break;
                    case 2:
                        print_seating_area();
                        break;
                    case 3:
                        cancel_ticket(ticket_array);
                        break;
                    case 4:
                        show_available();
                        break;
                    case 5:
                        save();
                        break;
                    case 6:
                        load();
                        break;
                    case 7:
                        show_tickets(ticket_array);
                        break;
                    case 8:
                        short_tickets(ticket_array);
                        break;
                    case 0:
                        System.out.println("Program end");
                        System.exit(0);                // exit program
                    default:
                        System.out.println("Wrong option");
                        System.out.println("Please enter correct option");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Wrong option type letters");

            }
        }
    }

    public static void displayMenu() {
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.println("    **MENU**    ");
        System.out.println("Please select an option: ");
        System.out.println("1) Buy a ticket ");
        System.out.println("2) Print seating area ");
        System.out.println("3) Cancel ticket ");
        System.out.println("4) List available seats ");
        System.out.println("5) Save to file ");
        System.out.println("6) Load from file ");
        System.out.println("7) Print ticket information and total price ");
        System.out.println("8) Sort tickets by price");
        System.out.println("\t 0) Quit");
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println("");

    }

    public static void buy_ticket(ArrayList<Ticket>ticket_array) {

        int k = 0;
        int row_num, seat_num;
        while (k != 1) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter row number: ");
                row_num = input.nextInt();
                Scanner input_1 = new Scanner(System.in);
                System.out.print("Enter seat number: ");
                seat_num = input_1.nextInt();
                if (0 < row_num && row_num <= 3) {
                    if (row_num == 1) {
                        if (0 < seat_num && seat_num <= row_1.length) {
                            int seatValue = row_1[seat_num - 1];
                            if (seatValue == 0) {
                                System.out.println("Your sheet is avialable");
                                row_1[seat_num - 1] = 1;
                                System.out.println("Sheet number is: " + "row_num: " + row_num + " sheet_num: " + seat_num);

                            } else {
                                System.out.println("seat is booked");
                                continue;
                            }

                        } else {
                            System.out.println("Wrong input for seat");
                            continue;
                        }
                    } else if (row_num == 2) {
                        if (0 < seat_num && seat_num <= row_2.length) {
                            int seatValue = row_2[seat_num - 1];
                            if (seatValue == 0) {
                                System.out.println("Your sheet is avialable");
                                row_2[seat_num - 1] = 1;
                                System.out.println("Sheet number is: " + "row_num: " + row_num + " sheet_num: " + seat_num);

                            } else {
                                System.out.println("seat is booked");
                                continue;
                            }

                        } else {
                            System.out.println("Wrong input for seat");
                            continue;
                        }
                    } else if (row_num == 3) {
                        if (0 < seat_num && seat_num <= row_3.length) {
                            int seatValue = row_3[seat_num - 1];
                            if (seatValue == 0) {
                                System.out.println("Your sheet is avialable");
                                row_3[seat_num - 1] = 1;
                                System.out.println("Sheet number is: " + "row_num: " + row_num + " sheet_num: " + seat_num);


                            } else {
                                System.out.println("seat is booked");
                                continue;
                            }

                        } else {
                            System.out.println("Wrong input for seat");
                            continue;
                        }
                    }


                } else {
                    System.out.println("row number out of range");
                    continue;

                }

            } catch (Exception e) {
                System.out.println("Wrong input type ");
                continue;
            }
            personal_data(row_num,seat_num,ticket_array);// call personal_data
            System.out.println("");
            displayMenu();//call display method
            k = 1;

        }
    }

    public static void print_seating_area() {

        System.out.println("");

        System.out.println("     *********** \n     *  STAGE  *\n     ***********");
        System.out.print("    ");
        for(int i=0;i<row_1.length;i++){
            if(row_1[i]==1){
                System.out.print("X");
            }
            else {
                System.out.print("O");
            }
            if(i==5){
                System.out.print(" ");
            }
        }
        System.out.println("");
        System.out.print("  ");
        for(int i=0;i<row_2.length;i++){
            if(row_2[i]==1){
                System.out.print("X");
            }
            else {
                System.out.print("O");
            }
            if(i==7){
                System.out.print(" ");
            }
        }
        System.out.println("");
        System.out.print("");
        for(int i=0;i<row_3.length;i++){
            if(row_3[i]==1){
                System.out.print("X");
            }
            else {
                System.out.print("O");
            }
            if(i==9){
                System.out.print(" ");
            }
        }
        System.out.println("");
        displayMenu();
        System.out.println("");

    }

    public static void cancel_ticket(ArrayList<Ticket>ticket_array) {

        char choice = 'b';
        while (choice != 'q') {
            try {

                Scanner input = new Scanner(System.in);
                System.out.println("Do yo want to go continue?");
                System.out.println("Continue to 'C' and menue to 'Q'");
                choice = input.next().toLowerCase().charAt(0);
                if(choice=='c'){

                    System.out.print("Enter row number: ");
                    cancel_row = input.nextInt();
                    System.out.print("Enter seat number: ");
                    cancel_seet = input.nextInt();
                    if (0 < cancel_row && cancel_row <= 3) {
                        if (cancel_row == 1) {
                            if (cancel_seet <= row_1.length) {
                                int seatValue = row_1[cancel_seet - 1];
                                if (seatValue == 1) {
                                    System.out.println("Your can delete sheet");
                                    row_1[cancel_seet - 1] = 0;
                                    System.out.println("row_num:" + cancel_row + " sheet_num: " + cancel_seet+" sheet deleted");
                                    System.out.println("Delete successfully");

                                } else {
                                    System.out.println("wrong input ");
                                    continue;
                                }
                            }
                        } else if (cancel_row == 2) {
                            if (cancel_seet <= row_2.length) {
                                int seatValue = row_2[cancel_seet - 1];
                                if (seatValue == 1) {
                                    System.out.println("Your can delete sheet");
                                    row_2[cancel_seet - 1] = 0;
                                    System.out.println("Sheet number is: " + "row_num: " + cancel_row + " sheet_num: " + cancel_seet+" sheet deleted");
                                    System.out.println("Delete successfully");

                                } else {
                                    System.out.println("wrong input ");
                                    continue;
                                }
                            }
                        } else if (cancel_row == 3) {
                            if (cancel_seet <= row_3.length) {
                                int seatValue = row_3[cancel_seet - 1];
                                if (seatValue == 1) {
                                    System.out.println("Your can delete sheet");
                                    row_3[cancel_seet - 1] = 0;
                                    System.out.println("Sheet number is: " + "row_num: " + cancel_row + " sheet_num: " + cancel_seet+" sheet deleted");
                                    System.out.println("Delete successfully");

                                } else {
                                    System.out.println("wrong input ");
                                    continue;
                                }
                            }
                        } else {
                            System.out.println("out of range");
                            continue;
                        }
                    } else {
                        System.out.println("wrong input ");
                        continue;
                    }

                    for (int i = 0; i < ticket_array.size(); i++) {
                        if ((cancel_row == ticket_array.get(i).getRow()) && (cancel_seet == ticket_array.get(i).getSeat())) {

                            total = total - ticket_array.get(i).getPrice();// remove getPrice from ticket object
                            ticket_array.remove(i);//  remove ticket object
                        }
                    }

                    choice='q';// end while loop

                }



            }
            catch (Exception e) {
                System.out.println("Wrong input");

            }
        }
        displayMenu();
    }


    public static void show_available() {

        System.out.print("Seats available in row 1: ");

        for (int i = 0; i < row_1.length; i++) {

            if (row_1[i] == 0) {
                System.out.print((i + 1) + " , ");

            }
        }
        System.out.print(".");
        System.out.println("");
        System.out.print("Seats available in row 2: ");

        for (int i = 0; i < row_2.length; i++) {
            if (row_2[i] == 0) {
                System.out.print((i + 1) + " , ");

            }
        }
        System.out.print(".");
        System.out.println("");
        System.out.print("Seats available in row 3: ");

        for (int i = 0; i < row_3.length; i++) {
            if (row_3[i] == 0) {
                System.out.print((i + 1) + " , ");

            }
        }
        System.out.print(".");
        System.out.println("");
        displayMenu();

    }

    public static void save() {
        FileWriter myFile = null;//initialize file to null
        try {
            myFile = new FileWriter("Theatre.txt");//create file
            for (int i = 0; i < row_1.length; i++) {

                if (row_1[i] == 1) {
                    myFile.write("1");
                } else if (row_1[i] == 0) {
                    myFile.write("0");
                }
            }
            myFile.write("\n");

            for (int i = 0; i < row_2.length; i++) {

                if (row_2[i] == 1) {
                    myFile.write("1");
                } else if (row_2[i] == 0) {
                    myFile.write("0");
                }
            }
            myFile.write("\n");
            for (int i = 0; i < row_3.length; i++) {

                if (row_3[i] == 1) {
                    myFile.write("1");
                } else if (row_3[i] == 0) {
                    myFile.write("0");
                }
            }
            myFile.close();

        } catch (IOException e) {
            System.out.println("File doesn't create");
        }
        displayMenu();
    }

    public static void load() throws FileNotFoundException {

        File file = new File("Theatre.txt");//read file
        Scanner file_obj = new Scanner(file);// create file object
        String row1R = file_obj.nextLine();
        String row2R = file_obj.nextLine();
        String row3R = file_obj.nextLine();
        System.out.println(row1R);
        System.out.println(row2R);
        System.out.println(row3R);

        for (int i = 0; i < row_1.length; i++) {
            row_1[i] = Integer.parseInt(String.valueOf(row1R.charAt(i)));//char value convert intiger
        }
        for (int i = 0; i < row_2.length; i++) {
            row_2[i] = Integer.parseInt(String.valueOf(row2R.charAt(i)));//char value convert intiger
        }
        for (int i = 0; i < row_3.length; i++) {
            row_3[i] = Integer.parseInt(String.valueOf(row3R.charAt(i)));//char value convert intiger
        }
        displayMenu();
    }

    public static void show_tickets(ArrayList<Ticket>ticket_array) {

        for (int i = 0; i < ticket_array.size(); i++) {
            System.out.println("Name: " + ticket_array.get(i).getPerson().getName());
            System.out.println("SurName: " + ticket_array.get(i).getPerson().getSurname());
            System.out.println("Email: " + ticket_array.get(i).getPerson().getEmail());
            System.out.println("Price:" + ticket_array.get(i).getPrice()+" $");
            System.out.println("Row: " + ticket_array.get(i).getRow());
            System.out.println("Seat: " + ticket_array.get(i).getSeat());
            System.out.println("");
        }
        System.out.println("Total: " + total + " $");
        displayMenu();
    }

    public static void short_tickets(ArrayList<Ticket>ticket_array) {
        System.out.println("");
        for (int i = 0; i < ticket_array.size(); i++) {
            if (ticket_array.get(i).getPrice() == 50) {
                System.out.println("Name: " + ticket_array.get(i).getPerson().getName());
                System.out.println("Surname: " + ticket_array.get(i).getPerson().getSurname());
                System.out.println("Email: " + ticket_array.get(i).getPerson().getEmail());
                System.out.println("Row number: " + ticket_array.get(i).getRow());
                System.out.println("Seet number: " + ticket_array.get(i).getSeat());
                System.out.println("Price: " + ticket_array.get(i).getPrice() + " $");
                System.out.println("");
            }
        }
        for (int i = 0; i < ticket_array.size(); i++) {
            if (ticket_array.get(i).getPrice() == 100) {
                System.out.println("Name: " + ticket_array.get(i).getPerson().getName());
                System.out.println("Surname: " + ticket_array.get(i).getPerson().getSurname());
                System.out.println("Email: " + ticket_array.get(i).getPerson().getEmail());
                System.out.println("Row number: " + ticket_array.get(i).getRow());
                System.out.println("Seet number: " + ticket_array.get(i).getSeat());
                System.out.println("Price: " + ticket_array.get(i).getPrice() + " $");
                System.out.println("");
            }
        }
        displayMenu();
    }
    public static void personal_data(int row_num,int seat_num,ArrayList<Ticket>ticket_array) {//create persona_data method
        int l = 0;
        String email = null;
        while (l != 1) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("");
                System.out.println("Full ticket 100$ and half ticket 50$");
                System.out.println("Full ticket to f and half ticket to h");
                char choice = input.next().toLowerCase().charAt(0);// lowercase all characters
                double price = 0;
                if (choice == 'f') {
                    price = 100;
                } else if (choice == 'h') {
                    price = 50;
                } else {
                    System.out.println("Wrong input");
                    continue;
                }
                System.out.print("Enter your name: ");
                String name = input.next();
                System.out.print("Enter your surname: ");
                String surname = input.next();
                int u=0;
                while(u!=1){
                    System.out.print("Enter your email : ");
                    email = input.next();
                    if(email.contains("@")){
                        Person person_obj = new Person(name, surname, email);
                        person_obj.setName(name);// set the name
                        person_obj.setSurname(surname);// set the Surname
                        person_obj.setEmail(email);// set the email

                        Ticket ticket_obj = new Ticket(row_num, seat_num, price, person_obj);// pass value to ticket object
                        Ticket.print(ticket_obj);// print personal informaton

                        total +=price;// calculate total
                        ticket_array.add(ticket_obj);// add ticket  object
                        u=1;
                    }
                    else {
                        System.out.println("Invalied email");
                        continue;
                    }
                }
                l = 1;//exit while loop
            } catch (Exception e) {
                System.out.println("Wrong input");
            }
        }
    }
}



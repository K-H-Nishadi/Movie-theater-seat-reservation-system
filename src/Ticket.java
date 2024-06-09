public class Ticket {
    private int row_num;
    private int seat_num;
    private double price;

    Person person_obj;
    public Ticket(){

    }
    public Ticket(int row_num, int seat_num, double price, Person person_obj){
        this.row_num = row_num;
        this.seat_num = seat_num;
        this.price = price;
        this.person_obj = person_obj;
    }
    public int getRow(){return row_num;}// get row_num

    public void setRow(int row){
        this.row_num =row;
    }// set row_num
    public int getSeat(){return seat_num;}// get seat

    public void setSeat(int seat){
        this.seat_num = seat;
    }//set seat
    public Person getPerson(){return person_obj;}// get person

    public void setPerson(Person person_obj){
        this.person_obj=person_obj;
    }//set person object
    public double getPrice(){return price;}//get price

    public void setPrice(int price){
        this.price=price;
    }
    public static void print(Ticket ticket_obj){
        System.out.println("Name- "+ticket_obj.getPerson().getName());
        System.out.println("Surname - "+ticket_obj.getPerson().getSurname());
        System.out.println("Email- "+ticket_obj.getPerson().getEmail());
        System.out.println("Row number is- "+ ticket_obj.getRow());
        System.out.println("Seat number is- "+ ticket_obj.getSeat());
        System.out.println("Price "+ticket_obj.price+" $");
    }


}


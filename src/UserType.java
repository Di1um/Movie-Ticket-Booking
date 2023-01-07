public class UserType {

    String[] CustomerType ={"Adult", "Children"};
    String[] CustomerPrice = {"600 LKR", "400LKR"};

    public void invoice(String Ticket, String Movie, String time, int type){
        System.out.println("Your ticket seat has been reserved");
        System.out.println("Your invoice \n");
        System.out.println("Movie \t  Time  \t Total");
        type = type - 1;
        System.out.println(Movie+ "\t"+ time +"\t"+CustomerPrice[type]);

    }


}

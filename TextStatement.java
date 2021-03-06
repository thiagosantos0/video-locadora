import java.util.Enumeration;
public class TextStatement extends Statement {

    public String getResult(Customer aCustomer){
        return "Rental Record for " + aCustomer.getName() +
                "\n";
    }

    public String addInfoToResult(Rental each){
        return "\t" + each.getMovie().getTitle()+ "\t" +
                String.valueOf(each.getCharge()) + "\n";
    }

    public String addFooterLines(Customer aCustomer){
        String aux = "Amount owed is " +
                String.valueOf(aCustomer.getTotalCharge()) + "\n";

        aux += "You earned " +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                " frequent renter points";

        return aux;
    };
}
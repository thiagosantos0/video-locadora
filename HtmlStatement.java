import java.util.Enumeration;

public class HtmlStatement extends Statement {

    public String getResult(Customer aCustomer){
        return  "<H1>Rentals for <EM>" + aCustomer.getName() +
                "</EM></H1><P>\n";
    }

    public String addInfoToResult(Rental each){
        return each.getMovie().getTitle() + ": " +
                String.valueOf(each.getCharge()) + "<BR>\n";
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
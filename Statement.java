import java.util.Enumeration;

public abstract class Statement {

    public abstract String getResult(Customer aCustomer);

    public abstract String addInfoToResult(Rental each);

    public abstract String addFooterLines(Customer aCustomer);

    //Método Template
    public String value(Customer aCustomer){
        Enumeration rentals = aCustomer.getRentals();
        String result = getResult(aCustomer); //
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            result += addInfoToResult(each);
        }
        //add footer lines
        result += addFooterLines(aCustomer);
        return result;
    }
}
package classes.beans;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Operator {
    private String operatorName;
    private List<Customer> customerList = new ArrayList<>();

    public Operator(String operatorName) {
        this.operatorName = operatorName;
    }

    public void addCustomer(Customer customer) {
        if (customer != null) {
            customerList.add(customer);
        }
    }

    public String getOperatorName() {
        return operatorName;
    }

    public List<Customer> getCustomesByAlphabet() {
        List<Customer> custlist = new ArrayList<>(customerList);
        custlist.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getSurname().compareToIgnoreCase(o2.getSurname() + o1.getName().compareToIgnoreCase(o2.getName()));
            }
        });
        return custlist;
    }

    public List<Customer> getCustomersByInternational(long timeInternational) {
        List<Customer> custlist = new ArrayList<>();
        customerList.forEach(a -> {
            if (a.getTimeInternational() > timeInternational){
                custlist.add(a);
            }
        });
        return custlist;
    }

    public List<Customer> getCustomersByLocal(long timeLocal) {
        List<Customer> custlist = new ArrayList<>();
        customerList.forEach(a -> {
           if (a.getTimeLocal() > timeLocal){
               custlist.add(a);
           }
        });

        return custlist;
    }

}

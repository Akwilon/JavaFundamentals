package classes;

import classes.beans.Customer;
import classes.beans.Operator;

public class PhoneRunner {

    public static void main(String... args){

        Operator operator = new Operator("Vodafone");
        generateCustomers(operator);
        System.out.println("Customers: ");
        System.out.println(operator.getCustomesByAlphabet());

        System.out.println("Customers with internationalTime bigger than 2500: ");
        System.out.println(operator.getCustomersByInternational(2500));

        System.out.println("Customers with localtime bigger than 100: ");
        System.out.println(operator.getCustomersByLocal(100));

    }





    private static void generateCustomers(Operator operator){
        operator.addCustomer(new Customer("Pupkin","Vasiliy","Ivanovich"));
        operator.addCustomer(new Customer("Ivanov","Pyotr","Ignatovich")
                .setAddress("Vitebsk").setCardNumber(3256347458L).setCredit(250).setDebit(6789)
                .setTimeLocal(563).setTimeInternational(56674));
        operator.addCustomer(new Customer("Ivanova","Ekaterina","Vadimovna")
                .setAddress("Pinsk").setCardNumber(32562627458L).setCredit(355).setDebit(872)
                .setTimeLocal(34).setTimeInternational(567));
        operator.addCustomer(new Customer("Moroz","Maksim","Petrovich")
                .setAddress("Zitomir").setCardNumber(34985347458L).setCredit(988).setDebit(214562)
                .setTimeLocal(456).setTimeInternational(1632));
        operator.addCustomer(new Customer("Tutchev","Ivan","Ivanovich")
                .setAddress("Vilnius").setCardNumber(322512347458L).setCredit(452).setDebit(981)
                .setTimeLocal(14).setTimeInternational(0));
        operator.addCustomer(new Customer("Peskov","Vladimir","Vladimirovich")
                .setAddress("Tallin").setCardNumber(98216347458L).setCredit(2346).setDebit(99999)
                .setTimeLocal(1092).setTimeInternational(3));
    }

}

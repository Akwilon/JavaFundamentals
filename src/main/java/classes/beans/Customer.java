package classes.beans;

import java.util.Objects;
import java.util.StringJoiner;

public class Customer {
    private static int totalCustomers = 0;
    private final int id = totalCustomers++;

    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private long cardNumber;
    private double debit;
    private double credit;
    private long timeLocal;
    private long timeInternational;

    public Customer(String surname, String name, String patronymic, String address,
             long cardNumber, double debit, double credit,
             long timeLocal, long timeInternational){

        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.debit = debit;
        this.credit = credit;
        this.timeLocal = timeLocal;
        this.timeInternational = timeInternational;
    }

    public Customer(String surname, String name, String patronymic, long cardNumber) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = "Minsk";
        this.cardNumber = cardNumber;
        this.debit = 5000;
        this.credit = 10000;
        this.timeLocal = 0;
        this.timeInternational = 0;
    }


    public Customer(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = "Minsk";
        this.cardNumber = 8889104807126L;
        this.debit = 5000;
        this.credit = 10000;
        this.timeLocal = 0;
        this.timeInternational = 0;
    }


    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public double getDebit() {
        return debit;
    }

    public double getCredit() {
        return credit;
    }

    public long getTimeLocal() {
        return timeLocal;
    }

    public long getTimeInternational() {
        return timeInternational;
    }

    public Customer setAddress(String address) {
        this.address = address;
        return this;
    }

    public Customer setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public Customer setDebit(double debit) {
        this.debit = debit;
        return this;
    }

    public Customer setCredit(double credit) {
        this.credit = credit;
        return this;
    }

    public Customer setTimeLocal(long timeLocal) {
        this.timeLocal = timeLocal;
        return this;
    }

    public Customer setTimeInternational(long timeInternational) {
        this.timeInternational = timeInternational;
        return this;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Customer.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("surname='" + surname + "'")
                .add("name='" + name + "'")
                .add("patronymic='" + patronymic + "'")
                .add("address='" + address + "'")
                .add("cardNumber=" + cardNumber)
                .add("debit=" + debit)
                .add("credit=" + credit)
                .add("timeLocal=" + timeLocal)
                .add("timeInternational=" + timeInternational)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                cardNumber == customer.cardNumber &&
                Double.compare(customer.debit, debit) == 0 &&
                Double.compare(customer.credit, credit) == 0 &&
                timeLocal == customer.timeLocal &&
                timeInternational == customer.timeInternational &&
                surname.equals(customer.surname) &&
                name.equals(customer.name) &&
                patronymic.equals(customer.patronymic) &&
                Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, address, cardNumber, debit, credit, timeLocal, timeInternational);
    }
}

package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InstallMent {
    private static DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate date;
    private Double amount;

    public InstallMent(LocalDate dueDate, Double amount) {
        this.date = dueDate;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return date.format(fmt) + " - " + String.format("2.%f",amount);
    }
}

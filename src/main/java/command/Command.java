package command;

import exception.IncorrectCurrencyException;
import exception.IncorrectFormatException;
import model.PaymentEntry;

import java.util.List;

public abstract class Command {
    protected List<PaymentEntry> history;

    public Command(List<PaymentEntry> history) {
        this.history = history;
    }

    public abstract void execute(String[] params) throws IncorrectFormatException, IncorrectCurrencyException;
}

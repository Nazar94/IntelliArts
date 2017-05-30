package command;

import exception.IncorrectFormatException;
import model.PaymentEntry;
import utils.Utils;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class DeleteCommand extends Command {
    public DeleteCommand(List<PaymentEntry> history) {
        super(history);
    }

    public void execute(String[] params) throws IncorrectFormatException {
        if(params.length != 2) {
            throw new IncorrectFormatException();
        }
        Date date = Utils.parseDate(params[1]);
        history.removeAll(history.stream().filter(e -> e.getDate().equals(date))
                .collect(Collectors.toList()));
    }
}
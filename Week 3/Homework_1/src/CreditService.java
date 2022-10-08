import jdk.jshell.spi.ExecutionControl;

public interface CreditService {
    void calculate();

    void save() throws ExecutionControl.NotImplementedException;
}

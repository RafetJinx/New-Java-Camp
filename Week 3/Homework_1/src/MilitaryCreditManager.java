import jdk.jshell.spi.ExecutionControl;

public class MilitaryCreditManager implements CreditService{
    @Override
    public void calculate() {
        System.out.println("Asker kredisi hesaplandı.");
    }

    @Override
    public void save() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }
}

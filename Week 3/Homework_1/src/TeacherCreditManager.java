import jdk.jshell.spi.ExecutionControl;

public class TeacherCreditManager implements CreditService {
    @Override
    public void calculate() {
        System.out.println("Öğretmen kredisi hesaplandı.");
    }

    @Override
    public void save() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }
}

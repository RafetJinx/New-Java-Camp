public class TeacherCreditManager extends BaseCreditManager implements CreditService {
    @Override
    public void calculate() {
        System.out.println("Öğretmen kredisi hesaplandı.");
    }

    @Override
    public void save() {
        // Teacher için farklı hesaplamalar yapılmak istenirse..
        super.save();
    }
}

public abstract class BaseCreditManager implements CreditService{

    @Override
    public abstract void calculate();

    @Override
    public void save(){
        System.out.println("Kaydedildi.");
    }
}

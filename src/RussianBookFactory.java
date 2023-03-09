public class RussianBookFactory implements Bookfactory{

    @Override
    public Textbook createTextbook() {
        return new RussianTextbook();
    }

    @Override
    public Fiction createFiction() {
        return new RussianFiction();
    }
}

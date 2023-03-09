public class EnglishBookFactory implements Bookfactory{

    @Override
    public Textbook createTextbook() {
        return new EnglishTextbook();
    }

    @Override
    public Fiction createFiction() {
        return new EnglishFiction();
    }
}

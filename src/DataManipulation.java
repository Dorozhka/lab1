import java.lang.reflect.Array;
import java.util.ArrayList;

public class DataManipulation {
    ArrayList<Bookable> Books;
    public DataManipulation() {

    }
    public void generateData(){
        Bookfactory factory;
        ArrayList<Bookable> BookList = new ArrayList<Bookable>();
        int i = 0;
        while (i<100){
            int R = i - (int)Math.floor(i/4)*4;
            switch (R){
                case 0: {
                    factory = new RussianBookFactory();
                    BookList.add(factory.createFiction());
                    break;
                }
                case 1: {
                    factory = new RussianBookFactory();
                    BookList.add(factory.createTextbook());
                    break;
                }
                case 2: {
                    factory = new EnglishBookFactory();
                    BookList.add(factory.createFiction());
                    break;
                }
                case 3: {
                    factory = new EnglishBookFactory();
                    BookList.add(factory.createTextbook());
                    break;
                }
            }
            i++;
        }


        Books = BookList;
    }
}

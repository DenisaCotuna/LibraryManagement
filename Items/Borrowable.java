package Items;

import Exceptions.NotEnoughCopiesException;

public interface Borrowable {
    public void borrowItem(Integer NoCopies) throws NotEnoughCopiesException;
    public void returnItem(Integer NoCopies);
}

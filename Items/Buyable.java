package Items;

import Exceptions.NotEnoughCopiesException;

public interface Buyable{
    public void buyItem(Integer NoCopies) throws NotEnoughCopiesException;
}

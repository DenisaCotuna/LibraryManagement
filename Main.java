import Exceptions.InvalidItemTypeException;
import Exceptions.NegativeNumberException;
import Exceptions.NotEnoughCopiesException;
import io.InputDevice;
import io.OutputDevice;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, NegativeNumberException, NotEnoughCopiesException, InvalidItemTypeException {
        InputDevice id = new InputDevice(System.in);
        OutputDevice od = new OutputDevice(System.out);
        Application app = new Application(id,od);
        if(args.length == 0)  app.run();
        else{
            for (String argument:args)
            {
                System.out.println(argument);
            }
        }
    }
}
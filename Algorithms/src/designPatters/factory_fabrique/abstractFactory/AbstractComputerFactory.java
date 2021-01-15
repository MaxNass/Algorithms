package designPatters.factory_fabrique.abstractFactory;

import designPatters.factory_fabrique.Computer;

public class AbstractComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}


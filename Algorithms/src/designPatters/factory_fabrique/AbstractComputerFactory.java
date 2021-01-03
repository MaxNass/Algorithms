package designPatters.factory_fabrique;

public class AbstractComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}


package designPatters.factory_fabrique;

import designPatters.factory_fabrique.abstractFactory.AbstractComputerFactory;
import designPatters.factory_fabrique.abstractFactory.PCFactory;
import designPatters.factory_fabrique.abstractFactory.ServerFactory;

public class Main {

    public static void main(String[] args) {

        // Factory est un design pattern de construction
        // Abstract Factory est un ensemble de factory
        // C'est un design pattern permettant de séparer la création d'objets dérivant d'une classe mère de leur utilisation
        // Le design pattern factory permet de détacher les constructeurs des objets génériques
        // Répondre au principle DIP -Dependency Inversion principle- qui consiste à dire que les objets de forte valeur métier ne doivent pas dépendre des objets de faible valeur métier
        // Répondre au principle ISP -Interface segregation principal - un client ne doit pas dépendre d'interfaces qui ne lui correspondent pas

        // Without abstraction

        final Computer pc = ComputerFactory.getComputer("pc","2GB","500GB","2.4GHz");
        final Computer server = ComputerFactory.getComputer("server","16GB","1TB","2.9GHz");

        System.out.println("Factory PC Configuration : " + pc);
        System.out.println("Factory Server Configuration : " + server);

        // With abstraction

        final Computer pc_factory = AbstractComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        final Computer server_factory = AbstractComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));

        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);


    }

}

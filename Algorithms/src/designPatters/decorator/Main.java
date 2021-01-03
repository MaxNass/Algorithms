package designPatters.decorator;

public class Main {


    // 1 - Ajout dynamique de responsabilité a un objet
    // 2 - On peut décorer un objet avec plusieurs décorateurs
    // 3 - On peut utiliser les décorateurs dans n'importe quel ordre
    // 4 - Le design pattern Decorator est une alternative à l'héritage

        public static void main(String[] args)
        {
            Voiture v1 = new Corsa();
            System.out.println(v1);

            Voiture v2 = new C2();
            v2 = new Regulateur(v2);
            System.out.println(v2);

            Voiture v3 = new Corsa();
            v3 = new ToitOuvrant(v3);
            v3 = new GPS(v3);
            System.out.println(v3);
        }
}

package ec.edu.ups.prueba;

import ec.edu.ups.clases.Juego;
import ec.edu.ups.clases.Aventura;
import ec.edu.ups.clases.Bingo;
import ec.edu.ups.clases.Deporte;
import ec.edu.ups.clases.Poker;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.clases.Juego;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Prueba {


    public static void main(String[] args) {
        /**
         * cracion de Lista con nombre Juego
         */
        //List<Juego> lista = new ArrayList<>();
        /**
         * Ingreso de datos de cada clase hija
         */
        //Aventura aventura = new Aventura("Llegar al castillo", "Rescatar a la Princesa", "Monedas", "Mapa 1", true, true, "Nintendo 64", "2D", 1, "Super Mario", "+ 7 anos", 1);
        //Aventura aventura1 = new Aventura("Llegar al castillo", "Rescatar a la Princesa", "Monedas", "Mapa 1", true, true, "Nintendo 64", "2D", 2, "Super Mario", "+ 7 anos", 1);
        //Deporte deporte = new Deporte("FC Barcelona vs Real Madrid", "5 Minutos", true, true, true, true, "Play Station 4", "3D", 2, "FIFA 19", "+ 10 anos", 4);
        Aventura aventura = new Aventura();
        aventura.setCodigo(1);
        aventura.setNombre("Mario");
        Aventura aventura1 = new Aventura();
        aventura1.setCodigo(10);
        aventura1.setNombre("Zelda");

        Deporte deporte = new Deporte();
        deporte.setCodigo(1);
        if (aventura.equals(aventura1)) {
            System.out.println("son iguales");
        } else {
            System.out.println("no son iguales");
        }

        Set<Aventura> lista = new HashSet<>();

        lista.add(aventura);
        lista.add(aventura1);

        for (Aventura aventur : lista) {
            System.out.println("Aventura: " + aventur.getNombre());
        }

        if (lista.contains(aventura)) {
            System.out.println("si existe");
        }
        "Aventura1".compareTo("Aventura");
        System.out.println("Aventura".compareTo("Aventura"));//comparacion

        SortedSet<Aventura> listaOrdenada = new TreeSet<>();
        listaOrdenada.add(aventura);
        listaOrdenada.add(aventura1);

        System.out.println("lista ordenada");
        for (Aventura aventuraOrdenada : listaOrdenada) {
            System.out.println(aventuraOrdenada.getNombre());

        }

        //Bingo bingo = new Bingo(1, 12, "Television", true, 2, true, "Franklin", "Tabla llena", 1, "Bingo Bailable", "Todo Publico", 10);
        //Poker poker = new Poker(100, 3, 200, "A♥K♥", 1, true, "Carlos", "Texas", 3, "Poker Texas", "+ 18", 8);
        /**
         * Se guarda en la lista creada anteiormente
         *
         * lista.add(aventura); lista.add(deporte); lista.add(bingo);
         * lista.add(poker);
         *
         * /**
         * recorre lista y se realiza el cansting y el instanceof e imprime
         */
        /**
         * for (Juego juego : lista) { if (juego instanceof Aventura) { Aventura
         * temp = (Aventura) juego; System.out.println(temp); } else if (juego
         * instanceof Deporte) { Deporte temp = (Deporte) juego;
         * System.out.println(temp); } else if (juego instanceof Bingo) { Bingo
         * temp = (Bingo) juego; System.out.println(temp); } else if (juego
         * instanceof Poker) { Poker temp = (Poker) juego;
         * System.out.println(temp); }
         *
         * /**
         * Creacion de juego anonimo e imprimimos
         */
           // Juego anonimo = new Juego(1, "Mortal Kombat", "Mayores 16 años", 2);
        //System.out.println(anonimo);
        //}
        /**
         * imprime las acciones de cada clase
         */
        /**
         * Aventura aventura1 = new Aventura();
         * System.out.println("---------------------------------------------------------");
         * System.out.println("---------------------------------------------------------");
         * System.out.println("\t\t\tAventura"); aventura1.setNombre("Mario
         * Bros"); aventura1.setNumeroJugadores(2); aventura1.partidaInicio();
         * aventura1.partidaTerminada(); aventura1.Multijugador();
         * System.out.println("---------------------------------------------------------");
         *
         * Deporte deporte1 = new Deporte();          *
         * System.out.println("---------------------------------------------------------");
         * System.out.println("\t\t\tDeporte"); deporte1.setNombre("FIFA 19");
         * deporte1.setNumeroJugadores(4); deporte1.Multijugador();
         * deporte1.partidaInicio(); deporte1.partidaTerminada();
         * System.out.println("---------------------------------------------------------");
         *
         * Bingo bingo1 = new Bingo();
         *
         * System.out.println("---------------------------------------------------------");
         * System.out.println("\t\t\tBingo"); bingo1.setNombre("Bingo
         * Bailable"); bingo1.Reglas(); bingo1.partidaInicio();
         * bingo1.partidaTerminada();
         *
         * System.out.println("---------------------------------------------------------");
         * Poker poker1 = new Poker();
         * System.out.println("---------------------------------------------------------");
         * System.out.println("\t\t\tPoker"); poker1.setNombre("Poker Texas");
         * poker1.setNumeroJugadores(8); poker1.Reglas();
         * poker1.partidaInicio(); poker1.partidaTerminada();
         * System.out.println("---------------------------------------------------------");
         * System.out.println("---------------------------------------------------------");
         */
    }
}

//}

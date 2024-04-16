import java.util.ArrayList;
import java.util.Scanner;

public class App {

    // Usuario de administracion ya creado ya que no solo se puede crear uno
    String UserId = "Admin123";
    String UserPassword = "Password123";

    // Movies
    static ArrayList<String> movieName = new ArrayList<String>();

    static ArrayList<String> movieCost = new ArrayList<String>();

    static ArrayList<String> movieDays = new ArrayList<String>();

    static ArrayList<String> movieGenre = new ArrayList<String>();

    static ArrayList<String> movieYear = new ArrayList<String>();

    static ArrayList<Integer> movieStatus = new ArrayList<Integer>();

    // Videogames
    static ArrayList<String> videogameName = new ArrayList<String>();

    static ArrayList<String> videogameCost = new ArrayList<String>();

    static ArrayList<String> videogameDays = new ArrayList<String>();

    static ArrayList<String> videogameType = new ArrayList<String>();

    static ArrayList<String> videogamePlatform = new ArrayList<String>();

    static ArrayList<Integer> videogameStatus = new ArrayList<Integer>();

    public static void data() {

        // Movies

        movieName.add("Jaws");
        movieName.add("Star Wars 3");
        movieName.add("Mission Impossible");
        movieName.add("Frozen");
        movieName.add("Toy Story 2");

        movieCost.add("$10.99");
        movieCost.add("$13.99");
        movieCost.add("$12.99");
        movieCost.add("$11.99");
        movieCost.add("$14.99");

        movieDays.add("3");
        movieDays.add("4");
        movieDays.add("5");
        movieDays.add("6");
        movieDays.add("7");

        movieGenre.add("Thriller/Adventure");
        movieGenre.add("Action/Sci-Fi");
        movieGenre.add("Action/Thriller");
        movieGenre.add("Family/Musical");
        movieGenre.add("Comedy/Fantasy");

        movieYear.add("1975");
        movieYear.add("2005");
        movieYear.add("1996");
        movieYear.add("2013");
        movieYear.add("1995");

        movieStatus.add(1);
        movieStatus.add(1);
        movieStatus.add(0);
        movieStatus.add(1);
        movieStatus.add(1);

        // Videogames

        videogameName.add("Minecraft");
        videogameName.add("Terrraria");
        videogameName.add("Call Of Duty");
        videogameName.add("Helldivers");
        videogameName.add("Overcooked");

        videogameCost.add("20.99");
        videogameCost.add("21.99");
        videogameCost.add("22.99");
        videogameCost.add("23.99");
        videogameCost.add("24.99");

        videogameDays.add("3");
        videogameDays.add("4");
        videogameDays.add("5");
        videogameDays.add("6");
        videogameDays.add("7");

        videogameType.add("Survival");
        videogameType.add("Survival");
        videogameType.add("Shooter");
        videogameType.add("Shooter");
        videogameType.add("Indie");

        videogamePlatform.add("Xbox");
        videogamePlatform.add("PC");
        videogamePlatform.add("Playstation");
        videogamePlatform.add("PC");
        videogamePlatform.add("Switch");

        videogameStatus.add(1);
        videogameStatus.add(1);
        videogameStatus.add(0);
        videogameStatus.add(1);
        videogameStatus.add(1);

    }

    // Prints the list of movies
    public static void seeMovies() {
        System.out.println("Peliculas:");
        for (int i = 0; i < movieName.size(); i++) {
            System.out.println(i + ". " + movieName.get(i));
        }
    }

    // Prints the information of the chosen movie
    public static void infoMovies() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("De cual pelicula quiere saber mas?");
        int seleccion = scnr.nextInt();

        System.out.println("Nombre: " + movieName.get(seleccion));
        System.out.println("Costo de renta: " + movieCost.get(seleccion));
        System.out.println("Dias que se puede rentar: " + movieDays.get(seleccion));
        System.out.println("Genero: " + movieGenre.get(seleccion));
        System.out.println("Año: " + movieYear.get(seleccion));
    }

    // Prints the list of videogames
    public static void seeVideogames() {
        System.out.println("Videojuegos:");
        for (int i = 0; i < videogameName.size(); i++) {
            System.out.println(i + ". " + videogameName.get(i));
        }
        infoVideogames();
    }

    // Prints the information of the chosen videogame
    public static void infoVideogames() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("De cual videojuego quiere saber mas?");
        int seleccion = scnr.nextInt();

        System.out.println("Nombre: " + videogameName.get(seleccion));
        System.out.println("Costo de renta: " + videogameCost.get(seleccion));
        System.out.println("Dias que se puede rentar: " + videogameDays.get(seleccion));
        System.out.println("Genero: " + videogameType.get(seleccion));
        System.out.println("Plataforma: " + videogamePlatform.get(seleccion));
    }

    // Prints the list of all products
    public static void seeAll() {
        System.out.println("Peliculas:");
        for (int i = 0; i < movieName.size(); i++) {
            System.out.println(i + ". " + movieName.get(i));
        }

        System.out.println("Videojuegos:");
        for (int i = 0; i < videogameName.size(); i++) {
            System.out.println(i + ". " + videogameName.get(i));
        }

        int i = 0;
    }

    // Shows if a movie is already rented or not
    public static void getMovieStatus() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("De cual pelicula quiere ver el estado de renta?");
        seeMovies();
        int seleccion = scnr.nextInt();

        if (movieStatus.get(seleccion) == 1) {
            System.out.println("Esta pelicula no esta rentada");
        } else {
            System.out.println("Esta pelicula esta rentada");
        }
    }

    // Shows if a videogame is already rented or not
    public static void getVideogameStatus() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("De cual videojuego quiere ver el estado de renta?");
        seeVideogames();
        int seleccion = scnr.nextInt();

        if (videogameStatus.get(seleccion) == 1) {
            System.out.println("Este videojuego no esta rentado");
        } else {
            System.out.println("Este videojuego esta rentado");
        }
    }

    // Detects if a movie is rented or not and if not then it chnages the 0 to a 1
    public static void setMovieStatus() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Que pelicula vas a devolver?");
        seeMovies();
        int seleccion = scnr.nextInt();

        if (movieStatus.get(seleccion) == 1) {
            System.out.println("No puedes devolver una pelicula que ya tenemos");
        } else {
            movieStatus.set(seleccion, 1);
            System.out.println("Gracias por devolver " + movieName.get(seleccion));
        }
    }

    // Detects if a videogame is rented or not and if not then it chnages the 0 to a
    // 1
    public static void setVideogameStatus() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Que videojuego vas a devolver?");
        seeVideogames();
        int seleccion = scnr.nextInt();

        if (videogameStatus.get(seleccion) == 1) {
            System.out.println("No puedes devolver una pelicula que ya tenemos");
        } else {
            videogameStatus.set(seleccion, 1);
            System.out.println("Gracias por devolver" + videogameName.get(seleccion));
        }
    }

    public static void seeVideogamePlatform() {
        String key = "Xbox";
        for (int i = 0; i < videogamePlatform.size(); i++) {
            if (videogamePlatform.get(i) == key) {
                System.out.println(videogameName.get(i));
                break;
            } else {
                System.out.println("No hay videojuegos de Xbox One");
                break;
            }
        }
    }

    // Menu principal
    public static void main(String[] args) throws Exception {

        App ap = new App();
        Scanner scnr = new Scanner(System.in);
        boolean flag = true;
        data();
        while (flag == true) {
            System.out.println("_________________________________________________________");
            System.out.println("Bienvenido!");
            System.out.println("Que le gustaria hacer?");
            System.out.println("_________________________________________________________");
            System.out.println("T/t:  Ver todos los productos");
            System.out.println("_________________________________________________________");
            System.out.println("P/p:  Ver todas las peliculas");
            System.out.println("_________________________________________________________");
            System.out.println("M/m:  Ver informacion de una pelicula");
            System.out.println("_________________________________________________________");
            System.out.println("V/v:  Ver todos los videojuegos");
            System.out.println("_________________________________________________________");
            System.out.println("N/n:  Ver informacion de un videojuego");
            System.out.println("_________________________________________________________");
            System.out.println("S/s:  Checar si una película está rentada");
            System.out.println("_________________________________________________________");
            System.out.println("J/j:  Verifica si un videojuego está o no rentado");
            System.out.println("_________________________________________________________");
            System.out.println("C/c:  Devolver peliculas(s)");
            System.out.println("_________________________________________________________");
            System.out.println("X/x:  Juegos de Xbox One");
            System.out.println("_________________________________________________________");
            System.out.println("U/u:  Salir");
            String selection = scnr.next();

            switch (selection.toUpperCase()) {

                case "T":
                    seeAll();
                    break;

                case "P":
                    seeMovies();
                    break;

                case "M":
                    infoMovies();
                    break;

                case "V": {
                    seeVideogames();
                    break;
                }
                case "N":
                    infoVideogames();
                    break;

                case "S": {
                    getMovieStatus();
                    break;
                }

                case "J": {
                    getVideogameStatus();
                    break;
                }

                case "C": {
                    setMovieStatus();
                    break;
                }

                case "X": {
                    seeVideogamePlatform();
                    break;
                }

                case "U": {
                    flag = false;
                    break;
                }

                default:
                    System.out.println("Opcion Invalida");
            }
        }
    }
}

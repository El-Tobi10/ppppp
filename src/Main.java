public class Main {
    static void main(String[] args) {
        System.out.println("Hola mundo");

        Usuario user1 = new Usuario("Tobias");
        Usuario user2 = new Usuario("Gaby");
        Usuario user3 = new Usuario("Brisa");
        Usuario user4 = new Usuario("Lucas");
        Usuario user5 = new Usuario("Nestor");

        Cancion song1 = new Cancion("La vida loca","Ricky Martin", "5 de mayo de 2001", 2, "RKT");
        Cancion song2 = new Cancion("Tu Turraca","Bon Jovi", "5 de mayo de 1998", 2, "Opera");
        Cancion song3 = new Cancion("El Abecedario","Lgante", "4 de mayo de 2021", 2, "Soul");

        System.out.println(user2.sonAmigos(user3));
        user2.agregarAmigo(user2,user5);
        System.out.println(user2.sonAmigos(user5));
    }
}
package aplicacao;

import dominio.Pessoa;

public class Programa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(1, "Carlos da Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(2, "Joaquim Mota", "joaquim@gmail.com");
        Pessoa p3 = new Pessoa(3, "Marta Regina", "marta@gmail.com");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

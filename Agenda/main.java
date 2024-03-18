package vero.ifc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
	public static void main(String[] args) {
        List<Pessoa> agenda = new ArrayList<>();
        
        agenda.add(new Pessoa("João", "Silva", "1990-01-01", "4444444444444"));
        agenda.add(new Pessoa("Ana", "Paula", "1989-01-01", "1111111"));
        agenda.add(new Pessoa("João", "Santos", "1991-01-01", "2222222222"));
        agenda.add(new Pessoa("João", "Silva", "1980-01-01", "33333333333"));
        

        System.out.println("Coleção antes de ordenar:");
        for (Pessoa pessoa : agenda) {
            System.out.println(pessoa);
        }

        Collections.sort(agenda);

     
        System.out.println("\nColeção após ordenar:");
        for (Pessoa pessoa : agenda) {
            System.out.println(pessoa);
        }
    }

}

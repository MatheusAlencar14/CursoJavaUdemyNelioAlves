package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramListas {
    public static void main(String[] args) {
        //Criando uma lista
        List<String> list = new ArrayList<>();
        //Adicionando elementos à lista
        list.add("Matheus");
        list.add("Alessandra");
        list.add("Fernanda");
        list.add("William");
        list.add("Wesley");
        list.add("Maria");
        list.add("Rafael");
        list.add(2, "Clô");
        //Imprimindo quantidade de elementos na lista
        System.out.println(list.size());
        //Imprimindo os elementos da lista com for each
        for (String nome : list) {
            System.out.println(nome);
        }
        System.out.println("------------");
        //Removendo elementos da lista
        list.remove(3);
        list.removeIf(xy -> xy.charAt(0) == 'R');
        for (String nome : list) {
            System.out.println(nome);
        }

        System.out.println("------------");
        //Encontrar a posição de um elemento na lista (quando não há ele retorna -1)
        System.out.println("Index of Clô: " + list.indexOf("Clô"));
        System.out.println("Index of Rafael: " + list.indexOf("Rafael"));

        System.out.println("------------");
        //Filtrar elementos da lista
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'W').collect(Collectors.toList());
        for (String nome : result) {
            System.out.println(nome);
        }

        System.out.println("------------");
        //Encontrar um elemento a partir de um predicado (se não houver, retorna null)
        String nome1 = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(nome1);
        String nome2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(nome2);
    }
}

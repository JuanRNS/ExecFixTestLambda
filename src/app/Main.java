package app;

import entities.Func;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo: ");
        String arquivo = sc.nextLine();
        List<Func> funcs = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(arquivo));


            String linha = br.readLine();
            while (linha != null) {
                String[] linhaSplit = linha.split(",");
                funcs.add(new Func(linhaSplit[0], linhaSplit[1], Double.parseDouble(linhaSplit[2])));
                linha = br.readLine();
            }
            List<String> email = funcs.stream()
                    .filter(x -> x.getSalary() > 2000.00)
                    .map(Func::getEmail)
                    .sorted()
                    .toList();

            email.forEach(System.out::println);

            double sum = funcs.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .mapToDouble(Func::getSalary)
                    .sum();

            System.out.println("Salário das pessoas que começam com a letra M: " + sum);

        }catch(IOException e){
                System.out.println("Erro ao abrir arquivo" + e.getMessage());

            }
        }
    }



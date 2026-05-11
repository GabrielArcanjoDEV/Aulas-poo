package br.com.dobackaofront;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("aula de hashmap");

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<String, String> usuarios = new HashMap<String, String>();
        // adicionar elementos
        map.put("java", 1);
        map.put("python", 2);
        map.put("C++", 3);
        // chave = cpf, valor = nome
        usuarios.put("0000000000", "olival");
        usuarios.put("1111111111", "maria do carmo");
        usuarios.put("2222222222", "pedro");
        usuarios.put("3333333333", "gabriel");
        usuarios.put("4444444444", "luiza");
        usuarios.put("5555555555", "mario");
        // remover elementos
        System.out.println("o usuario de nome: " + usuarios.remove("0000000000") + " foi removido. ");
        // acessar elementos
        System.out.println("o usuario de nome: " + map.get("java"));
        // interações
        for (Map.Entry<String, String> entry : usuarios.entrySet()) {
            String chave = entry.getKey();
            String valor = entry.getValue();
            System.out.println(" Chave: " + chave + " Valor: " + valor);
        }
        System.out.println("Quantidade de usuarios: " + usuarios.size());
        usuarios.clear();
        System.out.println("depois de apagar os elemnetos da coleção");
        }
    }

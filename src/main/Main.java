package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        File res = new File("res");
        if (res.mkdir()) {
            System.out.println("Каталог res создан"); // Создание res
            //if (res.exists()) System.out.println("Каталог res существует"); // Проверка существования res
            builder.append("Каталог res создан \n");
        }

        File drawables = new File("res//drawables");
        if (drawables.mkdir()) {
            System.out.println("Каталог drawables в каталоге res создан"); // Создание drawables
            //if (drawables.exists()) System.out.println("Каталог drawables в каталоге res существует"); // Проверка существования drawables
            builder.append("Каталог drawables в каталоге res создан \n");
        }

        File vectors = new File("res//vectors");
        if (vectors.mkdir()) {
            System.out.println("Каталог vectors в каталоге res создан"); // Создание vectors
            //if (vectors.exists()) System.out.println("Каталог vectors в каталоге res существует"); // Проверка существования vectors
            builder.append("Каталог vectors в каталоге res создан \n");
        }

        File icons = new File("res//icons");
        if (icons.mkdir()) {
            System.out.println("Каталог icons в каталоге res создан"); // Создание vectors
            //if (icons.exists()) System.out.println("Каталог icons в каталоге res существует"); // Проверка существования vectors
            builder.append("Каталог icons в каталоге res создан \n");
        }

        File src = new File("src");
        if (src.mkdir()) {
            System.out.println("Каталог src создан"); // Создание src
            //if (src.exists()) System.out.println("Каталог src существует"); // Проверка существования src
            builder.append("Каталог src создан \n");
        }

        File main = new File("src//main");
        if (main.mkdir()) {
            System.out.println("Каталог main в каталоге src создан"); // Создание main
            //if (main.exists()) System.out.println("Каталог main в каталоге src существует"); // Проверка существования main
            builder.append("Каталог main в каталоге src создан \n");
        }

        File fileMain = new File("src//main//Main.java");
        try {
            if (fileMain.createNewFile())
                System.out.println("Main.java был создан");
                builder.append("Main.java был создан \n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File fileUtils = new File("src//main//Utils.java");
        try {
            if (fileUtils.createNewFile())
                System.out.println("Utils.java был создан");
                builder.append("Utils.java был создан \n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File test = new File("src//test");
        if (test.mkdir()) {
            System.out.println("Каталог test в каталоге src создан"); // Создание test
            //if (test.exists()) System.out.println("Каталог test в каталоге src существует"); // Проверка существования test
            builder.append("Каталог test в каталоге src создан \n");
        }

        File saveGames = new File("savegames");
        if (saveGames.mkdir()) {
            System.out.println("Каталог savegames создан"); // Создание savegames
            //if (saveGames.exists()) System.out.println("Каталог savegames существует"); // Проверка существования savegames
            builder.append("Каталог savegames создан \n");
        }

        File temp = new File("temp");
        if (temp.mkdir()) {
            System.out.println("Каталог temp создан"); // Создание temp
            //if (temp.exists()) System.out.println("Каталог temp существует"); // Проверка существования temp
            builder.append("Каталог temp создан \n");
        }

        File fileTemp = new File("temp//Temp.txt");
        try {
            if (fileTemp.createNewFile())
                System.out.println("Temp.txt был создан");
                builder.append("Temp.txt был создан \n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String result = builder.toString();
        try (FileWriter writer = new FileWriter("temp//Temp.txt", false)) {
            writer.write(result);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

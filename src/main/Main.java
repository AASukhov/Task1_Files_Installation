package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        File res = new File("res");
        folderCreation("res", res, builder);

        File drawables = new File("res//drawables");
        folderCreation("res//drawables", drawables, builder);

        File vectors = new File("res//vectors");
        folderCreation("res//vectors", vectors, builder);

        File icons = new File("res//icons");
        folderCreation("res//icons", icons, builder);

        File src = new File("src");
        folderCreation("src", src, builder);

        File main = new File("src//main");
        folderCreation("src//main", main, builder);

        File fileMain = new File("src//main//Main.java");
        filesCreation("src//main//Main.java", fileMain, builder);

        File fileUtils = new File("src//main//Utils.java");
        filesCreation("src//main//Utils.java", fileUtils, builder);

        File test = new File("src//test");
        folderCreation("src//test", test, builder);

        File saveGames = new File("savegames");
        folderCreation("savegames", saveGames,builder);

        File temp = new File("temp");
        folderCreation("temp", temp, builder);

        File fileTemp = new File("temp//Temp.txt");
        filesCreation("temp//Temp.txt", fileTemp, builder);

        String result = builder.toString();
        try (FileWriter writer = new FileWriter("temp//Temp.txt", false)) {
            writer.write(result);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void folderCreation (String path, File file, StringBuilder builder) {
        if (file.mkdir()) {
            System.out.println("Каталог " + path + " создан"); // Создание файла
            builder.append("Каталог " + file + " создан\n");
        }
    }

    public static void filesCreation (String path, File file, StringBuilder builder) {
        try {
            if (file.createNewFile())
                System.out.println("Файл "  + path + " был создан");
                builder.append("Файл " + file + " создан\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

package ru.safin.homework07;

public class MenuProduct {
    public static void menu() {
        for (Product p : Product.values())
            System.out.println(p.getNumber() + ". " + "Напиток - " + p.getName() + " | Цена - " + p.getPrice());
    }
}

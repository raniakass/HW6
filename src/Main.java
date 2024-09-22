public class Main {
    public static void main(String[] args) {
        // Создаем оружие для босса
        Weapon bossWeapon = new Weapon();
        bossWeapon.setType(WeaponType.SWORD);
        bossWeapon.setName("Excalibur");

        // Создаем босса
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(100);
        boss.setWeapon(bossWeapon);

        // Печатаем информацию о боссе
        boss.printInfo();

        // Создаем оружие для скелетов
        Weapon skeletonWeapon = new Weapon();
        skeletonWeapon.setType(WeaponType.BOW);
        skeletonWeapon.setName("Ancient Bow");

        // Создаем первого скелета
        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(150);
        skeleton1.setDamage(20);
        skeleton1.setWeapon(skeletonWeapon);
        skeleton1.setArrowsCount(15);

        // Создаем второго скелета
        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(120);
        skeleton2.setDamage(25);
        skeleton2.setWeapon(skeletonWeapon);
        skeleton2.setArrowsCount(10);

        // Печатаем информацию о скелетах
        System.out.println("\nСкелеты:");
        skeleton1.printInfo();
        System.out.println();
        skeleton2.printInfo();
    }
}


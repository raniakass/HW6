public class Boss extends GameEntity {
    private Weapon weapon;

    // Геттеры и сеттеры
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // Метод для вывода информации о боссе
    public void printInfo() {
        System.out.println("Босс:");
        System.out.println("Здоровье: " + getHealth());
        System.out.println("Урон: " + getDamage());
        System.out.println("Оружие: " + weapon.getName() + " (" + weapon.getType() + ")");
    }
}


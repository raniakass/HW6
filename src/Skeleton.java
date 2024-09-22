public class Skeleton extends Boss {
    private int arrowsCount;

    // Геттеры и сеттеры
    public int getArrowsCount() {
        return arrowsCount;
    }

    public void setArrowsCount(int arrowsCount) {
        this.arrowsCount = arrowsCount;
    }

    // Переопределённый метод для вывода информации о скелете
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Количество стрел: " + arrowsCount);
    }
}

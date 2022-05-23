public class Converter {
    double km = 0.00075;
    double kcal = 0.05;
    public double converterKm(int sumMonth) {
        return sumMonth * km;
    }
    public double converterKcal(int sumMonth) {
        return sumMonth * kcal;
    }
}

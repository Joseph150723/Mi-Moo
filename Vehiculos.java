class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void encender() {
        System.out.println("El vehículo " + marca + " está encendido.");
    }
}

class Auto extends Vehiculo {

    public Auto(String marca) {
        super(marca);
    }

    @Override
    public void encender() {
        System.out.println("El auto " + getMarca() + " está encendido y listo para arrancar.");
    }
}

class Motocicleta extends Vehiculo {

    public Motocicleta(String marca) {
        super(marca);
    }

    @Override
    public void encender() {
        System.out.println("La motocicleta " + getMarca() + " está encendida y lista para rodar.");
    }
}

public class Vehiculos {
    public static void main(String[] args) {
        Vehiculo auto = new Auto("Chevrolet");
        Vehiculo moto = new Motocicleta("Ducati");

        auto.encender();
        moto.encender();
    }
}

public class MotorElectricoAdapter extends Motor {
    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter() {
        //super();
        this.motorElectrico = new MotorElectrico();
        System.out.println("Creando adaptador para el motor electrico");
    }

    @Override
    public void encender(){
        System.out.println("Encendiendo adaptador de motor electrico");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor electrico....");
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor electrico");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
}
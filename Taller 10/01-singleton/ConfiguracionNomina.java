public class ConfiguracionNomina {
    private double porcentajeSalud = 0.04;
    private static ConfiguracionNomina instacia;

    private ConfiguracionNomina() {
    }
    public static ConfiguracionNomina getInstancia()
     if (instacnia == null){
        instacia = new ConfiguracionNomina();
    }

    public double getPorcentajeSalud() {
        return porcentajeSalud;
    }

    public void setPorcentajeSalud(double porcentajeSalud) {
        this.porcentajeSalud = porcentajeSalud;
    }
}

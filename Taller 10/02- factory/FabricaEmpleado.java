class FabricaEmpleado{
    public static Empleado crear(String linea){
        String[] d = linea.split(";");
        double a = Double.parseDouble(d[2]);
        switch(d[0])
            case "FIJO"
                return empleados.add(new EmpleadoFijo(d[1], a));
            case "HORAS"
                return empleados.add(new EmpleadoPorHoras(d[1], a, Double.parseDouble(d[3])));
            case "COMISION"
                return empleados.add(new EmpleadoPorComision(d[1], a, Double.parseDouble(d[3])));
            case "CONTRATISTA"
                return empleados.add(new EmpleadoPorComision(d[1], a));

            default: throw new IllegalArgumentException("Tipo de empleado no válido: " + d[0]);
}

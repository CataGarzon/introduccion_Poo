package principal;

public class empleado 
{
    private String cargo;
    private double valorHora;
    private double horasTrabajadas;
    private String departamento;
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(Double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
   
    public void calcularHonorarios()
    {

    }
    public void calcularHonorarios(Double _horasTrabajadas,Double _valorHora)
    {
        double resultado;
        horasTrabajadas = _horasTrabajadas;
        valorHora = _valorHora;

        resultado = horasTrabajadas* valorHora-0.966;
        System.out.println("los honorarios son: "+ resultado);
    
    }
    public void MostrarDatos()
    {
        System.out.println("el cargo es:"+getCargo());
        System.out.println("el valor de horas es: "+getValorHora());
        System.out.println("las horas trabajadas son: "+getHorasTrabajadas());
        System.out.println("el departamento es: "+getDepartamento());

    }
}

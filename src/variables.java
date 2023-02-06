import javax.swing.*;

public class variables {
    public static void main(String[] args) {
        //Declarando variabl
        int speed;
        //inicializamos una variable
        speed = 10;
        //imprimimos una variable
        System.out.println(speed);

        //creamos variables para llamar una funcion
        String employeeName = "Kevin";
        int salary = 1360;
        //llamamos a la funcion
        ImprimeSalario(employeeName, salary);

    }
    static void ImprimeSalario(String employeeName, int salary)
    {
        System.out.println("Salario del empleado " + employeeName + " es de $ " + salary);
    }
}


package employeeApp;

import employeeApp.model.Company;
import employeeApp.model.Employee;
import employeeApp.model.Healthplan;
import employeeApp.model.Plan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan plan1 = new Healthplan(1, "A Sigorta", Plan.ECO);
        Healthplan plan2 = new Healthplan(2, "B Sigorta", Plan.PRO);

        String[] healthplans = new String[3];
        healthplans[0] = plan1.getName();
        healthplans[1] = plan2.getName();

        Employee developer = new Employee(1,"Nergis Armağan", "armaganergis@gmail.com", "saçma",healthplans);
        developer.addHealthplan(0, "A Sigorta");
        System.out.println(developer);

        String[] developerNames = new String[5];
        developerNames[0] = developer.getFullname();
        Company company = new Company(1, "Workintech", 1500000000, developerNames );
        System.out.println(company);


    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}

package AIT4.Sidorenko.wdad.learn.xml;

public class TestXmlTask {
    public static void main(String[] args) {
        XmlTask xml = new XmlTask("srcAIT4Sidorenkowdadlearnxmlorganization.xml");
        for (int i = 0; i < xml.organization.size(); i++) {
            for (int j = 0; j < xml.organization.get(i).getEmplsList().size(); j++) {
                System.out.println(xml.organization.get(i).getEmplsList().get(j).getFirstname());
                System.out.println(xml.organization.get(i).getEmplsList().get(j).getSecondname());
                System.out.println(xml.organization.get(i).getEmplsList().get(j).getHiredate());
                System.out.println(xml.organization.get(i).getEmplsList().get(j).getSalary());
                System.out.println(xml.organization.get(i).getEmplsList().get(j).getJobtitle());

            }
            System.out.println("<<<<<<<< >>>>>>>>");
        }
int saLAver = xml.salaryAvarage();
        System.out.println("Средняя ЗП сотрудников: "+saLAver);

        int salAverDeraptm = xml.salaryAvarage("Avangers");
        System.out.println("Средняя ЗП сотрудников 1 состава: "+salAverDeraptm);
        System.out.println("Name"+xml.organization.get(1).getEmplsList().get(2).getFirstname());
        System.out.println("Old Jobtitle"+xml.organization.get(1).getEmplsList().get(2).getJobtitle());
        xml.setJobTitle("Piter","Parker","Assistants");
        System.out.println("Name"+xml.organization.get(1).getEmplsList().get(2).getFirstname());
        System.out.println("New Jobtitle"+xml.organization.get(1).getEmplsList().get(2).getJobtitle());

        System.out.println("Name"+xml.organization.get(0).getEmplsList().get(0).getFirstname());
        System.out.println("OldSalary"+xml.organization.get(0).getEmplsList().get(0).getSalary());
        xml.setSalary("Toni","Stark",1000000);
        System.out.println("Name"+xml.organization.get(0).getEmplsList().get(0).getFirstname());
        System.out.println("NewSalary"+xml.organization.get(0).getEmplsList().get(0).getSalary());

        System.out.println("Список отдела для увольнения: ");
        for (int j = 0; j < xml.organization.get(0).getEmplsList().size(); j++) {
            System.out.println(xml.organization.get(0).getEmplsList().get(j).getFirstname());
            System.out.println(xml.organization.get(0).getEmplsList().get(j).getSecondname());
            System.out.println(xml.organization.get(0).getEmplsList().get(j).getHiredate());
            System.out.println(xml.organization.get(0).getEmplsList().get(j).getSalary());
            System.out.println(xml.organization.get(0).getEmplsList().get(j).getJobtitle());
            System.out.println();
        }
        xml.fireEmployee("Steven","Rogers");
        System.out.println("Список отдела после увольнения: ");
        for (int j = 0; j < xml.organization.get(0).getEmplsList().size(); j++) {
            System.out.println(xml.organization.get(0).getEmplsList().get(j).getFirstname());
            System.out.println(xml.organization.get(0).getEmplsList().get(j).getSecondname());
            System.out.println(xml.organization.get(0).getEmplsList().get(j).getHiredate());
            System.out.println(xml.organization.get(0).getEmplsList().get(j).getSalary());
            System.out.println(xml.organization.get(0).getEmplsList().get(j).getJobtitle());
            System.out.println();
        }


    }
}
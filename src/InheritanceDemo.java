import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<Worker>();
        workers.add(new Worker("Patrick", "Star", "025841", "Mr.", 1999, 15));
        workers.add(new Worker("Spongebob", "Squarepants", "123785", "Mr.", 1997, 25));
        workers.add(new Worker("Squidward", "Tenticles", "456213", "Mr.", 1990, 10));
        workers.add(new SalaryWorker("Eugine", "Crabs", "000001", "Mr.", 1985, 0, 500000));
        workers.add(new SalaryWorker("Sandy", "Cheeks", "749621", "Ms.", 1997, 0, 120000));
        workers.add(new SalaryWorker("Larry", "The Lobster", "812444", "Mr.", 1989, 0, 60000));

        //40 Hour pay week
        System.out.println("Week 1: 40 Hours");
        System.out.println(String.format("||%25s | %8s||", "Formal Name", "Paid"));
        System.out.println("========================================");
        for (int i = 0; i < workers.size(); i++) {
            System.out.println(String.format("||%25s | %8s||", workers.get(i).formalName(), String.format("%.2f",workers.get(i).calculateWeeklyPay(40))));
        }

        System.out.println();
        System.out.println("Week 2: 50 Hours");
        System.out.println(String.format("||%25s | %8s||", "Formal Name", "Paid"));
        System.out.println("========================================");
        for (int i = 0; i < workers.size(); i++) {
            System.out.println(String.format("||%25s | %8s||", workers.get(i).formalName(), String.format("%.2f",workers.get(i).calculateWeeklyPay(50))));
        }

        System.out.println();
        System.out.println("Week 3: 40 Hours");
        System.out.println(String.format("||%25s | %8s||", "Formal Name", "Paid"));
        System.out.println("========================================");
        for (int i = 0; i < workers.size(); i++) {
            System.out.println(String.format("||%25s | %8s||", workers.get(i).formalName(), String.format("%.2f",workers.get(i).calculateWeeklyPay(40))));
        }
    }
}

package ob.pooCocheCrud;

public class Main {


    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();



        CocheCRUD honda = new CocheCRUDImpl("honda","vista", 2010, 4000);
        CocheCRUD chevrolet = new CocheCRUDImpl("chevolet","corsa", 2009, 1000);
        CocheCRUD nissan = new CocheCRUDImpl("nissan","tour", 2004, 3000);

        System.out.println(cocheCrud);
        System.out.println(honda);
        System.out.println(chevrolet);
        System.out.println(nissan);
    }

}

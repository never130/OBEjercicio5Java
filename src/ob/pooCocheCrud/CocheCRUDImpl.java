package ob.pooCocheCrud;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    String fabricante;
    String modelo;
    int year;
    int precio;

    public CocheCRUDImpl() {
    }

    public CocheCRUDImpl(String fabricante, String modelo, int year, int precio) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
    }


    @Override
    public void save() {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void delete() {

    }

    String save = "Guardando";
    String findAll = "Buscar todo";
    String delete = "Borrando";

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                ", precio=" + precio +
                ", save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}

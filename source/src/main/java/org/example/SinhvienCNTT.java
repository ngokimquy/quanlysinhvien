package org.example;

import java.awt.geom.RoundRectangle2D;

public class SinhvienCNTT extends  Sinhvien {


    private Double diemJava;
    private  Double diemWeb;

    public Double getDiemJava()
    {
        return  this.diemJava;
    }
    public void setDiemJava(Double diemJava){this.diemJava = diemJava;}
    public Double getDiemWeb(){return this.diemWeb;}
    public void setDiemWeb(Double diemWeb){this.diemWeb = diemWeb;}




    public SinhvienCNTT(String id, String ten, String gioitinh, String dienthoai, String ngaysinh, String diachi, String idLop,Double diemJava, Double diemWeb)
    {
        super(id, ten, gioitinh, dienthoai, ngaysinh, diachi, idLop);
        setDiemJava(diemJava);
        setDiemWeb(diemWeb);

    }


    @Override
    public String toString(){


        return super.toString() + " " + this.diemJava + " " +   this.diemWeb;
    }

    @Override
    public  Double tinhDiemtrungbinh()
    {
        return  8.8;
    }

}

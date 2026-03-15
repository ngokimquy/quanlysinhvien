package org.example;

import org.apache.commons.math3.analysis.function.Sinh;

public class Sinhvien {

    private String id;
    private String ten;
    private String gioitinh;
    private String dienthoai;
    private String ngaysinh;
    private String diachi;
    private String idLop;
    public static int soluong;


    public String getId()
    {
        return this.id;
    }
    public void setId(String id)    {
        this.id = id;
    }

    public String getTen()
    {
        return  this.ten;
    }

    public void setTen(String ten)
    {
        this.ten = ten;
    }

    public String getGioitinh()
    {
        return  this.gioitinh;
    }
    public void setGioitinh(String gioitinh){
        this.gioitinh = gioitinh;
    }

    public String getDienthoai()
    {
        return  this.dienthoai;
    }
    public void setDienthoai(String dienthoai){
        this.dienthoai = dienthoai;
    }

    public String getNgaysinh()
    {
        return  this.ngaysinh;
    }
    public void setNgaysinh(String ngaysinh)
    {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi()
    {
        return this.diachi;
    }

    public void setDiachi(String diachi)
    {
        this.diachi = diachi;
    }

    public String getIdLop()
    {
        return  this.idLop;
    }

    public void setIdLop(String idLop)
    {
        this.idLop = idLop;
    }
    public Sinhvien()
    {
        soluong++;
    }

    public Sinhvien(String id, String ten, String gioitinh, String dienthoai, String ngaysinh, String diachi, String idLop)
    {
      //  System.out.println("doi tuong da duoc khoi tao");
        setId(id);
        setTen(ten);
        setGioitinh(gioitinh);
        setDienthoai(dienthoai);
        setNgaysinh(ngaysinh);
        setDiachi(diachi);
        setIdLop(idLop);
        soluong++;
    }


    public String toString()
    {
        return this.id + "          "
                + this.ten + "            "
                + this.gioitinh + "          "
                + this.dienthoai + "          "
                + this.ngaysinh + "             "
                + this.diachi + "           "
                + this.idLop;
    }







}

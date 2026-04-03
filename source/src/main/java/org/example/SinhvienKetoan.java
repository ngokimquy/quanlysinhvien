package org.example;

import com.sun.source.util.SimpleTreeVisitor;
import org.apache.logging.log4j.core.impl.ReusableLogEventFactory;

public class SinhvienKetoan extends Sinhvien {



    private  Double diemMarketing;
    private  Double diemKetoan;

    public void   setDiemMarketing(Double diemMarketing) {this.diemMarketing = diemMarketing;}
    public Double getDiemMarketing(){return  this.diemMarketing;}
    public  void setDiemKetoan(Double diemKetoan){this.diemKetoan = diemKetoan;}
    public Double getDiemKetoan(){return this.diemKetoan;}

    public SinhvienKetoan(String id, String ten, String gioitinh, String dienthoai, String ngaysinh, String diachi, String idLop, Double diemKetoan, Double diemMarketing)
    {
        super(id, ten, gioitinh, dienthoai, ngaysinh, diachi, idLop);
        setDiemKetoan(diemKetoan);
        setDiemMarketing(diemMarketing);
    }


    public String toString()
    {
        return  super.toString() + " " + getDiemKetoan() + " " + getDiemMarketing() + " diem trung binh: " + this.tinhDiemtrungbinh();
    }

    @Override
    public  Double tinhDiemtrungbinh()
    {
        double diemtrungbinh;
        diemtrungbinh = (this.getDiemKetoan() + this.getDiemMarketing()) / 2;
        return  diemtrungbinh;

    }





}

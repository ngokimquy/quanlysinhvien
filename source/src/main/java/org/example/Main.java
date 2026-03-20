package org.example;
import org.apache.poi.ss.usermodel.*;


import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args ) {

        Sinhvien sv;
        ArrayList<Sinhvien> listSinhvien = new ArrayList();
        Scanner docBanphim = new Scanner(System.in  );


        while (true)
        {


            System.out.println("chao mung den voi chuong trinh quan ly sinhvien");
            System.out.println("1. hien thi danh sach sinh vien");
            System.out.println("2. them sinh vien bang thu cong");
            System.out.println("3. import data sinh vien tu file");
            System.out.println("4. thay doi thong tin sinh vien");
            System.out.println("5. xoa thong tin sinh vien");

            int luachon = Integer.valueOf(docBanphim.nextLine());

            switch (luachon)
            {
                case 1:  {
                    System.out.println("1. hien thi danh sach sinh vien");

                    if (listSinhvien.size() == 0)
                        System.out.println("danh sach khong co sinh vien");
                    else
                        for (Sinhvien x : listSinhvien)
                        {
                            System.out.println(x.toString());
                        }


                    break;
                }

                case 2:  {
                    System.out.println("2. them sinh vien bang thu cong");

                    System.out.println("vui long nhap id: ");
                    String id = docBanphim.nextLine();
                    System.out.println("ten: ");
                    String ten = docBanphim.nextLine();
                    System.out.println("gioitinh: ");
                    String gioitinh = docBanphim.nextLine();
                    System.out.println("dienthoai: ");
                    String dienthoai = docBanphim.nextLine();
                    System.out.println("ngaysinh: ");
                    String ngaysinh = docBanphim.nextLine();
                    System.out.println("diachi: ");
                    String diachi = docBanphim.nextLine();
                    System.out.println("idlop: ");
                    String idLop = docBanphim.nextLine();

                    sv = new Sinhvien(id,ten,gioitinh,dienthoai,ngaysinh,diachi,idLop);
                    listSinhvien.add(sv);


                    break;
                }

                case 3:  {
                    System.out.println("3. Import sinh vien tu fiel excel");

                    DataFormatter formatter = new DataFormatter();
                    int soluongImport =0;
                    System.out.println("Thư mục hiện tại: " + new File(".").getAbsolutePath());


                    try (Workbook workbook = WorkbookFactory.create(new File("source/src/main/java/org/example/datasinhvien.xlsx"))) {
                        Sheet sheet = workbook.getSheetAt(0);

                        for (Row row : sheet) {
                            // Bỏ qua dòng tiêu đề (nếu có) bằng cách kiểm tra index
                            if (row.getRowNum() == 0) continue;

                            // Đọc dữ liệu từng cột bằng DataFormatter
                            String id = formatter.formatCellValue(row.getCell(0));
                            String ten = formatter.formatCellValue(row.getCell(1));
                            String gioitinh = formatter.formatCellValue(row.getCell(2));
                            String dienthoai = formatter.formatCellValue(row.getCell(3));
                            String ngaysinh = formatter.formatCellValue(row.getCell(4));
                            String diachi = formatter.formatCellValue(row.getCell(5));
                            String idLop = formatter.formatCellValue(row.getCell(6));




                            sv = new Sinhvien(id, ten, gioitinh,dienthoai,ngaysinh,diachi,idLop);
                            //     System.out.println(sv.toString());
                            listSinhvien.add(sv);
                            soluongImport++;
                            if (soluongImport >30)
                                break;


                            // Kiểm tra nếu dòng không trống thì mới tạo đối tượng

                        }

                        // In danh sách sau khi đọc xong để kiểm tra


                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;
                }

                case 4:  {
                    System.out.println("4. thay doi thong tin sinh vien: ");
                    System.out.println("nhap thong tin id: ");
                    String idSinhvien = docBanphim.nextLine();

                    for (Sinhvien x: listSinhvien)
                    {
                        if (x.getId().equals(idSinhvien))
                        {
                            System.out.println("thong tin sinh vien nhu sau: ");
                            System.out.println(x.toString());

                            System.out.println("vui long cap nhat lai thong tin ten: ");
                            String tenSinhvien = docBanphim.nextLine();
                            x.setTen(tenSinhvien);
                            System.out.println("thong tin sinh vien da duoc cap nhat: ");
                            System.out.println(x.toString());


                            break;
                        }
                    }



                    break;
                }

                case 5:  {
                    System.out.println("5. xoa thong tin sinh vien");

                    System.out.println("nhap id sinh vien");
                    String idSinhvien = docBanphim.nextLine();
                    for (Sinhvien x: listSinhvien)
                    {

                        if (x.getId().equals(idSinhvien))
                        {
                            System.out.println("da tim thay thong tin sinh vien");

                        }
                    }

                    break;
                }

            }

            System.out.println(" ");


        }

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.












    }
}

# TH2 - Nhom12
I. Các thành viên trong nhóm :

    Phạm Anh Khiêm - B18DCCN314
    Minh Quân - B18DCAT192
    Lê Quốc Trị - B19DCCN690

II. Quá trình hoàn thiện bài thực hành :

1, Code giao diện và hoàn thành cấu hình project - Người thực hiện : Phạm Anh Khiêm

  - Giao diện sử dụng Bootstrap 4 
  - Cấu hình project sử dụng ide Spring Tool Suite 4 
  - Cơ sở dữ liệu sử dụng Postgresql
  - Sử dụng ORM - Spring data jpa truy vấn dữ liệu trong database

2, Code thực thể và các Service Layer trong project - Người thực hiện : Minh Quân

  - Code thực thể Product : Sử dụgn Spring data jpa để ánh xạ thực thể với database
  - Code Service layer : Sử dụng Spring data Jpa để code các chức năng dịch vụ thao tác với dữ liệu CRUD (Thêm, Đọc, Sửa, Xóa)

3, Code Controller layer và hoàn thiện bài thực hành - Người thực hiện : Lê Quôc Trị

  - Code Controller Layer : 
    + Sử dụng các mapping URL trong spring để ánh xạ xác đường dẫn (@RequestMapping, @GetMapping, @PostMapping)
    + Sử dụng tầng Service ở 2.2 để truy vấn dữ liệu gửi lên tầng giao diện và cập nhật dữ liệu trong database
    + Sử dụng thymeleaf và ui.model trong spring để hiển thị dữ liệu trên giao diện và lấy dữ liệu từ giao diện về
  
  - Hoàn thiện bài thực hành :
    + Fix các lỗi sót trong bài thực hành
    + Đẩy code lên github.

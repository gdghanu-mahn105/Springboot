public class SpringOverview {
    /*
- Spring framework là một java framework để phát triển các ứng dụng java
- mã nguồn mở mạnh mẽ và được ưa chuộng
- mục tiêu: đơn giản hoá quá trình phát triển, giúp lập trình viên java xây dựng ứng dụng dễ bảo trì
            dễ kiểm thử và có tính module hoá cao (mỗi phần, module có nhiệm vụ chức năng cụ thể rõ ràng)
===sự ra đời===
- năm 2002-2003, khởi nguồn từ ý tưởng của Rod Johnson
- vào thời điểm các ứng dụng doanh nghiệp với Enterprise JavaBeans(EJB) 2.x bị xem là phức tạp, nặng nề, cấu hình rườm rà
-> spring ra đời như một giải pháp thay thế nhẹ nhàng, linh hoạt hơn tập trung vào việc sử dụng các đối tượng java đơn giản (POJO- plain Old Java Object)
để giải quyết các vấn đề của EJB 2.x và đơn giản hoá việc phát triển ứng dụng Java EE

=== Spring Framework===
1. là một Framework ứng dụng: Spring cung cấp một bộ công cụ, thư viện và cấu trúc nền tảng phong phú để xây dựng ứng dụng java một cách có hệ thống
định nghĩa, cung cấp các giải pháp có sẵn cho các vấn đề phổ biến trong phát triển phần mềm(truy cập dữ liệu, quản lí giao dịch, web request....)
2. là một IoC container: trái tim của Spring. thay vì lập trình viên tự tạo quản lí các đối tượng(beans) và mối quan hệ giữa chung,
                        Spring container sẽ dẩm nhận việc này (Inversion of Control). nó tiêm(inject) các đối tượng phụ thuộc vào đối tượng cần chúng
                        (Dependency Injection-DI). điều này giúp giảm sự kết dính giữa các thành phần => code dễ quản lý, mở rộng, kiểm thử (testable)

=== các trường hợp sử dụng Spring phổ biến===
- hệ sinh thái rộng, spring được ứng dụng hầu hết trong mọi lĩnh vực phát triển java hiện đại:
- xây dựng ứng dụng web và RESTful APIs: đây là ứng dụng phổ biến nhất, sử dụng module như Spring MVC hoặc Spring WebFlux...
- Phát triển kiến trúc Microservices: Spring boot và Spring Cloud cung ấp một công cụ cực kỳ mạnh mẽ để xây dựng, cấu hình, và quản lí các microservices
- truy cập dữ liệu: Spring đơn giản hoá việc tương tác với nhiều loại cở sở dữ liệu cả SQL và NoSQL
- Bảo mật ứng dụng: Spring security là giải pháp hàng đầu xử lí xác thực(authentication) và phân quyền(authorization)
- xử lí tác vụ nền và Batch processing: Spring Batch cung cấp một framework mạnh mẽ để xây dựng các ứng dụng xử lí dữ liệu lớn theo lô
- Tích hợp hệ thống: Spring Integration
- Phát triển ứng dụng Cloud-Native: spring dễ dàng triển khai trên các nền tảng đám mây

=== Ưu điểm ===
- Giảm sự phụ thuộc (Loose Coupling): nhờ cơ chế Dependency Injection(DI)
- lập trình hướng khía cạnh (AOP): giúp tách biệt các mói quan tâm chung (Logging, security, transaction)
- đơn giản hoá: cung cấp các template-> giảm mã lặp
- tăng khả năng kiểm thử (testablity): code ít phụ thuộc giúp viết Unit test dễ dàng hơn.
- tính module hoá: cho phép chọn lựa và sử dụng những phần cần thiết
- hệ sinh thái phong phú: các module trong spring framework
- tích hợp mạnh mẽ: dễ dàng kết hợp với các công nghệ và framework khác
- cộng đồng lớn và tài liệu tốt
=== Nhược điểm ===
- phức tạp cho người mới: hệ sinh thái lớn, nhiều khái niệm, khos khăn cho người mới bắt đầu
- cấu hình phức tạp(trước Spring Boot)
- khó gỡ lỗi trong một số trường hợp
- overhead tiềm ẩn: ứng dụng cực kì nhỏ và đơn giản, việc dùng Spring có thể mang lại một chút overhead không cần
thiết về tài nguyên và kích thước gói triển khia.

===== Các khai niệm cốt lõi của SPRING FRAMEWORK ====


     */
}
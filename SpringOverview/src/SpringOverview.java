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

----- INVERSION OF CONTROL (IoC) Container
+) nguyên tắc thiết kế cốt lõi, thành phần trung tâm của Spring Framework
+) thay vì tự tay tạo và quản lí vòng đời (tạo, cấu hình, liên kết, huỷ) cyar các objects trong ứng dụng bạn giao phó trách nghiệm này cho một thực
    thể bên ngoài => Spring Ioc Container.
    nó sẽ đọc thông tin cấu hình(configuration metadata) và dựa vào đó để khởi tạo, cấu hình và lắp ráp các đối tượng
    (Spring Beans). => inversion of Control -> giảm sự phụ thuộc giữa các thành phần trong ứng dụng
+) các loại container: 2 loại chính
    -) BeanFactory: cơ bản nhất, cung cấp các chức năng cốt lõi cảu Ioc và DI. trong môi trường có tài nguyên hạn chế
       sử dụng cơ chế tạo lười(lazy initialization), tức là bean chỉ được tạo khi yêu cầu lần đầu
    -) ApplicationContext: là một interface kế thừa từ BeanFactory, cung cấp nheiefu tính năng nâng cao hơn
        event publication, AOP, quốc tế hoá i18n, dễ dàng tích hợp các dịch vụ khác của spring
        - thường tạo các bean singleton ngay khi container khởi động (eager initializtion).

----- Dependency Injection (DI)
- DI là một mô hình thiết kế (design pattern) cụ thể để hiện thực hoá nguyên tác IoC
    -) cách hoạt động: thay vì một đối tượng tự tìm kiếm hoặc tạo ra các đối tượng khác mà nó cần (gọi là dependencies)
     IoC Container sẽ chủ động inject các dependecies này vào đối tượng khi nó được tạo ra.
     tức là các đối tượng không tự lo việc tạo dependencies của mình, mà được cung cấp từ bên ngoài (bởi Container)
    -) Các kiểu DI phổ biến:
        =) Constructor Injection: Dependencies được cung cấp thông qua constuctor của lớp.
            là cách được khuyến nghị vì đảm bảo đối tượng luôn có đủ dependencies cần thiết
            ngay khi được tạo ra và giúp tạo các đối tượng immutable
        =) Setter Injection: dependencies được tiêm thong qua các phương thức setter của lớp. các này linh hoạt hơn,
               cho phép thay đổi dependency sau khi đối tượng được tạo, nhưng không đảm bảo dependency luôn tồn tại.
        =) Interface Injection: Dependencies được tiêm thông qua cài đặt một interface định nghĩa phươgn thức inject. ít sử dụng trong Spring

----- Spring Beans
    - Trong ngữ cảnh của Spring, Beans là các đối tượng jaa thông thường (POJOs) nhưng được khởi tạo, lắp ráp quản lí dòng đời bởi
    Spring IoC Container, chính là các thành phần cấu tạo nên ứng dụng
    - Bean Scopes(phạm vi của Bean): định nghĩa vòng đời, khả năng hiển thị của một bean trong container
    - Các Scope phổ biến:
            =) Singleton(Mặc đinh): chỉ có một instance duy nhất của bean được tạo ra cho mỗi IoC Container.
                mọi yêu cầu đến bean này đều trả về cùng một instance
            =) Prototype: mỗi khi có yêu cầu lấy Bean từ container, một instance mới sẽ được tạo ra
                Container tạo và cấu hình bean, nhưng khong quản lí toàn bộ vòng đời của nó sau đó
            =) Request (ưng dụng web): một thể hiện bean mới được tạo ra cho mỗi HTTP request
            =) Session (ừng dụng web): một thể hiện bean mới được tạo ra cho mỗi HTTP sesstion
            =) Application (ứng dụng web): một thể hiện bean duy nhất được tạo cho toàn bộ vòng đời của ServletContext
            =) một số scope tuỳ chỉnh

------ Configuration Metadata
        Siêu dữ liệu cấu hình
        - là cách để 'chỉ dẫn' cho Sring IoC container biết cần tạo những bean nào, thuộc lớp nào,
            có nhưng dependecies gì, quản lí như thế nào
        - các hình thức cấu hình:
            =) XML- base configuration: l cách cấu hình truyền thống, sử dụng các file XML để định nghĩa
            bean và dependencies(<bean>,<property>,<Constructor-arg>). dễ đọc với cấu trúc rõ ràng
            nhưng có thể trở nên dài dòng
            =) Annotation-based configuration: dử dụng các annotation trực tiếp trong mã nguồn java
            để đánh dấu các lơớp là bean (@Component, @Service, @Repository, @Controller), đánh dấu
            các dependencies cần tiêm(@Autowired), và cấu hình khác (@Scope, @Qualifier).
            => cách ngắn gọn gần gũi với code hơn
            =) Java-based configuration(JavaConfig): sử dụng các lớp java và annotation (@Configuration, @Bean)
            để định nghĩa cấu hình cách này cung cấp sự an toàn kiểu (Type safety), khả năng tái cáu trúc tốt hơn so với XML
            đang ngày càng phổ biến đặc biệt với Spring Boot.

------ Aspect-Oriented Programming (AOP)
        - là một mô hình lập trình bổ sung cho Lập trình hướng đối tượng(OOP), giúp giải quyết các mối quan tâm
        xuyên suốt(Cross-cutting concerns). Đây là chức năng cần được áp dụng cho nhiều phầ khác nhau trong ứng dụng
        nhưng không thuộc về logic nghiệp vụ cốt lõi của các phần đó (vd: logging, security, transcation, management, caching)
        - Mục tiêu: cho phép bạn tách biệt các cross-cutting concerns này ra khỏi logic nghiệp vụ chính, giúp mã nguồn sạch sẽ, dễ bảo trì và module hoá hơn

     */
}
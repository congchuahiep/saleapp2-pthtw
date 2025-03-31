1. Thiết lập Tomcat Server
2. Tạo tệp `database.properites` trong thư mục `src/main/resources/`
và điền những thông tin sau
```
hibernate.dialect=org.hibernate.dialect.MySQLDialect
hibernate.showSql=true
hibernate.connection.driverClass=com.mysql.cj.jdbc.Driver
hibernate.connection.url=jdbc:mysql://localhost:3306/saledb
hibernate.connection.username=
hibernate.connection.password=
```

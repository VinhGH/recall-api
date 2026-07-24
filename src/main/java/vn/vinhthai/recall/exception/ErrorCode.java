package vn.vinhthai.recall.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public enum ErrorCode {

    UNCATEGORIZED_EXCEPTION(9999, "Lỗi hệ thống chưa được phân loại", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY(1001, "Mã lỗi không hợp lệ", HttpStatus.BAD_REQUEST),


    INVALID_INPUT(1010, "Dữ liệu đầu vào không hợp lệ", HttpStatus.BAD_REQUEST),


    USER_NOT_FOUND(1020, "Không tìm thấy người dùng trong hệ thống", HttpStatus.NOT_FOUND),
    EMAIL_ALREADY_EXISTS(1021, "Email này đã được đăng ký", HttpStatus.BAD_REQUEST),
    INVALID_CREDENTIALS(1022, "Email hoặc mật khẩu không chính xác", HttpStatus.UNAUTHORIZED),
    UNAUTHENTICATED(1023, "Chưa đăng nhập hoặc Token không hợp lệ", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(1024, "Bạn không có quyền truy cập tài nguyên này", HttpStatus.FORBIDDEN);

    private final int code;
    private final String message;
    private final HttpStatusCode statusCode;

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatusCode getStatusCode() {
        return statusCode;
    }
}

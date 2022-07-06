package responses;

import entity.Cookie;

public class LoginResponse {
    private String msg;
    private Cookie cookie;

    public LoginResponse(String msg, Cookie cookie) {
        this.msg = msg;
        this.cookie = cookie;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Cookie getCookie() {
        return cookie;
    }

    public void setCookie(Cookie cookie) {
        this.cookie = cookie;
    }
}

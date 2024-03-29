package repository;

import database.Database;
import entity.Cookie;
import security.CookieGenerator;

public class CookieRepository {
    private final Database database = Database.getInstance();
    public CookieGenerator cookieGenerator;

    public void addCookie (int userId) {
        Cookie cookie = cookieGenerator.generateCookie(userId);
        database.cookies.add(cookie);
    }

    public Cookie getCookie (int userId) {
        for (Cookie cookie : database.cookies) {
            if (cookie.getUserId() == userId) {
                return cookie;
            }
        }
        return null;
    }

    public boolean checkCookie (Cookie cookie) {
        if (database.cookies.contains(cookie)) {
            return true;
        }
        return false;
    }
}

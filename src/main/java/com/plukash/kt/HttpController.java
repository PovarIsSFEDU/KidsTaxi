package com.plukash.kt;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class HttpController extends HttpServlet {

    @RequestMapping(method = RequestMethod.GET, value = {"/", "/login"})
    public String Start(@CookieValue(value = "Authenticated", required = false) Cookie auth) {
        try {
            if (auth != null) {
                return "user-page";
            } else {
                return "login-page";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error";
        }
    }

    @PostMapping(value = {"/checkLogIn", "/checkSignUp"})
    public void Checker(HttpServletRequest request, HttpServletResponse response) {
        //TODO Если аутентификация прошла успешно - добавляем куки, редиректим на основную страницу
    }


    @PostMapping(value = "/exit")
    public String Exit(@CookieValue(value = "Authenticated", required = false) Cookie auth, HttpServletRequest request, HttpServletResponse response) {
        //Todo Смена статуса входа у пользователя
        return "login-page";
    }

    @GetMapping(value = {"/timetable", "/calendar"})
    //TODO Календарь проверяет, какой человек перед ним - обычный или админ.
    public String Calendar(HttpServletRequest request) {
        return "calendar-page";
    }


    @GetMapping(value = "error")
    public String Error() {
        return null;
    }


    //TODO Страница поездки (Всплывающее окно)
    //TODO Страница создания поездки (Всплывающее окно)
    //TODO Страница профиля (Всплывающее окно)
    //TODO Расписание влияет на excel-таблицу, админы могут ее проверять (MVC тот же самый, разница достигается с помощью Apache freemarker)


    //1 вариант - сообщение на номер от бота
    //2 вариант - мобильное приложение с уведомлением


    //TODO Страница рассчета поездки


}

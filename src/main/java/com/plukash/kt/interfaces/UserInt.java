package com.plukash.kt.interfaces;

import com.plukash.kt.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInt extends JpaRepository<User, Integer> {
    //Todo SQL-queries.

    /*
    1) GetAll() -> List<User>
    2) Modify() -> Boolean/Integer : Изменение пользователя (ФИО, даты, т.д)
    3) CheckMoney() -> Проверка, сколько денег осталось в резерве
    4) AddMoney()
    5) ReplaceMoney()
    6) NewUser()
     */
}

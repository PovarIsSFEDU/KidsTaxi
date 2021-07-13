package com.plukash.kt.interfaces;

import com.plukash.kt.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderInt extends JpaRepository<Order, Integer> {
    //Todo SQL-queries.
    /*
    1) GetAll() -> List<Order>
    2) ChangeByID(int id) = reloads with time/place/etc. -> Boolean/Integer code (Success)
    3) NewOrder()
    4) CloseTrip() -> Завершение поездки
     */
}

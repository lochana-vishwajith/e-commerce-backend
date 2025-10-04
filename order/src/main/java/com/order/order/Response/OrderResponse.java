package com.order.order.Response;

import com.order.order.Model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {
    private Order data;
    private HttpStatus status;


    public void setData(Order data) {
        this.data = data;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderResponse{Order : " + data.toString() + " status : " + status + "}";
    }
}

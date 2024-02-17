package com.app.emailservicce.event;



import com.app.emailservicce.dto.OrderDto;
import com.app.emailservicce.event.enums.EventStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
@Data
public class OrderEvent implements Serializable {

    private String message;
    private EventStatus eventStatus;
    private OrderDto order;
    private String id;
}

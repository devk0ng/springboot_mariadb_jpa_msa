package net.devkong.api.order.domain;

import lombok.Data;
import net.devkong.api.item.domain.Item;
import net.devkong.api.user.domain.User;

import javax.persistence.*;

@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id @Column(name = "order_id")
    private Long orderId;

    @Column(name = "price")
    private Long price;

    @Column(name = "order_status")
    private String count;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;
}

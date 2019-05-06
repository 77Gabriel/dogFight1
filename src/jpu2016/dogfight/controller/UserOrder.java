package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder {

    private int player;
    private Order order;

    public UserOrder(Order order, int player) {
        this.order = order;
        this.player = player;
    }

    public int getPlayer() {
        return player;
    }

    public Order getOrder() {
        return order;
    }
}



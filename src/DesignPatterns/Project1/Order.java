package DesignPatterns.Project1;

import java.util.List;

class Order {
    private String restaurant;
    private List<String> items;
    private String deliveryType;
    private boolean addCutlery;
    private boolean addInstructions;

    private Order(OrderBuilder builder) {
        this.restaurant = builder.restaurant;
        this.items = builder.items;
        this.deliveryType = builder.deliveryType;
        this.addCutlery = builder.addCutlery;
        this.addInstructions = builder.addInstructions;
    }

    public static class OrderBuilder {
        private String restaurant;
        private List<String> items;
        private String deliveryType;
        private boolean addCutlery;
        private boolean addInstructions;

        public OrderBuilder restaurant(String r) {
            this.restaurant = r;
            return this;
        }

        public OrderBuilder items(List<String> i) {
            this.items = i;
            return this;
        }

        public OrderBuilder deliveryType(String d) {
            this.deliveryType = d;
            return this;
        }

        public OrderBuilder addCutlery(boolean v) {
            this.addCutlery = v;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}


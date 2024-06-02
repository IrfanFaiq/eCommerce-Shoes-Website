package com.springProject.shooz.controller;

import com.springProject.shooz.entity.OrderItem;
import com.springProject.shooz.service.CartService;
import com.springProject.shooz.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CartController {


    //for cart service controller
    @Autowired
    private CartService cartService;

    @GetMapping("/cart")
    public String showCart(Model model){

        int orderId = 4; // This should be retrieved dynamically, e.g., from the logged-in user session
        List<OrderItem> orderItems = cartService.getOrderItemsByOrderId(orderId);
        model.addAttribute("orderItems", orderItems);

        return "cart";  // This should match the name of your Thymeleaf template (cart.html)
    }

    //for orderHistory service controller
    @Autowired
    private OrderService orderService;

    @GetMapping("/orderHistory")
    public String showOrderHistory(Model model) {

//        List<Order> orders = orderService.getAllOrders();
//        model.addAttribute("orders", orders);
//        return "orderHistory";  // This should match the name of your Thymeleaf template (orderHistory.html)

        int orderId = 4; // This should be retrieved dynamically, e.g., from the logged-in user session
//        int userId = 1; // This should be retrieved dynamically, e.g., from the logged-in user session
        List<OrderItem> orderItems = orderService.getOrderItemsByOrderId(orderId);
//        List<Order> orders = orderService.getAllOrdersByUserId(userId);
        model.addAttribute("orders", orderItems);
//        model.addAttribute("orders", orders);

        return "orderHistory";
    }

    @GetMapping("/checkout")
    public String showCheckoutPage() {
        return "checkout";  // This should match the name of your Thymeleaf template (checkout.html)
    }

    @GetMapping("/index")
    public String homePage() {
        return "index";  // This should match the name of your Thymeleaf template (index.html)
    }

}
